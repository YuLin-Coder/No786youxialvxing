package com.controller;


import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

import com.entity.LvxingsheEntity;
import com.service.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.LvxingtuanOrderEntity;

import com.entity.view.LvxingtuanOrderView;
import com.entity.LvxingtuanEntity;
import com.entity.YonghuEntity;

import com.utils.PageUtils;
import com.utils.R;

/**
 * 旅行团订单
 * 后端接口
 * @author
 * @email
 * @date 2021-04-15
*/
@RestController
@Controller
@RequestMapping("/lvxingtuanOrder")
public class LvxingtuanOrderController {
    private static final Logger logger = LoggerFactory.getLogger(LvxingtuanOrderController.class);

    @Autowired
    private LvxingtuanOrderService lvxingtuanOrderService;


    @Autowired
    private LvxingsheService lvxingsheService;
    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service
    @Autowired
    private LvxingtuanService lvxingtuanService;
    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }if(StringUtil.isNotEmpty(role) && "旅行社".equals(role)){
            params.put("lvxingsheId",request.getSession().getAttribute("userId"));
        }
        params.put("orderBy","id");
        PageUtils page = lvxingtuanOrderService.queryPage(params);

        //字典表数据转换
        List<LvxingtuanOrderView> list =(List<LvxingtuanOrderView>)page.getList();
        for(LvxingtuanOrderView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        LvxingtuanOrderEntity lvxingtuanOrder = lvxingtuanOrderService.selectById(id);
        if(lvxingtuanOrder !=null){
            //entity转view
            LvxingtuanOrderView view = new LvxingtuanOrderView();
            BeanUtils.copyProperties( lvxingtuanOrder , view );//把实体数据重构到view中

            //级联表
            LvxingtuanEntity lvxingtuan = lvxingtuanService.selectById(lvxingtuanOrder.getLvxingtuanId());
            if(lvxingtuan != null){
                BeanUtils.copyProperties( lvxingtuan , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setLvxingtuanId(lvxingtuan.getId());
            }
            //级联表
            YonghuEntity yonghu = yonghuService.selectById(lvxingtuanOrder.getYonghuId());
            if(yonghu != null){
                BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setYonghuId(yonghu.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody LvxingtuanOrderEntity lvxingtuanOrder, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,lvxingtuanOrder:{}",this.getClass().getName(),lvxingtuanOrder.toString());
        lvxingtuanOrder.setInsertTime(new Date());
        lvxingtuanOrder.setCreateTime(new Date());
        lvxingtuanOrderService.insert(lvxingtuanOrder);
        return R.ok();
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody LvxingtuanOrderEntity lvxingtuanOrder, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,lvxingtuanOrder:{}",this.getClass().getName(),lvxingtuanOrder.toString());
        lvxingtuanOrderService.updateById(lvxingtuanOrder);//根据id更新
        return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        lvxingtuanOrderService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }



    /**
    * 前端列表
    */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }if(StringUtil.isNotEmpty(role) && "旅行社".equals(role)){
            params.put("lvxingsheId",request.getSession().getAttribute("userId"));
        }
        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = lvxingtuanOrderService.queryPage(params);

        //字典表数据转换
        List<LvxingtuanOrderView> list =(List<LvxingtuanOrderView>)page.getList();
        for(LvxingtuanOrderView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        LvxingtuanOrderEntity lvxingtuanOrder = lvxingtuanOrderService.selectById(id);
            if(lvxingtuanOrder !=null){
                //entity转view
        LvxingtuanOrderView view = new LvxingtuanOrderView();
                BeanUtils.copyProperties( lvxingtuanOrder , view );//把实体数据重构到view中

                //级联表
                    LvxingtuanEntity lvxingtuan = lvxingtuanService.selectById(lvxingtuanOrder.getLvxingtuanId());
                if(lvxingtuan != null){
                    BeanUtils.copyProperties( lvxingtuan , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setLvxingtuanId(lvxingtuan.getId());
                }
                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(lvxingtuanOrder.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody LvxingtuanOrderEntity lvxingtuanOrder, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,lvxingtuanOrder:{}",this.getClass().getName(),lvxingtuanOrder.toString());
        lvxingtuanOrder.setInsertTime(new Date());
        lvxingtuanOrder.setCreateTime(new Date());
        LvxingtuanEntity lvxingtuan = lvxingtuanService.selectById(lvxingtuanOrder.getLvxingtuanId());
        YonghuEntity yonghu = yonghuService.selectById((Integer) request.getSession().getAttribute("userId"));
        if(lvxingtuan.getLvxingtuanMoney() > yonghu.getNewMoney()){
            return R.error("余额不足请充值");
        }
        yonghu.setNewMoney(yonghu.getNewMoney()-lvxingtuan.getLvxingtuanMoney());
        yonghuService.updateById(yonghu);
        LvxingsheEntity lvxingshe = lvxingsheService.selectById(lvxingtuan.getLvxingsheId());
        lvxingshe.setNewMoney(lvxingshe.getNewMoney()+lvxingtuan.getLvxingtuanMoney());
        lvxingsheService.updateById(lvxingshe);
        lvxingtuanOrderService.insert(lvxingtuanOrder);
        return R.ok();
    }


}


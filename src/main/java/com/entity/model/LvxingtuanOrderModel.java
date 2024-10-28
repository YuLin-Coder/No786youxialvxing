package com.entity.model;

import com.entity.LvxingtuanOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 旅行团订单
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-15
 */
public class LvxingtuanOrderModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 旅行团id
     */
    private Integer lvxingtuanId;


    /**
     * 用户id
     */
    private Integer yonghuId;


    /**
     * 开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date lvxingtuanOrderStartTime;


    /**
     * 结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date lvxingtuanOrderEndTime;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：旅行团id
	 */
    public Integer getLvxingtuanId() {
        return lvxingtuanId;
    }


    /**
	 * 设置：旅行团id
	 */
    public void setLvxingtuanId(Integer lvxingtuanId) {
        this.lvxingtuanId = lvxingtuanId;
    }
    /**
	 * 获取：用户id
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户id
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：开始时间
	 */
    public Date getLvxingtuanOrderStartTime() {
        return lvxingtuanOrderStartTime;
    }


    /**
	 * 设置：开始时间
	 */
    public void setLvxingtuanOrderStartTime(Date lvxingtuanOrderStartTime) {
        this.lvxingtuanOrderStartTime = lvxingtuanOrderStartTime;
    }
    /**
	 * 获取：结束时间
	 */
    public Date getLvxingtuanOrderEndTime() {
        return lvxingtuanOrderEndTime;
    }


    /**
	 * 设置：结束时间
	 */
    public void setLvxingtuanOrderEndTime(Date lvxingtuanOrderEndTime) {
        this.lvxingtuanOrderEndTime = lvxingtuanOrderEndTime;
    }
    /**
	 * 获取：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：订单创建时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }

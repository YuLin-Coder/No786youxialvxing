package com.entity.model;

import com.entity.ShangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 商品信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-15
 */
public class ShangpinModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 商品名称
     */
    private Integer shangpinName;


    /**
     * 商品图片
     */
    private String shangpinPhoto;


    /**
     * 商品类型
     */
    private Integer shangpinTypes;


    /**
     * 商品价格
     */
    private String shangpinMoney;


    /**
     * 商品详情
     */
    private String shangpinContent;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：商品名称
	 */
    public Integer getShangpinName() {
        return shangpinName;
    }


    /**
	 * 设置：商品名称
	 */
    public void setShangpinName(Integer shangpinName) {
        this.shangpinName = shangpinName;
    }
    /**
	 * 获取：商品图片
	 */
    public String getShangpinPhoto() {
        return shangpinPhoto;
    }


    /**
	 * 设置：商品图片
	 */
    public void setShangpinPhoto(String shangpinPhoto) {
        this.shangpinPhoto = shangpinPhoto;
    }
    /**
	 * 获取：商品类型
	 */
    public Integer getShangpinTypes() {
        return shangpinTypes;
    }


    /**
	 * 设置：商品类型
	 */
    public void setShangpinTypes(Integer shangpinTypes) {
        this.shangpinTypes = shangpinTypes;
    }
    /**
	 * 获取：商品价格
	 */
    public String getShangpinMoney() {
        return shangpinMoney;
    }


    /**
	 * 设置：商品价格
	 */
    public void setShangpinMoney(String shangpinMoney) {
        this.shangpinMoney = shangpinMoney;
    }
    /**
	 * 获取：商品详情
	 */
    public String getShangpinContent() {
        return shangpinContent;
    }


    /**
	 * 设置：商品详情
	 */
    public void setShangpinContent(String shangpinContent) {
        this.shangpinContent = shangpinContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }

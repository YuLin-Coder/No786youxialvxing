package com.entity.model;

import com.entity.ChepiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 车票
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-14
 */
public class ChepiaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 班车
     */
    private String chepiaoName;


    /**
     * 车票类型
     */
    private Integer chepiaoTypes;


    /**
     * 出发地
     */
    private String chepiaoChufadi;


    /**
     * 目的地
     */
    private String chepiaoMudidi;


    /**
     * 照片
     */
    private String chepiaoPhoto;


    /**
     * 票价
     */
    private Double chepiaoMoney;


    /**
     * 车票详情
     */
    private String chepiaoContent;


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
	 * 获取：班车
	 */
    public String getChepiaoName() {
        return chepiaoName;
    }


    /**
	 * 设置：班车
	 */
    public void setChepiaoName(String chepiaoName) {
        this.chepiaoName = chepiaoName;
    }
    /**
	 * 获取：车票类型
	 */
    public Integer getChepiaoTypes() {
        return chepiaoTypes;
    }


    /**
	 * 设置：车票类型
	 */
    public void setChepiaoTypes(Integer chepiaoTypes) {
        this.chepiaoTypes = chepiaoTypes;
    }
    /**
	 * 获取：出发地
	 */
    public String getChepiaoChufadi() {
        return chepiaoChufadi;
    }


    /**
	 * 设置：出发地
	 */
    public void setChepiaoChufadi(String chepiaoChufadi) {
        this.chepiaoChufadi = chepiaoChufadi;
    }
    /**
	 * 获取：目的地
	 */
    public String getChepiaoMudidi() {
        return chepiaoMudidi;
    }


    /**
	 * 设置：目的地
	 */
    public void setChepiaoMudidi(String chepiaoMudidi) {
        this.chepiaoMudidi = chepiaoMudidi;
    }
    /**
	 * 获取：照片
	 */
    public String getChepiaoPhoto() {
        return chepiaoPhoto;
    }


    /**
	 * 设置：照片
	 */
    public void setChepiaoPhoto(String chepiaoPhoto) {
        this.chepiaoPhoto = chepiaoPhoto;
    }
    /**
	 * 获取：票价
	 */
    public Double getChepiaoMoney() {
        return chepiaoMoney;
    }


    /**
	 * 设置：票价
	 */
    public void setChepiaoMoney(Double chepiaoMoney) {
        this.chepiaoMoney = chepiaoMoney;
    }
    /**
	 * 获取：车票详情
	 */
    public String getChepiaoContent() {
        return chepiaoContent;
    }


    /**
	 * 设置：车票详情
	 */
    public void setChepiaoContent(String chepiaoContent) {
        this.chepiaoContent = chepiaoContent;
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

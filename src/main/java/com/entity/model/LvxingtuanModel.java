package com.entity.model;

import com.entity.LvxingtuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 旅行团信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-15
 */
public class LvxingtuanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 发布旅行社
     */
    private Integer lvxingsheId;


    /**
     * 旅行地点
     */
    private Integer lvxingtuanName;


    /**
     * 旅行时间(天)
     */
    private Integer jiudianShijian;


    /**
     * 预览图
     */
    private String lvxingtuanPhoto;


    /**
     * 价格
     */
    private Double lvxingtuanMoney;


    /**
     * 旅行团详情
     */
    private String lvxingtuanContent;


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
	 * 获取：发布旅行社
	 */
    public Integer getLvxingsheId() {
        return lvxingsheId;
    }


    /**
	 * 设置：发布旅行社
	 */
    public void setLvxingsheId(Integer lvxingsheId) {
        this.lvxingsheId = lvxingsheId;
    }
    /**
	 * 获取：旅行地点
	 */
    public Integer getLvxingtuanName() {
        return lvxingtuanName;
    }


    /**
	 * 设置：旅行地点
	 */
    public void setLvxingtuanName(Integer lvxingtuanName) {
        this.lvxingtuanName = lvxingtuanName;
    }
    /**
	 * 获取：旅行时间(天)
	 */
    public Integer getJiudianShijian() {
        return jiudianShijian;
    }


    /**
	 * 设置：旅行时间(天)
	 */
    public void setJiudianShijian(Integer jiudianShijian) {
        this.jiudianShijian = jiudianShijian;
    }
    /**
	 * 获取：预览图
	 */
    public String getLvxingtuanPhoto() {
        return lvxingtuanPhoto;
    }


    /**
	 * 设置：预览图
	 */
    public void setLvxingtuanPhoto(String lvxingtuanPhoto) {
        this.lvxingtuanPhoto = lvxingtuanPhoto;
    }
    /**
	 * 获取：价格
	 */
    public Double getLvxingtuanMoney() {
        return lvxingtuanMoney;
    }


    /**
	 * 设置：价格
	 */
    public void setLvxingtuanMoney(Double lvxingtuanMoney) {
        this.lvxingtuanMoney = lvxingtuanMoney;
    }
    /**
	 * 获取：旅行团详情
	 */
    public String getLvxingtuanContent() {
        return lvxingtuanContent;
    }


    /**
	 * 设置：旅行团详情
	 */
    public void setLvxingtuanContent(String lvxingtuanContent) {
        this.lvxingtuanContent = lvxingtuanContent;
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

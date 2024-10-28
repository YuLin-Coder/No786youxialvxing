package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 旅行团信息
 *
 * @author 
 * @email
 * @date 2021-04-15
 */
@TableName("lvxingtuan")
public class LvxingtuanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public LvxingtuanEntity() {

	}

	public LvxingtuanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 发布旅行社
     */
    @TableField(value = "lvxingshe_id")

    private Integer lvxingsheId;


    /**
     * 旅行地点
     */
    @TableField(value = "lvxingtuan_name")

    private String lvxingtuanName;


    /**
     * 旅行时间(天)
     */
    @TableField(value = "jiudian_shijian")

    private Integer jiudianShijian;


    /**
     * 预览图
     */
    @TableField(value = "lvxingtuan_photo")

    private String lvxingtuanPhoto;


    /**
     * 价格
     */
    @TableField(value = "lvxingtuan_money")

    private Double lvxingtuanMoney;


    /**
     * 旅行团详情
     */
    @TableField(value = "lvxingtuan_content")

    private String lvxingtuanContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：发布旅行社
	 */
    public Integer getLvxingsheId() {
        return lvxingsheId;
    }


    /**
	 * 获取：发布旅行社
	 */

    public void setLvxingsheId(Integer lvxingsheId) {
        this.lvxingsheId = lvxingsheId;
    }
    /**
	 * 设置：旅行地点
	 */
    public String getLvxingtuanName() {
        return lvxingtuanName;
    }


    /**
	 * 获取：旅行地点
	 */

    public void setLvxingtuanName(String lvxingtuanName) {
        this.lvxingtuanName = lvxingtuanName;
    }
    /**
	 * 设置：旅行时间(天)
	 */
    public Integer getJiudianShijian() {
        return jiudianShijian;
    }


    /**
	 * 获取：旅行时间(天)
	 */

    public void setJiudianShijian(Integer jiudianShijian) {
        this.jiudianShijian = jiudianShijian;
    }
    /**
	 * 设置：预览图
	 */
    public String getLvxingtuanPhoto() {
        return lvxingtuanPhoto;
    }


    /**
	 * 获取：预览图
	 */

    public void setLvxingtuanPhoto(String lvxingtuanPhoto) {
        this.lvxingtuanPhoto = lvxingtuanPhoto;
    }
    /**
	 * 设置：价格
	 */
    public Double getLvxingtuanMoney() {
        return lvxingtuanMoney;
    }


    /**
	 * 获取：价格
	 */

    public void setLvxingtuanMoney(Double lvxingtuanMoney) {
        this.lvxingtuanMoney = lvxingtuanMoney;
    }
    /**
	 * 设置：旅行团详情
	 */
    public String getLvxingtuanContent() {
        return lvxingtuanContent;
    }


    /**
	 * 获取：旅行团详情
	 */

    public void setLvxingtuanContent(String lvxingtuanContent) {
        this.lvxingtuanContent = lvxingtuanContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Lvxingtuan{" +
            "id=" + id +
            ", lvxingsheId=" + lvxingsheId +
            ", lvxingtuanName=" + lvxingtuanName +
            ", jiudianShijian=" + jiudianShijian +
            ", lvxingtuanPhoto=" + lvxingtuanPhoto +
            ", lvxingtuanMoney=" + lvxingtuanMoney +
            ", lvxingtuanContent=" + lvxingtuanContent +
            ", createTime=" + createTime +
        "}";
    }
}

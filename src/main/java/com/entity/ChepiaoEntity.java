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
 * 车票
 *
 * @author 
 * @email
 * @date 2021-04-14
 */
@TableName("chepiao")
public class ChepiaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ChepiaoEntity() {

	}

	public ChepiaoEntity(T t) {
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
     * 班车
     */
    @TableField(value = "chepiao_name")

    private String chepiaoName;


    /**
     * 车票类型
     */
    @TableField(value = "chepiao_types")

    private Integer chepiaoTypes;


    /**
     * 出发地
     */
    @TableField(value = "chepiao_chufadi")

    private String chepiaoChufadi;


    /**
     * 目的地
     */
    @TableField(value = "chepiao_mudidi")

    private String chepiaoMudidi;


    /**
     * 照片
     */
    @TableField(value = "chepiao_photo")

    private String chepiaoPhoto;


    /**
     * 票价
     */
    @TableField(value = "chepiao_money")

    private Double chepiaoMoney;


    /**
     * 车票详情
     */
    @TableField(value = "chepiao_content")

    private String chepiaoContent;


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
	 * 设置：班车
	 */
    public String getChepiaoName() {
        return chepiaoName;
    }


    /**
	 * 获取：班车
	 */

    public void setChepiaoName(String chepiaoName) {
        this.chepiaoName = chepiaoName;
    }
    /**
	 * 设置：车票类型
	 */
    public Integer getChepiaoTypes() {
        return chepiaoTypes;
    }


    /**
	 * 获取：车票类型
	 */

    public void setChepiaoTypes(Integer chepiaoTypes) {
        this.chepiaoTypes = chepiaoTypes;
    }
    /**
	 * 设置：出发地
	 */
    public String getChepiaoChufadi() {
        return chepiaoChufadi;
    }


    /**
	 * 获取：出发地
	 */

    public void setChepiaoChufadi(String chepiaoChufadi) {
        this.chepiaoChufadi = chepiaoChufadi;
    }
    /**
	 * 设置：目的地
	 */
    public String getChepiaoMudidi() {
        return chepiaoMudidi;
    }


    /**
	 * 获取：目的地
	 */

    public void setChepiaoMudidi(String chepiaoMudidi) {
        this.chepiaoMudidi = chepiaoMudidi;
    }
    /**
	 * 设置：照片
	 */
    public String getChepiaoPhoto() {
        return chepiaoPhoto;
    }


    /**
	 * 获取：照片
	 */

    public void setChepiaoPhoto(String chepiaoPhoto) {
        this.chepiaoPhoto = chepiaoPhoto;
    }
    /**
	 * 设置：票价
	 */
    public Double getChepiaoMoney() {
        return chepiaoMoney;
    }


    /**
	 * 获取：票价
	 */

    public void setChepiaoMoney(Double chepiaoMoney) {
        this.chepiaoMoney = chepiaoMoney;
    }
    /**
	 * 设置：车票详情
	 */
    public String getChepiaoContent() {
        return chepiaoContent;
    }


    /**
	 * 获取：车票详情
	 */

    public void setChepiaoContent(String chepiaoContent) {
        this.chepiaoContent = chepiaoContent;
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
        return "Chepiao{" +
            "id=" + id +
            ", chepiaoName=" + chepiaoName +
            ", chepiaoTypes=" + chepiaoTypes +
            ", chepiaoChufadi=" + chepiaoChufadi +
            ", chepiaoMudidi=" + chepiaoMudidi +
            ", chepiaoPhoto=" + chepiaoPhoto +
            ", chepiaoMoney=" + chepiaoMoney +
            ", chepiaoContent=" + chepiaoContent +
            ", createTime=" + createTime +
        "}";
    }
}

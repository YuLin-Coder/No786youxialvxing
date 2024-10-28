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
 * 商品信息
 *
 * @author 
 * @email
 * @date 2021-04-15
 */
@TableName("shangpin")
public class ShangpinEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShangpinEntity() {

	}

	public ShangpinEntity(T t) {
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
     * 商品名称
     */
    @TableField(value = "shangpin_name")

    private String shangpinName;


    /**
     * 商品图片
     */
    @TableField(value = "shangpin_photo")

    private String shangpinPhoto;


    /**
     * 商品类型
     */
    @TableField(value = "shangpin_types")

    private Integer shangpinTypes;


    /**
     * 商品价格
     */
    @TableField(value = "shangpin_money")

    private String shangpinMoney;


    /**
     * 商品详情
     */
    @TableField(value = "shangpin_content")

    private String shangpinContent;


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
	 * 设置：商品名称
	 */
    public String getShangpinName() {
        return shangpinName;
    }


    /**
	 * 获取：商品名称
	 */

    public void setShangpinName(String shangpinName) {
        this.shangpinName = shangpinName;
    }
    /**
	 * 设置：商品图片
	 */
    public String getShangpinPhoto() {
        return shangpinPhoto;
    }


    /**
	 * 获取：商品图片
	 */

    public void setShangpinPhoto(String shangpinPhoto) {
        this.shangpinPhoto = shangpinPhoto;
    }
    /**
	 * 设置：商品类型
	 */
    public Integer getShangpinTypes() {
        return shangpinTypes;
    }


    /**
	 * 获取：商品类型
	 */

    public void setShangpinTypes(Integer shangpinTypes) {
        this.shangpinTypes = shangpinTypes;
    }
    /**
	 * 设置：商品价格
	 */
    public String getShangpinMoney() {
        return shangpinMoney;
    }


    /**
	 * 获取：商品价格
	 */

    public void setShangpinMoney(String shangpinMoney) {
        this.shangpinMoney = shangpinMoney;
    }
    /**
	 * 设置：商品详情
	 */
    public String getShangpinContent() {
        return shangpinContent;
    }


    /**
	 * 获取：商品详情
	 */

    public void setShangpinContent(String shangpinContent) {
        this.shangpinContent = shangpinContent;
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
        return "Shangpin{" +
            "id=" + id +
            ", shangpinName=" + shangpinName +
            ", shangpinPhoto=" + shangpinPhoto +
            ", shangpinTypes=" + shangpinTypes +
            ", shangpinMoney=" + shangpinMoney +
            ", shangpinContent=" + shangpinContent +
            ", createTime=" + createTime +
        "}";
    }
}

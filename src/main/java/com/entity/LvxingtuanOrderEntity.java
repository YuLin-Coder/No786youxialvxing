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
 * 旅行团订单
 *
 * @author 
 * @email
 * @date 2021-04-15
 */
@TableName("lvxingtuan_order")
public class LvxingtuanOrderEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public LvxingtuanOrderEntity() {

	}

	public LvxingtuanOrderEntity(T t) {
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
     * 旅行团id
     */
    @TableField(value = "lvxingtuan_id")

    private Integer lvxingtuanId;


    /**
     * 用户id
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "lvxingtuan_order_start_time",fill = FieldFill.UPDATE)

    private Date lvxingtuanOrderStartTime;


    /**
     * 结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "lvxingtuan_order_end_time",fill = FieldFill.UPDATE)

    private Date lvxingtuanOrderEndTime;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


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
	 * 设置：旅行团id
	 */
    public Integer getLvxingtuanId() {
        return lvxingtuanId;
    }


    /**
	 * 获取：旅行团id
	 */

    public void setLvxingtuanId(Integer lvxingtuanId) {
        this.lvxingtuanId = lvxingtuanId;
    }
    /**
	 * 设置：用户id
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户id
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：开始时间
	 */
    public Date getLvxingtuanOrderStartTime() {
        return lvxingtuanOrderStartTime;
    }


    /**
	 * 获取：开始时间
	 */

    public void setLvxingtuanOrderStartTime(Date lvxingtuanOrderStartTime) {
        this.lvxingtuanOrderStartTime = lvxingtuanOrderStartTime;
    }
    /**
	 * 设置：结束时间
	 */
    public Date getLvxingtuanOrderEndTime() {
        return lvxingtuanOrderEndTime;
    }


    /**
	 * 获取：结束时间
	 */

    public void setLvxingtuanOrderEndTime(Date lvxingtuanOrderEndTime) {
        this.lvxingtuanOrderEndTime = lvxingtuanOrderEndTime;
    }
    /**
	 * 设置：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：订单创建时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
        return "LvxingtuanOrder{" +
            "id=" + id +
            ", lvxingtuanId=" + lvxingtuanId +
            ", yonghuId=" + yonghuId +
            ", lvxingtuanOrderStartTime=" + lvxingtuanOrderStartTime +
            ", lvxingtuanOrderEndTime=" + lvxingtuanOrderEndTime +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}

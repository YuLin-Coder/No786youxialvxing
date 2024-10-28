package com.entity.vo;

import com.entity.LvxingtuanOrderEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 旅行团订单
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-15
 */
@TableName("lvxingtuan_order")
public class LvxingtuanOrderVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "lvxingtuan_order_start_time")
    private Date lvxingtuanOrderStartTime;


    /**
     * 结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "lvxingtuan_order_end_time")
    private Date lvxingtuanOrderEndTime;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show3
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}

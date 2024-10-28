package com.entity.vo;

import com.entity.ShangpinEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 商品信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-15
 */
@TableName("shangpin")
public class ShangpinVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 商品名称
     */

    @TableField(value = "shangpin_name")
    private Integer shangpinName;


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
     * 创建时间 show1 show2 photoShow
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
	 * 设置：商品名称
	 */
    public Integer getShangpinName() {
        return shangpinName;
    }


    /**
	 * 获取：商品名称
	 */

    public void setShangpinName(Integer shangpinName) {
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}

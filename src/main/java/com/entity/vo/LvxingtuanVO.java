package com.entity.vo;

import com.entity.LvxingtuanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 旅行团信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-15
 */
@TableName("lvxingtuan")
public class LvxingtuanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
    private Integer lvxingtuanName;


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
    public Integer getLvxingtuanName() {
        return lvxingtuanName;
    }


    /**
	 * 获取：旅行地点
	 */

    public void setLvxingtuanName(Integer lvxingtuanName) {
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

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
 * 旅行社
 *
 * @author 
 * @email
 * @date 2021-04-14
 */
@TableName("lvxingshe")
public class LvxingsheEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public LvxingsheEntity() {

	}

	public LvxingsheEntity(T t) {
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
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 旅行社名称
     */
    @TableField(value = "lvxingshe_name")

    private String lvxingsheName;


    /**
     * 照片
     */
    @TableField(value = "lvxingshe_photo")

    private String lvxingshePhoto;


    /**
     * 余额
     */
    @TableField(value = "new_money")

    private Double newMoney;


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
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：旅行社名称
	 */
    public String getLvxingsheName() {
        return lvxingsheName;
    }


    /**
	 * 获取：旅行社名称
	 */

    public void setLvxingsheName(String lvxingsheName) {
        this.lvxingsheName = lvxingsheName;
    }
    /**
	 * 设置：照片
	 */
    public String getLvxingshePhoto() {
        return lvxingshePhoto;
    }


    /**
	 * 获取：照片
	 */

    public void setLvxingshePhoto(String lvxingshePhoto) {
        this.lvxingshePhoto = lvxingshePhoto;
    }
    /**
	 * 设置：余额
	 */
    public Double getNewMoney() {
        return newMoney;
    }


    /**
	 * 获取：余额
	 */

    public void setNewMoney(Double newMoney) {
        this.newMoney = newMoney;
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
        return "Lvxingshe{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", lvxingsheName=" + lvxingsheName +
            ", lvxingshePhoto=" + lvxingshePhoto +
            ", newMoney=" + newMoney +
            ", createTime=" + createTime +
        "}";
    }
}

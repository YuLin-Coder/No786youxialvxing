package com.entity.view;

import com.entity.LvxingtuanOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 旅行团订单
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-15
 */
@TableName("lvxingtuan_order")
public class LvxingtuanOrderView extends LvxingtuanOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 lvxingtuan
			/**
			* 发布旅行社
			*/
			private Integer lvxingsheId;
			/**
			* 旅行地点
			*/
			private String lvxingtuanName;
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

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 照片
			*/
			private String yonghuPhoto;
			/**
			* 余额
			*/
			private Double newMoney;

	public LvxingtuanOrderView() {

	}

	public LvxingtuanOrderView(LvxingtuanOrderEntity lvxingtuanOrderEntity) {
		try {
			BeanUtils.copyProperties(this, lvxingtuanOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




























				//级联表的get和set lvxingtuan
					/**
					* 获取： 发布旅行社
					*/
					public Integer getLvxingsheId() {
						return lvxingsheId;
					}
					/**
					* 设置： 发布旅行社
					*/
					public void setLvxingsheId(Integer lvxingsheId) {
						this.lvxingsheId = lvxingsheId;
					}
					/**
					* 获取： 旅行地点
					*/
					public String getLvxingtuanName() {
						return lvxingtuanName;
					}
					/**
					* 设置： 旅行地点
					*/
					public void setLvxingtuanName(String lvxingtuanName) {
						this.lvxingtuanName = lvxingtuanName;
					}
					/**
					* 获取： 旅行时间(天)
					*/
					public Integer getJiudianShijian() {
						return jiudianShijian;
					}
					/**
					* 设置： 旅行时间(天)
					*/
					public void setJiudianShijian(Integer jiudianShijian) {
						this.jiudianShijian = jiudianShijian;
					}
					/**
					* 获取： 预览图
					*/
					public String getLvxingtuanPhoto() {
						return lvxingtuanPhoto;
					}
					/**
					* 设置： 预览图
					*/
					public void setLvxingtuanPhoto(String lvxingtuanPhoto) {
						this.lvxingtuanPhoto = lvxingtuanPhoto;
					}
					/**
					* 获取： 价格
					*/
					public Double getLvxingtuanMoney() {
						return lvxingtuanMoney;
					}
					/**
					* 设置： 价格
					*/
					public void setLvxingtuanMoney(Double lvxingtuanMoney) {
						this.lvxingtuanMoney = lvxingtuanMoney;
					}
					/**
					* 获取： 旅行团详情
					*/
					public String getLvxingtuanContent() {
						return lvxingtuanContent;
					}
					/**
					* 设置： 旅行团详情
					*/
					public void setLvxingtuanContent(String lvxingtuanContent) {
						this.lvxingtuanContent = lvxingtuanContent;
					}













				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}



}

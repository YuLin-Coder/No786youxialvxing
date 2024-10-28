package com.entity.view;

import com.entity.ChepiaoOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 车票订单
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-14
 */
@TableName("chepiao_order")
public class ChepiaoOrderView extends ChepiaoOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 chepiao
			/**
			* 班车
			*/
			private String chepiaoName;
			/**
			* 车票类型
			*/
			private Integer chepiaoTypes;
				/**
				* 车票类型的值
				*/
				private String chepiaoValue;
			/**
			* 出发地
			*/
			private String chepiaoChufadi;
			/**
			* 目的地
			*/
			private String chepiaoMudidi;
			/**
			* 照片
			*/
			private String chepiaoPhoto;
			/**
			* 票价
			*/
			private Double chepiaoMoney;
			/**
			* 车票详情
			*/
			private String chepiaoContent;

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

	public ChepiaoOrderView() {

	}

	public ChepiaoOrderView(ChepiaoOrderEntity chepiaoOrderEntity) {
		try {
			BeanUtils.copyProperties(this, chepiaoOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}







				//级联表的get和set chepiao
					/**
					* 获取： 班车
					*/
					public String getChepiaoName() {
						return chepiaoName;
					}
					/**
					* 设置： 班车
					*/
					public void setChepiaoName(String chepiaoName) {
						this.chepiaoName = chepiaoName;
					}
					/**
					* 获取： 车票类型
					*/
					public Integer getChepiaoTypes() {
						return chepiaoTypes;
					}
					/**
					* 设置： 车票类型
					*/
					public void setChepiaoTypes(Integer chepiaoTypes) {
						this.chepiaoTypes = chepiaoTypes;
					}


						/**
						* 获取： 车票类型的值
						*/
						public String getChepiaoValue() {
							return chepiaoValue;
						}
						/**
						* 设置： 车票类型的值
						*/
						public void setChepiaoValue(String chepiaoValue) {
							this.chepiaoValue = chepiaoValue;
						}
					/**
					* 获取： 出发地
					*/
					public String getChepiaoChufadi() {
						return chepiaoChufadi;
					}
					/**
					* 设置： 出发地
					*/
					public void setChepiaoChufadi(String chepiaoChufadi) {
						this.chepiaoChufadi = chepiaoChufadi;
					}
					/**
					* 获取： 目的地
					*/
					public String getChepiaoMudidi() {
						return chepiaoMudidi;
					}
					/**
					* 设置： 目的地
					*/
					public void setChepiaoMudidi(String chepiaoMudidi) {
						this.chepiaoMudidi = chepiaoMudidi;
					}
					/**
					* 获取： 照片
					*/
					public String getChepiaoPhoto() {
						return chepiaoPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setChepiaoPhoto(String chepiaoPhoto) {
						this.chepiaoPhoto = chepiaoPhoto;
					}
					/**
					* 获取： 票价
					*/
					public Double getChepiaoMoney() {
						return chepiaoMoney;
					}
					/**
					* 设置： 票价
					*/
					public void setChepiaoMoney(Double chepiaoMoney) {
						this.chepiaoMoney = chepiaoMoney;
					}
					/**
					* 获取： 车票详情
					*/
					public String getChepiaoContent() {
						return chepiaoContent;
					}
					/**
					* 设置： 车票详情
					*/
					public void setChepiaoContent(String chepiaoContent) {
						this.chepiaoContent = chepiaoContent;
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

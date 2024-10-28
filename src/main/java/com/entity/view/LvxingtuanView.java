package com.entity.view;

import com.entity.LvxingtuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 旅行团信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-15
 */
@TableName("lvxingtuan")
public class LvxingtuanView extends LvxingtuanEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 lvxingshe
			/**
			* 旅行社名称
			*/
			private String lvxingsheName;
			/**
			* 照片
			*/
			private String lvxingshePhoto;
			/**
			* 余额
			*/
			private Double newMoney;

	public LvxingtuanView() {

	}

	public LvxingtuanView(LvxingtuanEntity lvxingtuanEntity) {
		try {
			BeanUtils.copyProperties(this, lvxingtuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



















				//级联表的get和set lvxingshe
					/**
					* 获取： 旅行社名称
					*/
					public String getLvxingsheName() {
						return lvxingsheName;
					}
					/**
					* 设置： 旅行社名称
					*/
					public void setLvxingsheName(String lvxingsheName) {
						this.lvxingsheName = lvxingsheName;
					}
					/**
					* 获取： 照片
					*/
					public String getLvxingshePhoto() {
						return lvxingshePhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setLvxingshePhoto(String lvxingshePhoto) {
						this.lvxingshePhoto = lvxingshePhoto;
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

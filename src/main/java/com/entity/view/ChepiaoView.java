package com.entity.view;

import com.entity.ChepiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 车票
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-14
 */
@TableName("chepiao")
public class ChepiaoView extends ChepiaoEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 车票类型的值
		*/
		private String chepiaoValue;



	public ChepiaoView() {

	}

	public ChepiaoView(ChepiaoEntity chepiaoEntity) {
		try {
			BeanUtils.copyProperties(this, chepiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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















}

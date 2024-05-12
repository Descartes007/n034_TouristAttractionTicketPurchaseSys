package com.entity.view;

import com.entity.MenpiaogoumaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 门票购买
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-07 11:58:59
 */
@TableName("menpiaogoumai")
public class MenpiaogoumaiView  extends MenpiaogoumaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MenpiaogoumaiView(){
	}
 
 	public MenpiaogoumaiView(MenpiaogoumaiEntity menpiaogoumaiEntity){
 	try {
			BeanUtils.copyProperties(this, menpiaogoumaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

package com.entity.view;

import com.entity.DiscussremenjingdianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 热门景点评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-07 11:58:59
 */
@TableName("discussremenjingdian")
public class DiscussremenjingdianView  extends DiscussremenjingdianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussremenjingdianView(){
	}
 
 	public DiscussremenjingdianView(DiscussremenjingdianEntity discussremenjingdianEntity){
 	try {
			BeanUtils.copyProperties(this, discussremenjingdianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

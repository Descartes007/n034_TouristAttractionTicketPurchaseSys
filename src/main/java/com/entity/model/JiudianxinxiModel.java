package com.entity.model;

import com.entity.JiudianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 酒店信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-01-07 11:58:59
 */
public class JiudianxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 客房图片
	 */
	
	private String kefangtupian;
		
	/**
	 * 酒店等级
	 */
	
	private String jiudiandengji;
		
	/**
	 * 客房类型
	 */
	
	private String kefangleixing;
		
	/**
	 * 客房价格
	 */
	
	private Float kefangjiage;
		
	/**
	 * 客房数量
	 */
	
	private Integer kefangshuliang;
		
	/**
	 * 酒店位置
	 */
	
	private String jiudianweizhi;
		
	/**
	 * 酒店设施
	 */
	
	private String jiudiansheshi;
				
	
	/**
	 * 设置：客房图片
	 */
	 
	public void setKefangtupian(String kefangtupian) {
		this.kefangtupian = kefangtupian;
	}
	
	/**
	 * 获取：客房图片
	 */
	public String getKefangtupian() {
		return kefangtupian;
	}
				
	
	/**
	 * 设置：酒店等级
	 */
	 
	public void setJiudiandengji(String jiudiandengji) {
		this.jiudiandengji = jiudiandengji;
	}
	
	/**
	 * 获取：酒店等级
	 */
	public String getJiudiandengji() {
		return jiudiandengji;
	}
				
	
	/**
	 * 设置：客房类型
	 */
	 
	public void setKefangleixing(String kefangleixing) {
		this.kefangleixing = kefangleixing;
	}
	
	/**
	 * 获取：客房类型
	 */
	public String getKefangleixing() {
		return kefangleixing;
	}
				
	
	/**
	 * 设置：客房价格
	 */
	 
	public void setKefangjiage(Float kefangjiage) {
		this.kefangjiage = kefangjiage;
	}
	
	/**
	 * 获取：客房价格
	 */
	public Float getKefangjiage() {
		return kefangjiage;
	}
				
	
	/**
	 * 设置：客房数量
	 */
	 
	public void setKefangshuliang(Integer kefangshuliang) {
		this.kefangshuliang = kefangshuliang;
	}
	
	/**
	 * 获取：客房数量
	 */
	public Integer getKefangshuliang() {
		return kefangshuliang;
	}
				
	
	/**
	 * 设置：酒店位置
	 */
	 
	public void setJiudianweizhi(String jiudianweizhi) {
		this.jiudianweizhi = jiudianweizhi;
	}
	
	/**
	 * 获取：酒店位置
	 */
	public String getJiudianweizhi() {
		return jiudianweizhi;
	}
				
	
	/**
	 * 设置：酒店设施
	 */
	 
	public void setJiudiansheshi(String jiudiansheshi) {
		this.jiudiansheshi = jiudiansheshi;
	}
	
	/**
	 * 获取：酒店设施
	 */
	public String getJiudiansheshi() {
		return jiudiansheshi;
	}
			
}

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
 * 酒店信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-01-07 11:58:59
 */
@TableName("jiudianxinxi")
public class JiudianxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiudianxinxiEntity() {
		
	}
	
	public JiudianxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 酒店名称
	 */
					
	private String jiudianmingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：酒店名称
	 */
	public void setJiudianmingcheng(String jiudianmingcheng) {
		this.jiudianmingcheng = jiudianmingcheng;
	}
	/**
	 * 获取：酒店名称
	 */
	public String getJiudianmingcheng() {
		return jiudianmingcheng;
	}
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

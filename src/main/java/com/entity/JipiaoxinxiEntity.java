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
 * 机票信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-01-07 11:58:59
 */
@TableName("jipiaoxinxi")
public class JipiaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JipiaoxinxiEntity() {
		
	}
	
	public JipiaoxinxiEntity(T t) {
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
	 * 航班编号
	 */
					
	private String hangbanbianhao;
	
	/**
	 * 航空公司
	 */
					
	private String hangkonggongsi;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 出发地
	 */
					
	private String chufadi;
	
	/**
	 * 目的地
	 */
					
	private String mudedi;
	
	/**
	 * 飞行方式
	 */
					
	private String feixingfangshi;
	
	/**
	 * 出发时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date chufashijian;
	
	/**
	 * 飞行时长
	 */
					
	private String feixingshizhang;
	
	/**
	 * 乘机地点
	 */
					
	private String chengjididian;
	
	/**
	 * 票价
	 */
					
	private Integer piaojia;
	
	/**
	 * 数量
	 */
					
	private Integer shuliang;
	
	
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
	 * 设置：航班编号
	 */
	public void setHangbanbianhao(String hangbanbianhao) {
		this.hangbanbianhao = hangbanbianhao;
	}
	/**
	 * 获取：航班编号
	 */
	public String getHangbanbianhao() {
		return hangbanbianhao;
	}
	/**
	 * 设置：航空公司
	 */
	public void setHangkonggongsi(String hangkonggongsi) {
		this.hangkonggongsi = hangkonggongsi;
	}
	/**
	 * 获取：航空公司
	 */
	public String getHangkonggongsi() {
		return hangkonggongsi;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：出发地
	 */
	public void setChufadi(String chufadi) {
		this.chufadi = chufadi;
	}
	/**
	 * 获取：出发地
	 */
	public String getChufadi() {
		return chufadi;
	}
	/**
	 * 设置：目的地
	 */
	public void setMudedi(String mudedi) {
		this.mudedi = mudedi;
	}
	/**
	 * 获取：目的地
	 */
	public String getMudedi() {
		return mudedi;
	}
	/**
	 * 设置：飞行方式
	 */
	public void setFeixingfangshi(String feixingfangshi) {
		this.feixingfangshi = feixingfangshi;
	}
	/**
	 * 获取：飞行方式
	 */
	public String getFeixingfangshi() {
		return feixingfangshi;
	}
	/**
	 * 设置：出发时间
	 */
	public void setChufashijian(Date chufashijian) {
		this.chufashijian = chufashijian;
	}
	/**
	 * 获取：出发时间
	 */
	public Date getChufashijian() {
		return chufashijian;
	}
	/**
	 * 设置：飞行时长
	 */
	public void setFeixingshizhang(String feixingshizhang) {
		this.feixingshizhang = feixingshizhang;
	}
	/**
	 * 获取：飞行时长
	 */
	public String getFeixingshizhang() {
		return feixingshizhang;
	}
	/**
	 * 设置：乘机地点
	 */
	public void setChengjididian(String chengjididian) {
		this.chengjididian = chengjididian;
	}
	/**
	 * 获取：乘机地点
	 */
	public String getChengjididian() {
		return chengjididian;
	}
	/**
	 * 设置：票价
	 */
	public void setPiaojia(Integer piaojia) {
		this.piaojia = piaojia;
	}
	/**
	 * 获取：票价
	 */
	public Integer getPiaojia() {
		return piaojia;
	}
	/**
	 * 设置：数量
	 */
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}

}

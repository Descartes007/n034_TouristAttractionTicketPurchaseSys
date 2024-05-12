package com.entity.model;

import com.entity.JiudianyudingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 酒店预订
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-01-07 11:58:59
 */
public class JiudianyudingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 酒店等级
	 */
	
	private String jiudiandengji;
		
	/**
	 * 客房价格
	 */
	
	private Float kefangjiage;
		
	/**
	 * 客房数量
	 */
	
	private Integer kefangshuliang;
		
	/**
	 * 总金额
	 */
	
	private Float zongjine;
		
	/**
	 * 预订时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date yudingshijian;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 身份证
	 */
	
	private String shenfenzheng;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：总金额
	 */
	 
	public void setZongjine(Float zongjine) {
		this.zongjine = zongjine;
	}
	
	/**
	 * 获取：总金额
	 */
	public Float getZongjine() {
		return zongjine;
	}
				
	
	/**
	 * 设置：预订时间
	 */
	 
	public void setYudingshijian(Date yudingshijian) {
		this.yudingshijian = yudingshijian;
	}
	
	/**
	 * 获取：预订时间
	 */
	public Date getYudingshijian() {
		return yudingshijian;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：身份证
	 */
	 
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}

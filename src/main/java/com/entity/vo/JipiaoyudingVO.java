package com.entity.vo;

import com.entity.JipiaoyudingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 机票预订
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-01-07 11:58:59
 */
public class JipiaoyudingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 航班编号
	 */
	
	private String hangbanbianhao;
		
	/**
	 * 航空公司
	 */
	
	private String hangkonggongsi;
		
	/**
	 * 出发时间
	 */
	
	private String chufashijian;
		
	/**
	 * 票价
	 */
	
	private Float piaojia;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 总价格
	 */
	
	private Float zongjiage;
		
	/**
	 * 购票日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date goupiaoriqi;
		
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
	 * 设置：出发时间
	 */
	 
	public void setChufashijian(String chufashijian) {
		this.chufashijian = chufashijian;
	}
	
	/**
	 * 获取：出发时间
	 */
	public String getChufashijian() {
		return chufashijian;
	}
				
	
	/**
	 * 设置：票价
	 */
	 
	public void setPiaojia(Float piaojia) {
		this.piaojia = piaojia;
	}
	
	/**
	 * 获取：票价
	 */
	public Float getPiaojia() {
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
				
	
	/**
	 * 设置：总价格
	 */
	 
	public void setZongjiage(Float zongjiage) {
		this.zongjiage = zongjiage;
	}
	
	/**
	 * 获取：总价格
	 */
	public Float getZongjiage() {
		return zongjiage;
	}
				
	
	/**
	 * 设置：购票日期
	 */
	 
	public void setGoupiaoriqi(Date goupiaoriqi) {
		this.goupiaoriqi = goupiaoriqi;
	}
	
	/**
	 * 获取：购票日期
	 */
	public Date getGoupiaoriqi() {
		return goupiaoriqi;
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

package com.entity.vo;

import com.entity.LvyouxianluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 旅游线路
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-01-07 11:58:59
 */
public class LvyouxianluVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 线路图片
	 */
	
	private String xianlutupian;
		
	/**
	 * 线路类型
	 */
	
	private String xianluleixing;
		
	/**
	 * 景点名称
	 */
	
	private String jingdianmingcheng;
		
	/**
	 * 等级
	 */
	
	private String dengji;
		
	/**
	 * 景点位置
	 */
	
	private String jingdianweizhi;
		
	/**
	 * 起点
	 */
	
	private String qidian;
		
	/**
	 * 途径路段
	 */
	
	private String tujingluduan;
		
	/**
	 * 终点
	 */
	
	private String zhongdian;
		
	/**
	 * 交通方式
	 */
	
	private String jiaotongfangshi;
		
	/**
	 * 线路详情
	 */
	
	private String xianluxiangqing;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：线路图片
	 */
	 
	public void setXianlutupian(String xianlutupian) {
		this.xianlutupian = xianlutupian;
	}
	
	/**
	 * 获取：线路图片
	 */
	public String getXianlutupian() {
		return xianlutupian;
	}
				
	
	/**
	 * 设置：线路类型
	 */
	 
	public void setXianluleixing(String xianluleixing) {
		this.xianluleixing = xianluleixing;
	}
	
	/**
	 * 获取：线路类型
	 */
	public String getXianluleixing() {
		return xianluleixing;
	}
				
	
	/**
	 * 设置：景点名称
	 */
	 
	public void setJingdianmingcheng(String jingdianmingcheng) {
		this.jingdianmingcheng = jingdianmingcheng;
	}
	
	/**
	 * 获取：景点名称
	 */
	public String getJingdianmingcheng() {
		return jingdianmingcheng;
	}
				
	
	/**
	 * 设置：等级
	 */
	 
	public void setDengji(String dengji) {
		this.dengji = dengji;
	}
	
	/**
	 * 获取：等级
	 */
	public String getDengji() {
		return dengji;
	}
				
	
	/**
	 * 设置：景点位置
	 */
	 
	public void setJingdianweizhi(String jingdianweizhi) {
		this.jingdianweizhi = jingdianweizhi;
	}
	
	/**
	 * 获取：景点位置
	 */
	public String getJingdianweizhi() {
		return jingdianweizhi;
	}
				
	
	/**
	 * 设置：起点
	 */
	 
	public void setQidian(String qidian) {
		this.qidian = qidian;
	}
	
	/**
	 * 获取：起点
	 */
	public String getQidian() {
		return qidian;
	}
				
	
	/**
	 * 设置：途径路段
	 */
	 
	public void setTujingluduan(String tujingluduan) {
		this.tujingluduan = tujingluduan;
	}
	
	/**
	 * 获取：途径路段
	 */
	public String getTujingluduan() {
		return tujingluduan;
	}
				
	
	/**
	 * 设置：终点
	 */
	 
	public void setZhongdian(String zhongdian) {
		this.zhongdian = zhongdian;
	}
	
	/**
	 * 获取：终点
	 */
	public String getZhongdian() {
		return zhongdian;
	}
				
	
	/**
	 * 设置：交通方式
	 */
	 
	public void setJiaotongfangshi(String jiaotongfangshi) {
		this.jiaotongfangshi = jiaotongfangshi;
	}
	
	/**
	 * 获取：交通方式
	 */
	public String getJiaotongfangshi() {
		return jiaotongfangshi;
	}
				
	
	/**
	 * 设置：线路详情
	 */
	 
	public void setXianluxiangqing(String xianluxiangqing) {
		this.xianluxiangqing = xianluxiangqing;
	}
	
	/**
	 * 获取：线路详情
	 */
	public String getXianluxiangqing() {
		return xianluxiangqing;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}

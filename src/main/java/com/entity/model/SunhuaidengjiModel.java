package com.entity.model;

import com.entity.SunhuaidengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 损坏登记
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 */
public class SunhuaidengjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 器材名称
	 */
	
	private String qicaimingcheng;
		
	/**
	 * 损坏数量
	 */
	
	private String sunhuaishuliang;
		
	/**
	 * 维修人员
	 */
	
	private String weixiurenyuan;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
		
	/**
	 * 维修情况
	 */
	
	private String weixiuqingkuang;
				
	
	/**
	 * 设置：器材名称
	 */
	 
	public void setQicaimingcheng(String qicaimingcheng) {
		this.qicaimingcheng = qicaimingcheng;
	}
	
	/**
	 * 获取：器材名称
	 */
	public String getQicaimingcheng() {
		return qicaimingcheng;
	}
				
	
	/**
	 * 设置：损坏数量
	 */
	 
	public void setSunhuaishuliang(String sunhuaishuliang) {
		this.sunhuaishuliang = sunhuaishuliang;
	}
	
	/**
	 * 获取：损坏数量
	 */
	public String getSunhuaishuliang() {
		return sunhuaishuliang;
	}
				
	
	/**
	 * 设置：维修人员
	 */
	 
	public void setWeixiurenyuan(String weixiurenyuan) {
		this.weixiurenyuan = weixiurenyuan;
	}
	
	/**
	 * 获取：维修人员
	 */
	public String getWeixiurenyuan() {
		return weixiurenyuan;
	}
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
				
	
	/**
	 * 设置：维修情况
	 */
	 
	public void setWeixiuqingkuang(String weixiuqingkuang) {
		this.weixiuqingkuang = weixiuqingkuang;
	}
	
	/**
	 * 获取：维修情况
	 */
	public String getWeixiuqingkuang() {
		return weixiuqingkuang;
	}
			
}

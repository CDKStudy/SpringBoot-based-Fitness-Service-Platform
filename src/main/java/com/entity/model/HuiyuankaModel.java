package com.entity.model;

import com.entity.HuiyuankaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 会员卡
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 

 */
public class HuiyuankaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 会员折扣
	 */
	
	private Float huiyuanzhekou;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 会员功能
	 */
	
	private String huiyuangongneng;
		
	/**
	 * 会员卡价格
	 */
	
	private Integer huiyuankajiage;
		
	/**
	 * 天数
	 */
	
	private String tianshu;
				
	
	/**
	 * 设置：会员折扣
	 */
	 
	public void setHuiyuanzhekou(Float huiyuanzhekou) {
		this.huiyuanzhekou = huiyuanzhekou;
	}
	
	/**
	 * 获取：会员折扣
	 */
	public Float getHuiyuanzhekou() {
		return huiyuanzhekou;
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
	 * 设置：会员功能
	 */
	 
	public void setHuiyuangongneng(String huiyuangongneng) {
		this.huiyuangongneng = huiyuangongneng;
	}
	
	/**
	 * 获取：会员功能
	 */
	public String getHuiyuangongneng() {
		return huiyuangongneng;
	}
				
	
	/**
	 * 设置：会员卡价格
	 */
	 
	public void setHuiyuankajiage(Integer huiyuankajiage) {
		this.huiyuankajiage = huiyuankajiage;
	}
	
	/**
	 * 获取：会员卡价格
	 */
	public Integer getHuiyuankajiage() {
		return huiyuankajiage;
	}
				
	
	/**
	 * 设置：天数
	 */
	 
	public void setTianshu(String tianshu) {
		this.tianshu = tianshu;
	}
	
	/**
	 * 获取：天数
	 */
	public String getTianshu() {
		return tianshu;
	}
			
}

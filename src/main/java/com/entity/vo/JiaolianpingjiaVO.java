package com.entity.vo;

import com.entity.JiaolianpingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 教练评价
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 

 */
public class JiaolianpingjiaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 教练姓名
	 */
	
	private String jiaolianxingming;
		
	/**
	 * 课程名称
	 */
	
	private String kechengmingcheng;
		
	/**
	 * 评价时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pingjiashijian;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 教练评分
	 */
	
	private Integer jiaolianpingfen;
		
	/**
	 * 评价内容
	 */
	
	private String pingjianeirong;
		
	/**
	 * 跨表用户id
	 */
	
	private Long crossuserid;
		
	/**
	 * 跨表主键id
	 */
	
	private Long crossrefid;
				
	
	/**
	 * 设置：教练姓名
	 */
	 
	public void setJiaolianxingming(String jiaolianxingming) {
		this.jiaolianxingming = jiaolianxingming;
	}
	
	/**
	 * 获取：教练姓名
	 */
	public String getJiaolianxingming() {
		return jiaolianxingming;
	}
				
	
	/**
	 * 设置：课程名称
	 */
	 
	public void setKechengmingcheng(String kechengmingcheng) {
		this.kechengmingcheng = kechengmingcheng;
	}
	
	/**
	 * 获取：课程名称
	 */
	public String getKechengmingcheng() {
		return kechengmingcheng;
	}
				
	
	/**
	 * 设置：评价时间
	 */
	 
	public void setPingjiashijian(Date pingjiashijian) {
		this.pingjiashijian = pingjiashijian;
	}
	
	/**
	 * 获取：评价时间
	 */
	public Date getPingjiashijian() {
		return pingjiashijian;
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
	 * 设置：教练评分
	 */
	 
	public void setJiaolianpingfen(Integer jiaolianpingfen) {
		this.jiaolianpingfen = jiaolianpingfen;
	}
	
	/**
	 * 获取：教练评分
	 */
	public Integer getJiaolianpingfen() {
		return jiaolianpingfen;
	}
				
	
	/**
	 * 设置：评价内容
	 */
	 
	public void setPingjianeirong(String pingjianeirong) {
		this.pingjianeirong = pingjianeirong;
	}
	
	/**
	 * 获取：评价内容
	 */
	public String getPingjianeirong() {
		return pingjianeirong;
	}
				
	
	/**
	 * 设置：跨表用户id
	 */
	 
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
				
	
	/**
	 * 设置：跨表主键id
	 */
	 
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}
			
}

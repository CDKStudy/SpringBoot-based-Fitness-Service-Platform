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
 * 会员卡办理
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 

 */
@TableName("huiyuankabanli")
public class HuiyuankabanliEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuiyuankabanliEntity() {
		
	}
	
	public HuiyuankabanliEntity(T t) {
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
	 * 订单编号
	 */
					
	private String dingdanbianhao;
	
	/**
	 * 会员等级
	 */
					
	private String huiyuandengji;
	
	/**
	 * 会员折扣
	 */
					
	private String huiyuanzhekou;
	
	/**
	 * 会员卡价格
	 */
					
	private String huiyuankajiage;
	
	/**
	 * 天数
	 */
					
	private String tianshu;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 用户手机
	 */
					
	private String yonghushouji;
	
	/**
	 * 办理时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date banlishijian;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
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
	 * 设置：订单编号
	 */
	public void setDingdanbianhao(String dingdanbianhao) {
		this.dingdanbianhao = dingdanbianhao;
	}
	/**
	 * 获取：订单编号
	 */
	public String getDingdanbianhao() {
		return dingdanbianhao;
	}
	/**
	 * 设置：会员等级
	 */
	public void setHuiyuandengji(String huiyuandengji) {
		this.huiyuandengji = huiyuandengji;
	}
	/**
	 * 获取：会员等级
	 */
	public String getHuiyuandengji() {
		return huiyuandengji;
	}
	/**
	 * 设置：会员折扣
	 */
	public void setHuiyuanzhekou(String huiyuanzhekou) {
		this.huiyuanzhekou = huiyuanzhekou;
	}
	/**
	 * 获取：会员折扣
	 */
	public String getHuiyuanzhekou() {
		return huiyuanzhekou;
	}
	/**
	 * 设置：会员卡价格
	 */
	public void setHuiyuankajiage(String huiyuankajiage) {
		this.huiyuankajiage = huiyuankajiage;
	}
	/**
	 * 获取：会员卡价格
	 */
	public String getHuiyuankajiage() {
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
	 * 设置：用户手机
	 */
	public void setYonghushouji(String yonghushouji) {
		this.yonghushouji = yonghushouji;
	}
	/**
	 * 获取：用户手机
	 */
	public String getYonghushouji() {
		return yonghushouji;
	}
	/**
	 * 设置：办理时间
	 */
	public void setBanlishijian(Date banlishijian) {
		this.banlishijian = banlishijian;
	}
	/**
	 * 获取：办理时间
	 */
	public Date getBanlishijian() {
		return banlishijian;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
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

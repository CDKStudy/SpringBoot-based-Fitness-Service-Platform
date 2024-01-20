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
 * 业绩统计
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 

 */
@TableName("yejitongji")
public class YejitongjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YejitongjiEntity() {
		
	}
	
	public YejitongjiEntity(T t) {
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
	 * 统计标题
	 */
					
	private String tongjibiaoti;
	
	/**
	 * 会员收入
	 */
					
	private Float huiyuanshouru;
	
	/**
	 * 课程收入
	 */
					
	private Float kechengshouru;
	
	/**
	 * 其他收入
	 */
					
	private Float qitashouru;
	
	/**
	 * 工资支出
	 */
					
	private Float gongzizhichu;
	
	/**
	 * 损坏支出
	 */
					
	private Float sunhuaizhichu;
	
	/**
	 * 其他支出
	 */
					
	private Float qitazhichu;
	
	/**
	 * 合计
	 */
					
	private Float heji;
	
	/**
	 * 统计时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date tongjishijian;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	
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
	 * 设置：统计标题
	 */
	public void setTongjibiaoti(String tongjibiaoti) {
		this.tongjibiaoti = tongjibiaoti;
	}
	/**
	 * 获取：统计标题
	 */
	public String getTongjibiaoti() {
		return tongjibiaoti;
	}
	/**
	 * 设置：会员收入
	 */
	public void setHuiyuanshouru(Float huiyuanshouru) {
		this.huiyuanshouru = huiyuanshouru;
	}
	/**
	 * 获取：会员收入
	 */
	public Float getHuiyuanshouru() {
		return huiyuanshouru;
	}
	/**
	 * 设置：课程收入
	 */
	public void setKechengshouru(Float kechengshouru) {
		this.kechengshouru = kechengshouru;
	}
	/**
	 * 获取：课程收入
	 */
	public Float getKechengshouru() {
		return kechengshouru;
	}
	/**
	 * 设置：其他收入
	 */
	public void setQitashouru(Float qitashouru) {
		this.qitashouru = qitashouru;
	}
	/**
	 * 获取：其他收入
	 */
	public Float getQitashouru() {
		return qitashouru;
	}
	/**
	 * 设置：工资支出
	 */
	public void setGongzizhichu(Float gongzizhichu) {
		this.gongzizhichu = gongzizhichu;
	}
	/**
	 * 获取：工资支出
	 */
	public Float getGongzizhichu() {
		return gongzizhichu;
	}
	/**
	 * 设置：损坏支出
	 */
	public void setSunhuaizhichu(Float sunhuaizhichu) {
		this.sunhuaizhichu = sunhuaizhichu;
	}
	/**
	 * 获取：损坏支出
	 */
	public Float getSunhuaizhichu() {
		return sunhuaizhichu;
	}
	/**
	 * 设置：其他支出
	 */
	public void setQitazhichu(Float qitazhichu) {
		this.qitazhichu = qitazhichu;
	}
	/**
	 * 获取：其他支出
	 */
	public Float getQitazhichu() {
		return qitazhichu;
	}
	/**
	 * 设置：合计
	 */
	public void setHeji(Float heji) {
		this.heji = heji;
	}
	/**
	 * 获取：合计
	 */
	public Float getHeji() {
		return heji;
	}
	/**
	 * 设置：统计时间
	 */
	public void setTongjishijian(Date tongjishijian) {
		this.tongjishijian = tongjishijian;
	}
	/**
	 * 获取：统计时间
	 */
	public Date getTongjishijian() {
		return tongjishijian;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}

}

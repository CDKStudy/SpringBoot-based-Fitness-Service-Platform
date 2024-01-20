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
 * 会员卡
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 

 */
@TableName("huiyuanka")
public class HuiyuankaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuiyuankaEntity() {
		
	}
	
	public HuiyuankaEntity(T t) {
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
	 * 会员等级
	 */
					
	private String huiyuandengji;
	
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

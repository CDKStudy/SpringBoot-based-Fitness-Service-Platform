package com.entity.view;

import com.entity.DakaqiandaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 打卡签到
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 */
@TableName("dakaqiandao")
public class DakaqiandaoView  extends DakaqiandaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DakaqiandaoView(){
	}
 
 	public DakaqiandaoView(DakaqiandaoEntity dakaqiandaoEntity){
 	try {
			BeanUtils.copyProperties(this, dakaqiandaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

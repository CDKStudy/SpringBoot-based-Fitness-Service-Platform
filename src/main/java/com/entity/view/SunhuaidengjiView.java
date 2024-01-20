package com.entity.view;

import com.entity.SunhuaidengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 损坏登记
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-07 22:48:45 */
@TableName("sunhuaidengji")
public class SunhuaidengjiView  extends SunhuaidengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SunhuaidengjiView(){
	}
 
 	public SunhuaidengjiView(SunhuaidengjiEntity sunhuaidengjiEntity){
 	try {
			BeanUtils.copyProperties(this, sunhuaidengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

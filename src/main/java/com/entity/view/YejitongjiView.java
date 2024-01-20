package com.entity.view;

import com.entity.YejitongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 业绩统计
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 

 */
@TableName("yejitongji")
public class YejitongjiView  extends YejitongjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YejitongjiView(){
	}
 
 	public YejitongjiView(YejitongjiEntity yejitongjiEntity){
 	try {
			BeanUtils.copyProperties(this, yejitongjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

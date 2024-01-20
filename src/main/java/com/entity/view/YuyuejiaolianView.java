package com.entity.view;

import com.entity.YuyuejiaolianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 预约教练
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 

 */
@TableName("yuyuejiaolian")
public class YuyuejiaolianView  extends YuyuejiaolianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuyuejiaolianView(){
	}
 
 	public YuyuejiaolianView(YuyuejiaolianEntity yuyuejiaolianEntity){
 	try {
			BeanUtils.copyProperties(this, yuyuejiaolianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

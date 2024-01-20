package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YejitongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YejitongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YejitongjiView;


/**
 * 业绩统计
 *
 * @author 
 * @email 

 */
public interface YejitongjiService extends IService<YejitongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YejitongjiVO> selectListVO(Wrapper<YejitongjiEntity> wrapper);
   	
   	YejitongjiVO selectVO(@Param("ew") Wrapper<YejitongjiEntity> wrapper);
   	
   	List<YejitongjiView> selectListView(Wrapper<YejitongjiEntity> wrapper);
   	
   	YejitongjiView selectView(@Param("ew") Wrapper<YejitongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YejitongjiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<YejitongjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<YejitongjiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<YejitongjiEntity> wrapper);
}


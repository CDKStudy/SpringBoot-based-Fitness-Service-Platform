package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SunhuaidengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SunhuaidengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SunhuaidengjiView;


/**
 * 损坏登记
 *
 * @author 
 * @email 

 */
public interface SunhuaidengjiService extends IService<SunhuaidengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SunhuaidengjiVO> selectListVO(Wrapper<SunhuaidengjiEntity> wrapper);
   	
   	SunhuaidengjiVO selectVO(@Param("ew") Wrapper<SunhuaidengjiEntity> wrapper);
   	
   	List<SunhuaidengjiView> selectListView(Wrapper<SunhuaidengjiEntity> wrapper);
   	
   	SunhuaidengjiView selectView(@Param("ew") Wrapper<SunhuaidengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SunhuaidengjiEntity> wrapper);
   	

}


package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DakaqiandaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DakaqiandaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DakaqiandaoView;


/**
 * 打卡签到
 *
 * @author 
 * @email
 */
public interface DakaqiandaoService extends IService<DakaqiandaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DakaqiandaoVO> selectListVO(Wrapper<DakaqiandaoEntity> wrapper);
   	
   	DakaqiandaoVO selectVO(@Param("ew") Wrapper<DakaqiandaoEntity> wrapper);
   	
   	List<DakaqiandaoView> selectListView(Wrapper<DakaqiandaoEntity> wrapper);
   	
   	DakaqiandaoView selectView(@Param("ew") Wrapper<DakaqiandaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DakaqiandaoEntity> wrapper);
   	

}


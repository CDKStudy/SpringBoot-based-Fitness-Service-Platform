package com.dao;

import com.entity.DakaqiandaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DakaqiandaoVO;
import com.entity.view.DakaqiandaoView;


/**
 * 打卡签到
 * 
 * @author 
 * @email
 */
public interface DakaqiandaoDao extends BaseMapper<DakaqiandaoEntity> {
	
	List<DakaqiandaoVO> selectListVO(@Param("ew") Wrapper<DakaqiandaoEntity> wrapper);
	
	DakaqiandaoVO selectVO(@Param("ew") Wrapper<DakaqiandaoEntity> wrapper);
	
	List<DakaqiandaoView> selectListView(@Param("ew") Wrapper<DakaqiandaoEntity> wrapper);

	List<DakaqiandaoView> selectListView(Pagination page,@Param("ew") Wrapper<DakaqiandaoEntity> wrapper);
	
	DakaqiandaoView selectView(@Param("ew") Wrapper<DakaqiandaoEntity> wrapper);
	

}

package com.dao;

import com.entity.YejitongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YejitongjiVO;
import com.entity.view.YejitongjiView;


/**
 * 业绩统计
 * 
 * @author 
 * @email
 */
public interface YejitongjiDao extends BaseMapper<YejitongjiEntity> {
	
	List<YejitongjiVO> selectListVO(@Param("ew") Wrapper<YejitongjiEntity> wrapper);
	
	YejitongjiVO selectVO(@Param("ew") Wrapper<YejitongjiEntity> wrapper);
	
	List<YejitongjiView> selectListView(@Param("ew") Wrapper<YejitongjiEntity> wrapper);

	List<YejitongjiView> selectListView(Pagination page,@Param("ew") Wrapper<YejitongjiEntity> wrapper);
	
	YejitongjiView selectView(@Param("ew") Wrapper<YejitongjiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YejitongjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YejitongjiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YejitongjiEntity> wrapper);
}

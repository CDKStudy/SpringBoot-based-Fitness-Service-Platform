package com.dao;

import com.entity.SunhuaidengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SunhuaidengjiVO;
import com.entity.view.SunhuaidengjiView;


/**
 * 损坏登记
 * 
 * @author 
 * @email
 */
public interface SunhuaidengjiDao extends BaseMapper<SunhuaidengjiEntity> {
	
	List<SunhuaidengjiVO> selectListVO(@Param("ew") Wrapper<SunhuaidengjiEntity> wrapper);
	
	SunhuaidengjiVO selectVO(@Param("ew") Wrapper<SunhuaidengjiEntity> wrapper);
	
	List<SunhuaidengjiView> selectListView(@Param("ew") Wrapper<SunhuaidengjiEntity> wrapper);

	List<SunhuaidengjiView> selectListView(Pagination page,@Param("ew") Wrapper<SunhuaidengjiEntity> wrapper);
	
	SunhuaidengjiView selectView(@Param("ew") Wrapper<SunhuaidengjiEntity> wrapper);
	

}

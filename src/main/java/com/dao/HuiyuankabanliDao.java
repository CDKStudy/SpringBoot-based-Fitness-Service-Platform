package com.dao;

import com.entity.HuiyuankabanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuankabanliVO;
import com.entity.view.HuiyuankabanliView;


/**
 * 会员卡办理
 * 
 * @author 
 * @email
 */
public interface HuiyuankabanliDao extends BaseMapper<HuiyuankabanliEntity> {
	
	List<HuiyuankabanliVO> selectListVO(@Param("ew") Wrapper<HuiyuankabanliEntity> wrapper);
	
	HuiyuankabanliVO selectVO(@Param("ew") Wrapper<HuiyuankabanliEntity> wrapper);
	
	List<HuiyuankabanliView> selectListView(@Param("ew") Wrapper<HuiyuankabanliEntity> wrapper);

	List<HuiyuankabanliView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuankabanliEntity> wrapper);
	
	HuiyuankabanliView selectView(@Param("ew") Wrapper<HuiyuankabanliEntity> wrapper);
	

}

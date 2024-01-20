package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DakaqiandaoDao;
import com.entity.DakaqiandaoEntity;
import com.service.DakaqiandaoService;
import com.entity.vo.DakaqiandaoVO;
import com.entity.view.DakaqiandaoView;

@Service("dakaqiandaoService")
public class DakaqiandaoServiceImpl extends ServiceImpl<DakaqiandaoDao, DakaqiandaoEntity> implements DakaqiandaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DakaqiandaoEntity> page = this.selectPage(
                new Query<DakaqiandaoEntity>(params).getPage(),
                new EntityWrapper<DakaqiandaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DakaqiandaoEntity> wrapper) {
		  Page<DakaqiandaoView> page =new Query<DakaqiandaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DakaqiandaoVO> selectListVO(Wrapper<DakaqiandaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DakaqiandaoVO selectVO(Wrapper<DakaqiandaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DakaqiandaoView> selectListView(Wrapper<DakaqiandaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DakaqiandaoView selectView(Wrapper<DakaqiandaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

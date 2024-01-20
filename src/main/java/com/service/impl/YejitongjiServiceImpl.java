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


import com.dao.YejitongjiDao;
import com.entity.YejitongjiEntity;
import com.service.YejitongjiService;
import com.entity.vo.YejitongjiVO;
import com.entity.view.YejitongjiView;

@Service("yejitongjiService")
public class YejitongjiServiceImpl extends ServiceImpl<YejitongjiDao, YejitongjiEntity> implements YejitongjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YejitongjiEntity> page = this.selectPage(
                new Query<YejitongjiEntity>(params).getPage(),
                new EntityWrapper<YejitongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YejitongjiEntity> wrapper) {
		  Page<YejitongjiView> page =new Query<YejitongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YejitongjiVO> selectListVO(Wrapper<YejitongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YejitongjiVO selectVO(Wrapper<YejitongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YejitongjiView> selectListView(Wrapper<YejitongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YejitongjiView selectView(Wrapper<YejitongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<YejitongjiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<YejitongjiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<YejitongjiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}

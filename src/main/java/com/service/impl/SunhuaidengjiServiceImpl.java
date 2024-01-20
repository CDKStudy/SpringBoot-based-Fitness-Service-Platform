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


import com.dao.SunhuaidengjiDao;
import com.entity.SunhuaidengjiEntity;
import com.service.SunhuaidengjiService;
import com.entity.vo.SunhuaidengjiVO;
import com.entity.view.SunhuaidengjiView;

@Service("sunhuaidengjiService")
public class SunhuaidengjiServiceImpl extends ServiceImpl<SunhuaidengjiDao, SunhuaidengjiEntity> implements SunhuaidengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SunhuaidengjiEntity> page = this.selectPage(
                new Query<SunhuaidengjiEntity>(params).getPage(),
                new EntityWrapper<SunhuaidengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SunhuaidengjiEntity> wrapper) {
		  Page<SunhuaidengjiView> page =new Query<SunhuaidengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SunhuaidengjiVO> selectListVO(Wrapper<SunhuaidengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SunhuaidengjiVO selectVO(Wrapper<SunhuaidengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SunhuaidengjiView> selectListView(Wrapper<SunhuaidengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SunhuaidengjiView selectView(Wrapper<SunhuaidengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

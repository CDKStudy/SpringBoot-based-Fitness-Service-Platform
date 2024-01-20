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


import com.dao.HuiyuankabanliDao;
import com.entity.HuiyuankabanliEntity;
import com.service.HuiyuankabanliService;
import com.entity.vo.HuiyuankabanliVO;
import com.entity.view.HuiyuankabanliView;

@Service("huiyuankabanliService")
public class HuiyuankabanliServiceImpl extends ServiceImpl<HuiyuankabanliDao, HuiyuankabanliEntity> implements HuiyuankabanliService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyuankabanliEntity> page = this.selectPage(
                new Query<HuiyuankabanliEntity>(params).getPage(),
                new EntityWrapper<HuiyuankabanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyuankabanliEntity> wrapper) {
		  Page<HuiyuankabanliView> page =new Query<HuiyuankabanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyuankabanliVO> selectListVO(Wrapper<HuiyuankabanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyuankabanliVO selectVO(Wrapper<HuiyuankabanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyuankabanliView> selectListView(Wrapper<HuiyuankabanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyuankabanliView selectView(Wrapper<HuiyuankabanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuankabanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuankabanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuankabanliView;


/**
 * 会员卡办理
 *
 * @author 
 * @email
 */
public interface HuiyuankabanliService extends IService<HuiyuankabanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuankabanliVO> selectListVO(Wrapper<HuiyuankabanliEntity> wrapper);
   	
   	HuiyuankabanliVO selectVO(@Param("ew") Wrapper<HuiyuankabanliEntity> wrapper);
   	
   	List<HuiyuankabanliView> selectListView(Wrapper<HuiyuankabanliEntity> wrapper);
   	
   	HuiyuankabanliView selectView(@Param("ew") Wrapper<HuiyuankabanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuankabanliEntity> wrapper);
   	

}


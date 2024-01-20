package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DakaqiandaoEntity;
import com.entity.view.DakaqiandaoView;

import com.service.DakaqiandaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 打卡签到
 * 后端接口
 * @author 
 * @email
 */
@RestController
@RequestMapping("/dakaqiandao")
@Api(tags="打卡签到接口测试")
public class DakaqiandaoController {
    @Autowired
    private DakaqiandaoService dakaqiandaoService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DakaqiandaoEntity dakaqiandao,
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			dakaqiandao.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<DakaqiandaoEntity> ew = new EntityWrapper<DakaqiandaoEntity>();

		PageUtils page = dakaqiandaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dakaqiandao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DakaqiandaoEntity dakaqiandao, 
		HttpServletRequest request){
        EntityWrapper<DakaqiandaoEntity> ew = new EntityWrapper<DakaqiandaoEntity>();
		PageUtils page = dakaqiandaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dakaqiandao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DakaqiandaoEntity dakaqiandao){
       	EntityWrapper<DakaqiandaoEntity> ew = new EntityWrapper<DakaqiandaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( dakaqiandao, "dakaqiandao")); 
        return R.ok().put("data", dakaqiandaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DakaqiandaoEntity dakaqiandao){
        EntityWrapper< DakaqiandaoEntity> ew = new EntityWrapper< DakaqiandaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( dakaqiandao, "dakaqiandao")); 
		DakaqiandaoView dakaqiandaoView =  dakaqiandaoService.selectView(ew);
		return R.ok("查询打卡签到成功").put("data", dakaqiandaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DakaqiandaoEntity dakaqiandao = dakaqiandaoService.selectById(id);
        return R.ok().put("data", dakaqiandao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DakaqiandaoEntity dakaqiandao = dakaqiandaoService.selectById(id);
        return R.ok().put("data", dakaqiandao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    @ApiOperation(value="新建打卡", notes="检测照片上传")
    public R save(@RequestBody DakaqiandaoEntity dakaqiandao, HttpServletRequest request){
    	dakaqiandao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dakaqiandao);
        //
        dakaqiandaoService.insert(dakaqiandao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DakaqiandaoEntity dakaqiandao, HttpServletRequest request){
    	dakaqiandao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dakaqiandao);
        dakaqiandaoService.insert(dakaqiandao);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DakaqiandaoEntity dakaqiandao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(dakaqiandao);
        dakaqiandaoService.updateById(dakaqiandao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        dakaqiandaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DakaqiandaoEntity> wrapper = new EntityWrapper<DakaqiandaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = dakaqiandaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}

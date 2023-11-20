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


import com.dao.XinlingzhuanlanDao;
import com.entity.XinlingzhuanlanEntity;
import com.service.XinlingzhuanlanService;
import com.entity.vo.XinlingzhuanlanVO;
import com.entity.view.XinlingzhuanlanView;

@Service("xinlingzhuanlanService")
public class XinlingzhuanlanServiceImpl extends ServiceImpl<XinlingzhuanlanDao, XinlingzhuanlanEntity> implements XinlingzhuanlanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinlingzhuanlanEntity> page = this.selectPage(
                new Query<XinlingzhuanlanEntity>(params).getPage(),
                new EntityWrapper<XinlingzhuanlanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinlingzhuanlanEntity> wrapper) {
		  Page<XinlingzhuanlanView> page =new Query<XinlingzhuanlanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinlingzhuanlanVO> selectListVO(Wrapper<XinlingzhuanlanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinlingzhuanlanVO selectVO(Wrapper<XinlingzhuanlanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinlingzhuanlanView> selectListView(Wrapper<XinlingzhuanlanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinlingzhuanlanView selectView(Wrapper<XinlingzhuanlanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

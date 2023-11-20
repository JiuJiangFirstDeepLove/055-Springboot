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


import com.dao.XiaozhitiaoDao;
import com.entity.XiaozhitiaoEntity;
import com.service.XiaozhitiaoService;
import com.entity.vo.XiaozhitiaoVO;
import com.entity.view.XiaozhitiaoView;

@Service("xiaozhitiaoService")
public class XiaozhitiaoServiceImpl extends ServiceImpl<XiaozhitiaoDao, XiaozhitiaoEntity> implements XiaozhitiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaozhitiaoEntity> page = this.selectPage(
                new Query<XiaozhitiaoEntity>(params).getPage(),
                new EntityWrapper<XiaozhitiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaozhitiaoEntity> wrapper) {
		  Page<XiaozhitiaoView> page =new Query<XiaozhitiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaozhitiaoVO> selectListVO(Wrapper<XiaozhitiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaozhitiaoVO selectVO(Wrapper<XiaozhitiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaozhitiaoView> selectListView(Wrapper<XiaozhitiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaozhitiaoView selectView(Wrapper<XiaozhitiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

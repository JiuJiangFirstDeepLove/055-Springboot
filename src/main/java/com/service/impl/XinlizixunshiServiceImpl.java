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


import com.dao.XinlizixunshiDao;
import com.entity.XinlizixunshiEntity;
import com.service.XinlizixunshiService;
import com.entity.vo.XinlizixunshiVO;
import com.entity.view.XinlizixunshiView;

@Service("xinlizixunshiService")
public class XinlizixunshiServiceImpl extends ServiceImpl<XinlizixunshiDao, XinlizixunshiEntity> implements XinlizixunshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinlizixunshiEntity> page = this.selectPage(
                new Query<XinlizixunshiEntity>(params).getPage(),
                new EntityWrapper<XinlizixunshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinlizixunshiEntity> wrapper) {
		  Page<XinlizixunshiView> page =new Query<XinlizixunshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinlizixunshiVO> selectListVO(Wrapper<XinlizixunshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinlizixunshiVO selectVO(Wrapper<XinlizixunshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinlizixunshiView> selectListView(Wrapper<XinlizixunshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinlizixunshiView selectView(Wrapper<XinlizixunshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

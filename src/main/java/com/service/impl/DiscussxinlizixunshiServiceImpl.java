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


import com.dao.DiscussxinlizixunshiDao;
import com.entity.DiscussxinlizixunshiEntity;
import com.service.DiscussxinlizixunshiService;
import com.entity.vo.DiscussxinlizixunshiVO;
import com.entity.view.DiscussxinlizixunshiView;

@Service("discussxinlizixunshiService")
public class DiscussxinlizixunshiServiceImpl extends ServiceImpl<DiscussxinlizixunshiDao, DiscussxinlizixunshiEntity> implements DiscussxinlizixunshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxinlizixunshiEntity> page = this.selectPage(
                new Query<DiscussxinlizixunshiEntity>(params).getPage(),
                new EntityWrapper<DiscussxinlizixunshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxinlizixunshiEntity> wrapper) {
		  Page<DiscussxinlizixunshiView> page =new Query<DiscussxinlizixunshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxinlizixunshiVO> selectListVO(Wrapper<DiscussxinlizixunshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxinlizixunshiVO selectVO(Wrapper<DiscussxinlizixunshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxinlizixunshiView> selectListView(Wrapper<DiscussxinlizixunshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxinlizixunshiView selectView(Wrapper<DiscussxinlizixunshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

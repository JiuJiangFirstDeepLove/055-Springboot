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


import com.dao.YaliceshiDao;
import com.entity.YaliceshiEntity;
import com.service.YaliceshiService;
import com.entity.vo.YaliceshiVO;
import com.entity.view.YaliceshiView;

@Service("yaliceshiService")
public class YaliceshiServiceImpl extends ServiceImpl<YaliceshiDao, YaliceshiEntity> implements YaliceshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YaliceshiEntity> page = this.selectPage(
                new Query<YaliceshiEntity>(params).getPage(),
                new EntityWrapper<YaliceshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YaliceshiEntity> wrapper) {
		  Page<YaliceshiView> page =new Query<YaliceshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YaliceshiVO> selectListVO(Wrapper<YaliceshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YaliceshiVO selectVO(Wrapper<YaliceshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YaliceshiView> selectListView(Wrapper<YaliceshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YaliceshiView selectView(Wrapper<YaliceshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

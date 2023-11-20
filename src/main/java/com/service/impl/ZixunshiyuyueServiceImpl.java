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


import com.dao.ZixunshiyuyueDao;
import com.entity.ZixunshiyuyueEntity;
import com.service.ZixunshiyuyueService;
import com.entity.vo.ZixunshiyuyueVO;
import com.entity.view.ZixunshiyuyueView;

@Service("zixunshiyuyueService")
public class ZixunshiyuyueServiceImpl extends ServiceImpl<ZixunshiyuyueDao, ZixunshiyuyueEntity> implements ZixunshiyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZixunshiyuyueEntity> page = this.selectPage(
                new Query<ZixunshiyuyueEntity>(params).getPage(),
                new EntityWrapper<ZixunshiyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZixunshiyuyueEntity> wrapper) {
		  Page<ZixunshiyuyueView> page =new Query<ZixunshiyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZixunshiyuyueVO> selectListVO(Wrapper<ZixunshiyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZixunshiyuyueVO selectVO(Wrapper<ZixunshiyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZixunshiyuyueView> selectListView(Wrapper<ZixunshiyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZixunshiyuyueView selectView(Wrapper<ZixunshiyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

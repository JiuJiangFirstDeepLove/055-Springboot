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


import com.dao.CeshishujuDao;
import com.entity.CeshishujuEntity;
import com.service.CeshishujuService;
import com.entity.vo.CeshishujuVO;
import com.entity.view.CeshishujuView;

@Service("ceshishujuService")
public class CeshishujuServiceImpl extends ServiceImpl<CeshishujuDao, CeshishujuEntity> implements CeshishujuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CeshishujuEntity> page = this.selectPage(
                new Query<CeshishujuEntity>(params).getPage(),
                new EntityWrapper<CeshishujuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CeshishujuEntity> wrapper) {
		  Page<CeshishujuView> page =new Query<CeshishujuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CeshishujuVO> selectListVO(Wrapper<CeshishujuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CeshishujuVO selectVO(Wrapper<CeshishujuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CeshishujuView> selectListView(Wrapper<CeshishujuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CeshishujuView selectView(Wrapper<CeshishujuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

package com.dao;

import com.entity.XinlizixunshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinlizixunshiVO;
import com.entity.view.XinlizixunshiView;


/**
 * 心理咨询师
 * 
 * @author 
 * @email 
 * @date 2021-01-19 21:46:13
 */
public interface XinlizixunshiDao extends BaseMapper<XinlizixunshiEntity> {
	
	List<XinlizixunshiVO> selectListVO(@Param("ew") Wrapper<XinlizixunshiEntity> wrapper);
	
	XinlizixunshiVO selectVO(@Param("ew") Wrapper<XinlizixunshiEntity> wrapper);
	
	List<XinlizixunshiView> selectListView(@Param("ew") Wrapper<XinlizixunshiEntity> wrapper);

	List<XinlizixunshiView> selectListView(Pagination page,@Param("ew") Wrapper<XinlizixunshiEntity> wrapper);
	
	XinlizixunshiView selectView(@Param("ew") Wrapper<XinlizixunshiEntity> wrapper);
	
}

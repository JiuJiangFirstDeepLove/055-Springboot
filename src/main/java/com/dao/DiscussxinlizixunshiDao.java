package com.dao;

import com.entity.DiscussxinlizixunshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxinlizixunshiVO;
import com.entity.view.DiscussxinlizixunshiView;


/**
 * 心理咨询师评论表
 * 
 * @author 
 * @email 
 * @date 2021-01-19 21:46:13
 */
public interface DiscussxinlizixunshiDao extends BaseMapper<DiscussxinlizixunshiEntity> {
	
	List<DiscussxinlizixunshiVO> selectListVO(@Param("ew") Wrapper<DiscussxinlizixunshiEntity> wrapper);
	
	DiscussxinlizixunshiVO selectVO(@Param("ew") Wrapper<DiscussxinlizixunshiEntity> wrapper);
	
	List<DiscussxinlizixunshiView> selectListView(@Param("ew") Wrapper<DiscussxinlizixunshiEntity> wrapper);

	List<DiscussxinlizixunshiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxinlizixunshiEntity> wrapper);
	
	DiscussxinlizixunshiView selectView(@Param("ew") Wrapper<DiscussxinlizixunshiEntity> wrapper);
	
}

package com.dao;

import com.entity.YaliceshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YaliceshiVO;
import com.entity.view.YaliceshiView;


/**
 * 压力测试
 * 
 * @author 
 * @email 
 * @date 2021-01-19 21:46:13
 */
public interface YaliceshiDao extends BaseMapper<YaliceshiEntity> {
	
	List<YaliceshiVO> selectListVO(@Param("ew") Wrapper<YaliceshiEntity> wrapper);
	
	YaliceshiVO selectVO(@Param("ew") Wrapper<YaliceshiEntity> wrapper);
	
	List<YaliceshiView> selectListView(@Param("ew") Wrapper<YaliceshiEntity> wrapper);

	List<YaliceshiView> selectListView(Pagination page,@Param("ew") Wrapper<YaliceshiEntity> wrapper);
	
	YaliceshiView selectView(@Param("ew") Wrapper<YaliceshiEntity> wrapper);
	
}

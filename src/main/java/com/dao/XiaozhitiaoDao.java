package com.dao;

import com.entity.XiaozhitiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaozhitiaoVO;
import com.entity.view.XiaozhitiaoView;


/**
 * 小纸条
 * 
 * @author 
 * @email 
 * @date 2021-01-19 21:46:13
 */
public interface XiaozhitiaoDao extends BaseMapper<XiaozhitiaoEntity> {
	
	List<XiaozhitiaoVO> selectListVO(@Param("ew") Wrapper<XiaozhitiaoEntity> wrapper);
	
	XiaozhitiaoVO selectVO(@Param("ew") Wrapper<XiaozhitiaoEntity> wrapper);
	
	List<XiaozhitiaoView> selectListView(@Param("ew") Wrapper<XiaozhitiaoEntity> wrapper);

	List<XiaozhitiaoView> selectListView(Pagination page,@Param("ew") Wrapper<XiaozhitiaoEntity> wrapper);
	
	XiaozhitiaoView selectView(@Param("ew") Wrapper<XiaozhitiaoEntity> wrapper);
	
}

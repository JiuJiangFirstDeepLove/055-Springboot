package com.dao;

import com.entity.XinlingzhuanlanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinlingzhuanlanVO;
import com.entity.view.XinlingzhuanlanView;


/**
 * 心灵专栏
 * 
 * @author 
 * @email 
 * @date 2021-01-19 21:46:13
 */
public interface XinlingzhuanlanDao extends BaseMapper<XinlingzhuanlanEntity> {
	
	List<XinlingzhuanlanVO> selectListVO(@Param("ew") Wrapper<XinlingzhuanlanEntity> wrapper);
	
	XinlingzhuanlanVO selectVO(@Param("ew") Wrapper<XinlingzhuanlanEntity> wrapper);
	
	List<XinlingzhuanlanView> selectListView(@Param("ew") Wrapper<XinlingzhuanlanEntity> wrapper);

	List<XinlingzhuanlanView> selectListView(Pagination page,@Param("ew") Wrapper<XinlingzhuanlanEntity> wrapper);
	
	XinlingzhuanlanView selectView(@Param("ew") Wrapper<XinlingzhuanlanEntity> wrapper);
	
}

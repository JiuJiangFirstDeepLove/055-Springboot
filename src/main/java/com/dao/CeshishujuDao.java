package com.dao;

import com.entity.CeshishujuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CeshishujuVO;
import com.entity.view.CeshishujuView;


/**
 * 测试数据
 * 
 * @author 
 * @email 
 * @date 2021-01-19 21:46:13
 */
public interface CeshishujuDao extends BaseMapper<CeshishujuEntity> {
	
	List<CeshishujuVO> selectListVO(@Param("ew") Wrapper<CeshishujuEntity> wrapper);
	
	CeshishujuVO selectVO(@Param("ew") Wrapper<CeshishujuEntity> wrapper);
	
	List<CeshishujuView> selectListView(@Param("ew") Wrapper<CeshishujuEntity> wrapper);

	List<CeshishujuView> selectListView(Pagination page,@Param("ew") Wrapper<CeshishujuEntity> wrapper);
	
	CeshishujuView selectView(@Param("ew") Wrapper<CeshishujuEntity> wrapper);
	
}

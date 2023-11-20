package com.dao;

import com.entity.ZixunshiyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZixunshiyuyueVO;
import com.entity.view.ZixunshiyuyueView;


/**
 * 咨询师预约
 * 
 * @author 
 * @email 
 * @date 2021-01-19 21:46:13
 */
public interface ZixunshiyuyueDao extends BaseMapper<ZixunshiyuyueEntity> {
	
	List<ZixunshiyuyueVO> selectListVO(@Param("ew") Wrapper<ZixunshiyuyueEntity> wrapper);
	
	ZixunshiyuyueVO selectVO(@Param("ew") Wrapper<ZixunshiyuyueEntity> wrapper);
	
	List<ZixunshiyuyueView> selectListView(@Param("ew") Wrapper<ZixunshiyuyueEntity> wrapper);

	List<ZixunshiyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<ZixunshiyuyueEntity> wrapper);
	
	ZixunshiyuyueView selectView(@Param("ew") Wrapper<ZixunshiyuyueEntity> wrapper);
	
}

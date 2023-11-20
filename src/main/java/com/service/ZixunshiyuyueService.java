package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZixunshiyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZixunshiyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZixunshiyuyueView;


/**
 * 咨询师预约
 *
 * @author 
 * @email 
 * @date 2021-01-19 21:46:13
 */
public interface ZixunshiyuyueService extends IService<ZixunshiyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZixunshiyuyueVO> selectListVO(Wrapper<ZixunshiyuyueEntity> wrapper);
   	
   	ZixunshiyuyueVO selectVO(@Param("ew") Wrapper<ZixunshiyuyueEntity> wrapper);
   	
   	List<ZixunshiyuyueView> selectListView(Wrapper<ZixunshiyuyueEntity> wrapper);
   	
   	ZixunshiyuyueView selectView(@Param("ew") Wrapper<ZixunshiyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZixunshiyuyueEntity> wrapper);
   	
}


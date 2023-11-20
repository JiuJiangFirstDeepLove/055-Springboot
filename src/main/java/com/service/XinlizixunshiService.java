package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinlizixunshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinlizixunshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinlizixunshiView;


/**
 * 心理咨询师
 *
 * @author 
 * @email 
 * @date 2021-01-19 21:46:13
 */
public interface XinlizixunshiService extends IService<XinlizixunshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinlizixunshiVO> selectListVO(Wrapper<XinlizixunshiEntity> wrapper);
   	
   	XinlizixunshiVO selectVO(@Param("ew") Wrapper<XinlizixunshiEntity> wrapper);
   	
   	List<XinlizixunshiView> selectListView(Wrapper<XinlizixunshiEntity> wrapper);
   	
   	XinlizixunshiView selectView(@Param("ew") Wrapper<XinlizixunshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinlizixunshiEntity> wrapper);
   	
}


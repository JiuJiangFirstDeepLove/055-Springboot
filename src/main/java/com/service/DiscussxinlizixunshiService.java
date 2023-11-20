package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxinlizixunshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxinlizixunshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxinlizixunshiView;


/**
 * 心理咨询师评论表
 *
 * @author 
 * @email 
 * @date 2021-01-19 21:46:13
 */
public interface DiscussxinlizixunshiService extends IService<DiscussxinlizixunshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxinlizixunshiVO> selectListVO(Wrapper<DiscussxinlizixunshiEntity> wrapper);
   	
   	DiscussxinlizixunshiVO selectVO(@Param("ew") Wrapper<DiscussxinlizixunshiEntity> wrapper);
   	
   	List<DiscussxinlizixunshiView> selectListView(Wrapper<DiscussxinlizixunshiEntity> wrapper);
   	
   	DiscussxinlizixunshiView selectView(@Param("ew") Wrapper<DiscussxinlizixunshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxinlizixunshiEntity> wrapper);
   	
}


package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YaliceshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YaliceshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YaliceshiView;


/**
 * 压力测试
 *
 * @author 
 * @email 
 * @date 2021-01-19 21:46:13
 */
public interface YaliceshiService extends IService<YaliceshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YaliceshiVO> selectListVO(Wrapper<YaliceshiEntity> wrapper);
   	
   	YaliceshiVO selectVO(@Param("ew") Wrapper<YaliceshiEntity> wrapper);
   	
   	List<YaliceshiView> selectListView(Wrapper<YaliceshiEntity> wrapper);
   	
   	YaliceshiView selectView(@Param("ew") Wrapper<YaliceshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YaliceshiEntity> wrapper);
   	
}


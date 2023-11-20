package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaozhitiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaozhitiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaozhitiaoView;


/**
 * 小纸条
 *
 * @author 
 * @email 
 * @date 2021-01-19 21:46:13
 */
public interface XiaozhitiaoService extends IService<XiaozhitiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaozhitiaoVO> selectListVO(Wrapper<XiaozhitiaoEntity> wrapper);
   	
   	XiaozhitiaoVO selectVO(@Param("ew") Wrapper<XiaozhitiaoEntity> wrapper);
   	
   	List<XiaozhitiaoView> selectListView(Wrapper<XiaozhitiaoEntity> wrapper);
   	
   	XiaozhitiaoView selectView(@Param("ew") Wrapper<XiaozhitiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaozhitiaoEntity> wrapper);
   	
}


package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinlingzhuanlanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinlingzhuanlanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinlingzhuanlanView;


/**
 * 心灵专栏
 *
 * @author 
 * @email 
 * @date 2021-01-19 21:46:13
 */
public interface XinlingzhuanlanService extends IService<XinlingzhuanlanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinlingzhuanlanVO> selectListVO(Wrapper<XinlingzhuanlanEntity> wrapper);
   	
   	XinlingzhuanlanVO selectVO(@Param("ew") Wrapper<XinlingzhuanlanEntity> wrapper);
   	
   	List<XinlingzhuanlanView> selectListView(Wrapper<XinlingzhuanlanEntity> wrapper);
   	
   	XinlingzhuanlanView selectView(@Param("ew") Wrapper<XinlingzhuanlanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinlingzhuanlanEntity> wrapper);
   	
}


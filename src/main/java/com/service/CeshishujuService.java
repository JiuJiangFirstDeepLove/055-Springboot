package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CeshishujuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CeshishujuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CeshishujuView;


/**
 * 测试数据
 *
 * @author 
 * @email 
 * @date 2021-01-19 21:46:13
 */
public interface CeshishujuService extends IService<CeshishujuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CeshishujuVO> selectListVO(Wrapper<CeshishujuEntity> wrapper);
   	
   	CeshishujuVO selectVO(@Param("ew") Wrapper<CeshishujuEntity> wrapper);
   	
   	List<CeshishujuView> selectListView(Wrapper<CeshishujuEntity> wrapper);
   	
   	CeshishujuView selectView(@Param("ew") Wrapper<CeshishujuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CeshishujuEntity> wrapper);
   	
}


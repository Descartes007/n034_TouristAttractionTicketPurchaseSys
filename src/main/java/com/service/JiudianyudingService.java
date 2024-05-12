package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiudianyudingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiudianyudingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiudianyudingView;


/**
 * 酒店预订
 *
 * @author 
 * @email 
 * @date 2023-01-07 11:58:59
 */
public interface JiudianyudingService extends IService<JiudianyudingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiudianyudingVO> selectListVO(Wrapper<JiudianyudingEntity> wrapper);
   	
   	JiudianyudingVO selectVO(@Param("ew") Wrapper<JiudianyudingEntity> wrapper);
   	
   	List<JiudianyudingView> selectListView(Wrapper<JiudianyudingEntity> wrapper);
   	
   	JiudianyudingView selectView(@Param("ew") Wrapper<JiudianyudingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiudianyudingEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<JiudianyudingEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<JiudianyudingEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<JiudianyudingEntity> wrapper);



}


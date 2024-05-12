package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RemenjingdianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RemenjingdianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RemenjingdianView;


/**
 * 热门景点
 *
 * @author 
 * @email 
 * @date 2023-01-07 11:58:59
 */
public interface RemenjingdianService extends IService<RemenjingdianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RemenjingdianVO> selectListVO(Wrapper<RemenjingdianEntity> wrapper);
   	
   	RemenjingdianVO selectVO(@Param("ew") Wrapper<RemenjingdianEntity> wrapper);
   	
   	List<RemenjingdianView> selectListView(Wrapper<RemenjingdianEntity> wrapper);
   	
   	RemenjingdianView selectView(@Param("ew") Wrapper<RemenjingdianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RemenjingdianEntity> wrapper);
   	

}


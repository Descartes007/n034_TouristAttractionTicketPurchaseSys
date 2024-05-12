package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussremenjingdianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussremenjingdianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussremenjingdianView;


/**
 * 热门景点评论表
 *
 * @author 
 * @email 
 * @date 2023-01-07 11:58:59
 */
public interface DiscussremenjingdianService extends IService<DiscussremenjingdianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussremenjingdianVO> selectListVO(Wrapper<DiscussremenjingdianEntity> wrapper);
   	
   	DiscussremenjingdianVO selectVO(@Param("ew") Wrapper<DiscussremenjingdianEntity> wrapper);
   	
   	List<DiscussremenjingdianView> selectListView(Wrapper<DiscussremenjingdianEntity> wrapper);
   	
   	DiscussremenjingdianView selectView(@Param("ew") Wrapper<DiscussremenjingdianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussremenjingdianEntity> wrapper);
   	

}


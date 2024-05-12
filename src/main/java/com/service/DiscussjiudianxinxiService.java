package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiudianxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiudianxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiudianxinxiView;


/**
 * 酒店信息评论表
 *
 * @author 
 * @email 
 * @date 2023-01-07 11:58:59
 */
public interface DiscussjiudianxinxiService extends IService<DiscussjiudianxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiudianxinxiVO> selectListVO(Wrapper<DiscussjiudianxinxiEntity> wrapper);
   	
   	DiscussjiudianxinxiVO selectVO(@Param("ew") Wrapper<DiscussjiudianxinxiEntity> wrapper);
   	
   	List<DiscussjiudianxinxiView> selectListView(Wrapper<DiscussjiudianxinxiEntity> wrapper);
   	
   	DiscussjiudianxinxiView selectView(@Param("ew") Wrapper<DiscussjiudianxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiudianxinxiEntity> wrapper);
   	

}


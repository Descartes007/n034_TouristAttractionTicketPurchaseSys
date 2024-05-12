package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JipiaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JipiaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JipiaoxinxiView;


/**
 * 机票信息
 *
 * @author 
 * @email 
 * @date 2023-01-07 11:58:59
 */
public interface JipiaoxinxiService extends IService<JipiaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JipiaoxinxiVO> selectListVO(Wrapper<JipiaoxinxiEntity> wrapper);
   	
   	JipiaoxinxiVO selectVO(@Param("ew") Wrapper<JipiaoxinxiEntity> wrapper);
   	
   	List<JipiaoxinxiView> selectListView(Wrapper<JipiaoxinxiEntity> wrapper);
   	
   	JipiaoxinxiView selectView(@Param("ew") Wrapper<JipiaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JipiaoxinxiEntity> wrapper);
   	

}


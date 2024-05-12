package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JipiaoyudingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JipiaoyudingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JipiaoyudingView;


/**
 * 机票预订
 *
 * @author 
 * @email 
 * @date 2023-01-07 11:58:59
 */
public interface JipiaoyudingService extends IService<JipiaoyudingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JipiaoyudingVO> selectListVO(Wrapper<JipiaoyudingEntity> wrapper);
   	
   	JipiaoyudingVO selectVO(@Param("ew") Wrapper<JipiaoyudingEntity> wrapper);
   	
   	List<JipiaoyudingView> selectListView(Wrapper<JipiaoyudingEntity> wrapper);
   	
   	JipiaoyudingView selectView(@Param("ew") Wrapper<JipiaoyudingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JipiaoyudingEntity> wrapper);
   	

}


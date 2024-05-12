package com.dao;

import com.entity.JiudianyudingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiudianyudingVO;
import com.entity.view.JiudianyudingView;


/**
 * 酒店预订
 * 
 * @author 
 * @email 
 * @date 2023-01-07 11:58:59
 */
public interface JiudianyudingDao extends BaseMapper<JiudianyudingEntity> {
	
	List<JiudianyudingVO> selectListVO(@Param("ew") Wrapper<JiudianyudingEntity> wrapper);
	
	JiudianyudingVO selectVO(@Param("ew") Wrapper<JiudianyudingEntity> wrapper);
	
	List<JiudianyudingView> selectListView(@Param("ew") Wrapper<JiudianyudingEntity> wrapper);

	List<JiudianyudingView> selectListView(Pagination page,@Param("ew") Wrapper<JiudianyudingEntity> wrapper);
	
	JiudianyudingView selectView(@Param("ew") Wrapper<JiudianyudingEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiudianyudingEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiudianyudingEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiudianyudingEntity> wrapper);



}

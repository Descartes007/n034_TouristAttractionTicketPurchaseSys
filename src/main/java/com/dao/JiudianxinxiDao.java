package com.dao;

import com.entity.JiudianxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiudianxinxiVO;
import com.entity.view.JiudianxinxiView;


/**
 * 酒店信息
 * 
 * @author 
 * @email 
 * @date 2023-01-07 11:58:59
 */
public interface JiudianxinxiDao extends BaseMapper<JiudianxinxiEntity> {
	
	List<JiudianxinxiVO> selectListVO(@Param("ew") Wrapper<JiudianxinxiEntity> wrapper);
	
	JiudianxinxiVO selectVO(@Param("ew") Wrapper<JiudianxinxiEntity> wrapper);
	
	List<JiudianxinxiView> selectListView(@Param("ew") Wrapper<JiudianxinxiEntity> wrapper);

	List<JiudianxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JiudianxinxiEntity> wrapper);
	
	JiudianxinxiView selectView(@Param("ew") Wrapper<JiudianxinxiEntity> wrapper);
	

}

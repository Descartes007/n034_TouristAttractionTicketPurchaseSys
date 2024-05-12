package com.dao;

import com.entity.RemenjingdianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RemenjingdianVO;
import com.entity.view.RemenjingdianView;


/**
 * 热门景点
 * 
 * @author 
 * @email 
 * @date 2023-01-07 11:58:59
 */
public interface RemenjingdianDao extends BaseMapper<RemenjingdianEntity> {
	
	List<RemenjingdianVO> selectListVO(@Param("ew") Wrapper<RemenjingdianEntity> wrapper);
	
	RemenjingdianVO selectVO(@Param("ew") Wrapper<RemenjingdianEntity> wrapper);
	
	List<RemenjingdianView> selectListView(@Param("ew") Wrapper<RemenjingdianEntity> wrapper);

	List<RemenjingdianView> selectListView(Pagination page,@Param("ew") Wrapper<RemenjingdianEntity> wrapper);
	
	RemenjingdianView selectView(@Param("ew") Wrapper<RemenjingdianEntity> wrapper);
	

}

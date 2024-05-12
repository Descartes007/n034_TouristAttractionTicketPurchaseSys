package com.dao;

import com.entity.XianluleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XianluleixingVO;
import com.entity.view.XianluleixingView;


/**
 * 线路类型
 * 
 * @author 
 * @email 
 * @date 2023-01-07 11:58:59
 */
public interface XianluleixingDao extends BaseMapper<XianluleixingEntity> {
	
	List<XianluleixingVO> selectListVO(@Param("ew") Wrapper<XianluleixingEntity> wrapper);
	
	XianluleixingVO selectVO(@Param("ew") Wrapper<XianluleixingEntity> wrapper);
	
	List<XianluleixingView> selectListView(@Param("ew") Wrapper<XianluleixingEntity> wrapper);

	List<XianluleixingView> selectListView(Pagination page,@Param("ew") Wrapper<XianluleixingEntity> wrapper);
	
	XianluleixingView selectView(@Param("ew") Wrapper<XianluleixingEntity> wrapper);
	

}

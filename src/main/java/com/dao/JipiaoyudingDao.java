package com.dao;

import com.entity.JipiaoyudingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JipiaoyudingVO;
import com.entity.view.JipiaoyudingView;


/**
 * 机票预订
 * 
 * @author 
 * @email 
 * @date 2023-01-07 11:58:59
 */
public interface JipiaoyudingDao extends BaseMapper<JipiaoyudingEntity> {
	
	List<JipiaoyudingVO> selectListVO(@Param("ew") Wrapper<JipiaoyudingEntity> wrapper);
	
	JipiaoyudingVO selectVO(@Param("ew") Wrapper<JipiaoyudingEntity> wrapper);
	
	List<JipiaoyudingView> selectListView(@Param("ew") Wrapper<JipiaoyudingEntity> wrapper);

	List<JipiaoyudingView> selectListView(Pagination page,@Param("ew") Wrapper<JipiaoyudingEntity> wrapper);
	
	JipiaoyudingView selectView(@Param("ew") Wrapper<JipiaoyudingEntity> wrapper);
	

}

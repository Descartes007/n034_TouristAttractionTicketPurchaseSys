package com.dao;

import com.entity.JipiaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JipiaoxinxiVO;
import com.entity.view.JipiaoxinxiView;


/**
 * 机票信息
 * 
 * @author 
 * @email 
 * @date 2023-01-07 11:58:59
 */
public interface JipiaoxinxiDao extends BaseMapper<JipiaoxinxiEntity> {
	
	List<JipiaoxinxiVO> selectListVO(@Param("ew") Wrapper<JipiaoxinxiEntity> wrapper);
	
	JipiaoxinxiVO selectVO(@Param("ew") Wrapper<JipiaoxinxiEntity> wrapper);
	
	List<JipiaoxinxiView> selectListView(@Param("ew") Wrapper<JipiaoxinxiEntity> wrapper);

	List<JipiaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JipiaoxinxiEntity> wrapper);
	
	JipiaoxinxiView selectView(@Param("ew") Wrapper<JipiaoxinxiEntity> wrapper);
	

}

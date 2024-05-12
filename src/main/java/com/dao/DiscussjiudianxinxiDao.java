package com.dao;

import com.entity.DiscussjiudianxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiudianxinxiVO;
import com.entity.view.DiscussjiudianxinxiView;


/**
 * 酒店信息评论表
 * 
 * @author 
 * @email 
 * @date 2023-01-07 11:58:59
 */
public interface DiscussjiudianxinxiDao extends BaseMapper<DiscussjiudianxinxiEntity> {
	
	List<DiscussjiudianxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussjiudianxinxiEntity> wrapper);
	
	DiscussjiudianxinxiVO selectVO(@Param("ew") Wrapper<DiscussjiudianxinxiEntity> wrapper);
	
	List<DiscussjiudianxinxiView> selectListView(@Param("ew") Wrapper<DiscussjiudianxinxiEntity> wrapper);

	List<DiscussjiudianxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiudianxinxiEntity> wrapper);
	
	DiscussjiudianxinxiView selectView(@Param("ew") Wrapper<DiscussjiudianxinxiEntity> wrapper);
	

}

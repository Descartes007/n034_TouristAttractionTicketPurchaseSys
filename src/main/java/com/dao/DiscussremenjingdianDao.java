package com.dao;

import com.entity.DiscussremenjingdianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussremenjingdianVO;
import com.entity.view.DiscussremenjingdianView;


/**
 * 热门景点评论表
 * 
 * @author 
 * @email 
 * @date 2023-01-07 11:58:59
 */
public interface DiscussremenjingdianDao extends BaseMapper<DiscussremenjingdianEntity> {
	
	List<DiscussremenjingdianVO> selectListVO(@Param("ew") Wrapper<DiscussremenjingdianEntity> wrapper);
	
	DiscussremenjingdianVO selectVO(@Param("ew") Wrapper<DiscussremenjingdianEntity> wrapper);
	
	List<DiscussremenjingdianView> selectListView(@Param("ew") Wrapper<DiscussremenjingdianEntity> wrapper);

	List<DiscussremenjingdianView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussremenjingdianEntity> wrapper);
	
	DiscussremenjingdianView selectView(@Param("ew") Wrapper<DiscussremenjingdianEntity> wrapper);
	

}

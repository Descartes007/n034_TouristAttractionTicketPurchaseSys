package com.dao;

import com.entity.MenpiaogoumaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MenpiaogoumaiVO;
import com.entity.view.MenpiaogoumaiView;


/**
 * 门票购买
 * 
 * @author 
 * @email 
 * @date 2023-01-07 11:58:59
 */
public interface MenpiaogoumaiDao extends BaseMapper<MenpiaogoumaiEntity> {
	
	List<MenpiaogoumaiVO> selectListVO(@Param("ew") Wrapper<MenpiaogoumaiEntity> wrapper);
	
	MenpiaogoumaiVO selectVO(@Param("ew") Wrapper<MenpiaogoumaiEntity> wrapper);
	
	List<MenpiaogoumaiView> selectListView(@Param("ew") Wrapper<MenpiaogoumaiEntity> wrapper);

	List<MenpiaogoumaiView> selectListView(Pagination page,@Param("ew") Wrapper<MenpiaogoumaiEntity> wrapper);
	
	MenpiaogoumaiView selectView(@Param("ew") Wrapper<MenpiaogoumaiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<MenpiaogoumaiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<MenpiaogoumaiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<MenpiaogoumaiEntity> wrapper);



}

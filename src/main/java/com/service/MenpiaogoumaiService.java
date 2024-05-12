package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MenpiaogoumaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MenpiaogoumaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MenpiaogoumaiView;


/**
 * 门票购买
 *
 * @author 
 * @email 
 * @date 2023-01-07 11:58:59
 */
public interface MenpiaogoumaiService extends IService<MenpiaogoumaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MenpiaogoumaiVO> selectListVO(Wrapper<MenpiaogoumaiEntity> wrapper);
   	
   	MenpiaogoumaiVO selectVO(@Param("ew") Wrapper<MenpiaogoumaiEntity> wrapper);
   	
   	List<MenpiaogoumaiView> selectListView(Wrapper<MenpiaogoumaiEntity> wrapper);
   	
   	MenpiaogoumaiView selectView(@Param("ew") Wrapper<MenpiaogoumaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MenpiaogoumaiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<MenpiaogoumaiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<MenpiaogoumaiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<MenpiaogoumaiEntity> wrapper);



}


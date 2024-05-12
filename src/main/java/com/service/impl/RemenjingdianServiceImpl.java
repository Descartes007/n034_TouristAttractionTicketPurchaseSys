package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.RemenjingdianDao;
import com.entity.RemenjingdianEntity;
import com.service.RemenjingdianService;
import com.entity.vo.RemenjingdianVO;
import com.entity.view.RemenjingdianView;

@Service("remenjingdianService")
public class RemenjingdianServiceImpl extends ServiceImpl<RemenjingdianDao, RemenjingdianEntity> implements RemenjingdianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RemenjingdianEntity> page = this.selectPage(
                new Query<RemenjingdianEntity>(params).getPage(),
                new EntityWrapper<RemenjingdianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RemenjingdianEntity> wrapper) {
		  Page<RemenjingdianView> page =new Query<RemenjingdianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RemenjingdianVO> selectListVO(Wrapper<RemenjingdianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RemenjingdianVO selectVO(Wrapper<RemenjingdianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RemenjingdianView> selectListView(Wrapper<RemenjingdianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RemenjingdianView selectView(Wrapper<RemenjingdianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

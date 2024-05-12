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


import com.dao.DiscussremenjingdianDao;
import com.entity.DiscussremenjingdianEntity;
import com.service.DiscussremenjingdianService;
import com.entity.vo.DiscussremenjingdianVO;
import com.entity.view.DiscussremenjingdianView;

@Service("discussremenjingdianService")
public class DiscussremenjingdianServiceImpl extends ServiceImpl<DiscussremenjingdianDao, DiscussremenjingdianEntity> implements DiscussremenjingdianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussremenjingdianEntity> page = this.selectPage(
                new Query<DiscussremenjingdianEntity>(params).getPage(),
                new EntityWrapper<DiscussremenjingdianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussremenjingdianEntity> wrapper) {
		  Page<DiscussremenjingdianView> page =new Query<DiscussremenjingdianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussremenjingdianVO> selectListVO(Wrapper<DiscussremenjingdianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussremenjingdianVO selectVO(Wrapper<DiscussremenjingdianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussremenjingdianView> selectListView(Wrapper<DiscussremenjingdianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussremenjingdianView selectView(Wrapper<DiscussremenjingdianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

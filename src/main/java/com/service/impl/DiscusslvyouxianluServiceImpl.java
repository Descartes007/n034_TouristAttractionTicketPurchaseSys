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


import com.dao.DiscusslvyouxianluDao;
import com.entity.DiscusslvyouxianluEntity;
import com.service.DiscusslvyouxianluService;
import com.entity.vo.DiscusslvyouxianluVO;
import com.entity.view.DiscusslvyouxianluView;

@Service("discusslvyouxianluService")
public class DiscusslvyouxianluServiceImpl extends ServiceImpl<DiscusslvyouxianluDao, DiscusslvyouxianluEntity> implements DiscusslvyouxianluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusslvyouxianluEntity> page = this.selectPage(
                new Query<DiscusslvyouxianluEntity>(params).getPage(),
                new EntityWrapper<DiscusslvyouxianluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusslvyouxianluEntity> wrapper) {
		  Page<DiscusslvyouxianluView> page =new Query<DiscusslvyouxianluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusslvyouxianluVO> selectListVO(Wrapper<DiscusslvyouxianluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusslvyouxianluVO selectVO(Wrapper<DiscusslvyouxianluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusslvyouxianluView> selectListView(Wrapper<DiscusslvyouxianluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusslvyouxianluView selectView(Wrapper<DiscusslvyouxianluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

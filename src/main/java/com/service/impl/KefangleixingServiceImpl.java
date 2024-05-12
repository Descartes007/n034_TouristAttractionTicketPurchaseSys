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


import com.dao.KefangleixingDao;
import com.entity.KefangleixingEntity;
import com.service.KefangleixingService;
import com.entity.vo.KefangleixingVO;
import com.entity.view.KefangleixingView;

@Service("kefangleixingService")
public class KefangleixingServiceImpl extends ServiceImpl<KefangleixingDao, KefangleixingEntity> implements KefangleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KefangleixingEntity> page = this.selectPage(
                new Query<KefangleixingEntity>(params).getPage(),
                new EntityWrapper<KefangleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KefangleixingEntity> wrapper) {
		  Page<KefangleixingView> page =new Query<KefangleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KefangleixingVO> selectListVO(Wrapper<KefangleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KefangleixingVO selectVO(Wrapper<KefangleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KefangleixingView> selectListView(Wrapper<KefangleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KefangleixingView selectView(Wrapper<KefangleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

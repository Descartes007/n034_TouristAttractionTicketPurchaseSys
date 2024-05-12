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


import com.dao.XianluleixingDao;
import com.entity.XianluleixingEntity;
import com.service.XianluleixingService;
import com.entity.vo.XianluleixingVO;
import com.entity.view.XianluleixingView;

@Service("xianluleixingService")
public class XianluleixingServiceImpl extends ServiceImpl<XianluleixingDao, XianluleixingEntity> implements XianluleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XianluleixingEntity> page = this.selectPage(
                new Query<XianluleixingEntity>(params).getPage(),
                new EntityWrapper<XianluleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XianluleixingEntity> wrapper) {
		  Page<XianluleixingView> page =new Query<XianluleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XianluleixingVO> selectListVO(Wrapper<XianluleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XianluleixingVO selectVO(Wrapper<XianluleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XianluleixingView> selectListView(Wrapper<XianluleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XianluleixingView selectView(Wrapper<XianluleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

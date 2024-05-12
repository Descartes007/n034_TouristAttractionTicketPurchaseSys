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


import com.dao.JipiaoyudingDao;
import com.entity.JipiaoyudingEntity;
import com.service.JipiaoyudingService;
import com.entity.vo.JipiaoyudingVO;
import com.entity.view.JipiaoyudingView;

@Service("jipiaoyudingService")
public class JipiaoyudingServiceImpl extends ServiceImpl<JipiaoyudingDao, JipiaoyudingEntity> implements JipiaoyudingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JipiaoyudingEntity> page = this.selectPage(
                new Query<JipiaoyudingEntity>(params).getPage(),
                new EntityWrapper<JipiaoyudingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JipiaoyudingEntity> wrapper) {
		  Page<JipiaoyudingView> page =new Query<JipiaoyudingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JipiaoyudingVO> selectListVO(Wrapper<JipiaoyudingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JipiaoyudingVO selectVO(Wrapper<JipiaoyudingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JipiaoyudingView> selectListView(Wrapper<JipiaoyudingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JipiaoyudingView selectView(Wrapper<JipiaoyudingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

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


import com.dao.JipiaoxinxiDao;
import com.entity.JipiaoxinxiEntity;
import com.service.JipiaoxinxiService;
import com.entity.vo.JipiaoxinxiVO;
import com.entity.view.JipiaoxinxiView;

@Service("jipiaoxinxiService")
public class JipiaoxinxiServiceImpl extends ServiceImpl<JipiaoxinxiDao, JipiaoxinxiEntity> implements JipiaoxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JipiaoxinxiEntity> page = this.selectPage(
                new Query<JipiaoxinxiEntity>(params).getPage(),
                new EntityWrapper<JipiaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JipiaoxinxiEntity> wrapper) {
		  Page<JipiaoxinxiView> page =new Query<JipiaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JipiaoxinxiVO> selectListVO(Wrapper<JipiaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JipiaoxinxiVO selectVO(Wrapper<JipiaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JipiaoxinxiView> selectListView(Wrapper<JipiaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JipiaoxinxiView selectView(Wrapper<JipiaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

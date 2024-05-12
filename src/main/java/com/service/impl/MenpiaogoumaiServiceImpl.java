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


import com.dao.MenpiaogoumaiDao;
import com.entity.MenpiaogoumaiEntity;
import com.service.MenpiaogoumaiService;
import com.entity.vo.MenpiaogoumaiVO;
import com.entity.view.MenpiaogoumaiView;

@Service("menpiaogoumaiService")
public class MenpiaogoumaiServiceImpl extends ServiceImpl<MenpiaogoumaiDao, MenpiaogoumaiEntity> implements MenpiaogoumaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MenpiaogoumaiEntity> page = this.selectPage(
                new Query<MenpiaogoumaiEntity>(params).getPage(),
                new EntityWrapper<MenpiaogoumaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MenpiaogoumaiEntity> wrapper) {
		  Page<MenpiaogoumaiView> page =new Query<MenpiaogoumaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MenpiaogoumaiVO> selectListVO(Wrapper<MenpiaogoumaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MenpiaogoumaiVO selectVO(Wrapper<MenpiaogoumaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MenpiaogoumaiView> selectListView(Wrapper<MenpiaogoumaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MenpiaogoumaiView selectView(Wrapper<MenpiaogoumaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<MenpiaogoumaiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<MenpiaogoumaiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<MenpiaogoumaiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}

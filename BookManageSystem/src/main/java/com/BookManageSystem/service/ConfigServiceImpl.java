package com.BookManageSystem.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.BookManageSystem.dao.ConfigDao;
import com.BookManageSystem.entity.Config;

@Service("configService")
public class ConfigServiceImpl implements ConfigService {
	
	@Resource
	private ConfigDao configDao;
	
	@Override
	public Config findById(Integer id) {
		return configDao.findId(id);
	}

}

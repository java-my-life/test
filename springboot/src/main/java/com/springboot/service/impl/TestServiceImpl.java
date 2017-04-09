package com.springboot.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.dao.TestMapper;
import com.springboot.service.TestService;

@Component
@com.springboot.dubbo.Service
public class TestServiceImpl implements TestService {
	@Autowired
	TestMapper testMapper;
	
	@Transactional
	@Override
	public List<Map> list() {
		// TODO Auto-generated method stub
		System.out.println("------------------");
		Map<String,String> map = new HashMap<String,String>();
		map.put("p1", "p1");
		map.put("p2", "p2");
		testMapper.insert(map);
		map.put("p1", "p1");
		map.put("p2", "p222222222222222222222222222");
		testMapper.insert(map);
		return testMapper.test();
	}

}

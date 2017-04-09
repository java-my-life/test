package com.springboot.dao;

import java.util.List;
import java.util.Map;
public interface TestMapper {
	public List<Map> test();
	
	public int insert(Map map);
}

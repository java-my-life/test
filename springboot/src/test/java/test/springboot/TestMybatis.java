package test.springboot;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springboot.Application;
import com.springboot.dao.TestMapper;
import com.springboot.service.TestService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application.class)
public class TestMybatis {
	@Autowired
	TestMapper testMapper;
	@Autowired
	TestService testService;
	
	@Test
	public void test(){
		List<Map> list = testMapper.test();
		System.out.println(list.size());
	}
	
	@Test
	public void test2(){
		testService.list();
	}
}

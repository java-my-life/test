package test.dubbo;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.dubbo.config.annotation.Reference;
import com.springboot.service.TestService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:dubbo-provider.xml"}) //用于指定配置文件所在的位置
public class TestDubbo {
	@Reference
	TestService testService;
	
	@Test
	public void test(){
		List<Map> list = testService.list();
		System.out.println(list.size());
	}
}

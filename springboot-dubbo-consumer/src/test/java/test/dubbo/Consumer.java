package test.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springboot.service.TestService;
 
public class Consumer {
 
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:dubbo-provider.xml"});
        context.start();
 
        TestService demoService = (TestService)context.getBean("testService"); // 获取远程服务代理
        System.out.println("======================"+ demoService.list()	 ); // 显示调用结果
    }
 
}
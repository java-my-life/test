package com.springboot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springboot.dubbo.AnnotationBean;

/**
 * @author "Ren PengFei (ROC)"
 * @date 2016年4月7日 下午4:36:19
 * @description
 */
@Configuration
public class DubboConfiguration {
    @Bean
    // @DependsOn("dubboConfiguration")
    public AnnotationBean dubboAnnotationBean() {
        AnnotationBean annotationBean = new AnnotationBean();
        // annotationBean.setApplicationContext(applicationContext);
        // annotationBean.setPackage(dubboProperties.getAnnotationPackage());
         annotationBean.setPackage("com.springboot");
        return annotationBean;
    }

}
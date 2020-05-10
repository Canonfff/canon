package com.canon.base.conf;


import com.canon.base.interceptor.StopWatchHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: canon-common
 * @Auther: canon
 * @Date: 2019/12/5 11:46
 * @Description:
 */
@Configuration
public class interceptorConf implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addWebRequestInterceptor(new StopWatchHandlerInterceptor());
    }
}

package com.canon.base.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.NamedThreadLocal;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

/**
 * @program: canon-common
 * @Auther: canon
 * @Date: 2019/12/5 11:30
 * @Description:性能监控拦截器
 */
public class StopWatchHandlerInterceptor implements WebRequestInterceptor {
    private static Logger log = LoggerFactory.getLogger(StopWatchHandlerInterceptor.class);

    private NamedThreadLocal<Long> startTimeThreadLocal = new NamedThreadLocal<Long>("StopWatch-StartTime");


    @Override
    public void preHandle(WebRequest webRequest) throws Exception {
        long startTime = System.currentTimeMillis();
        startTimeThreadLocal.set(startTime);
    }

    @Override
    public void postHandle(WebRequest webRequest, ModelMap modelMap) throws Exception {

    }

    @Override
    public void afterCompletion(WebRequest webRequest, Exception e) throws Exception {
        Long startTime = startTimeThreadLocal.get();
        long endTime = System.currentTimeMillis();
        long useTime = endTime - startTime;// 消耗的时间
        if (webRequest instanceof ServletWebRequest) {
            ServletWebRequest request = (ServletWebRequest) webRequest;
            String requestURI = request.getRequest().getRequestURI();
            log.info(String.format("url %s is use time : %d ms", requestURI, useTime));
        }

    }
}

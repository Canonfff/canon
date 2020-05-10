package com.canon.base.conf;

import com.canon.base.common.BaseHttpMessageConverters;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;

/**
 * @program: canon-common
 * @Auther: canon
 * @Date: 2019/12/4 16:03
 * @Description:基准包配置文件读取
 */
@Configuration
public class CommonConfig {

    /**
     * JSON
     * @return
     */
    @Bean
    public HttpMessageConverters httpMessageConverter() {
        BaseHttpMessageConverters baseHttpMessageConverters = new BaseHttpMessageConverters();
        HttpMessageConverter<?> converter = baseHttpMessageConverters;
        return new HttpMessageConverters(converter);
    }

    


}

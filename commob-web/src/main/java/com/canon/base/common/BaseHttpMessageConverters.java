package com.canon.base.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.canon.base.model.RestObject;
import com.google.common.collect.Lists;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/**
 * @program: canon-common
 * @Auther: canon
 * @Date: 2019/12/5 09:12
 * @Description:响应客户端json数据
 */
public class BaseHttpMessageConverters extends FastJsonHttpMessageConverter {

    public BaseHttpMessageConverters() {
        super.setSupportedMediaTypes(Lists.newArrayList(
                new MediaType("application", "json", StandardCharsets.UTF_8),
                new MediaType("application", "*+json", StandardCharsets.UTF_8)
        ));
    }

    /**
     * 写到客户端(统一格式返回)
     * @param object
     * @param outputMessage
     * @throws IOException
     * @throws HttpMessageNotWritableException
     */
    @Override
    protected void writeInternal(Object object, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        RestObject restObject = RestObject.getOk(object);
        OutputStream body = outputMessage.getBody();
        String text = JSON.toJSONString(restObject, SerializerFeature.WriteNullListAsEmpty, SerializerFeature.DisableCircularReferenceDetect);
        byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
        body.write(bytes);
    }
}

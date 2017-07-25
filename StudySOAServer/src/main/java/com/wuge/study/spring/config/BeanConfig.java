package com.wuge.study.spring.config;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.wuge.study.spring.mvc.JsonRequestParamArgumentResolver;
import com.wuge.study.utils.ConfigResource;
import com.manyi.utils.SimpleSequenceGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by sky91 on 2015-03-31.
 *
 * @author sky91 - feitiandaxia1991@163.com
 * @since 0.0.1
 */
@Configuration
public class BeanConfig {
    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        return objectMapper;
    }

    @Bean
    public JsonRequestParamArgumentResolver jsonRequestParamArgumentResolver() {
        JsonRequestParamArgumentResolver argumentResolver = new JsonRequestParamArgumentResolver();
        argumentResolver.setObjectMapper(objectMapper());
        return argumentResolver;
    }

    @Bean
    public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
        MappingJackson2HttpMessageConverter messageConverter = new MappingJackson2HttpMessageConverter();
        messageConverter.setObjectMapper(objectMapper());
        return messageConverter;
    }
    @Bean
    public ThreadPoolExecutor auxThreadPool() {
        return new ThreadPoolExecutor(16, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
    }

    @Bean
    public SimpleSequenceGenerator simpleSequenceGenerator() {
        return new SimpleSequenceGenerator(ConfigResource.getMachineId());
    }

}

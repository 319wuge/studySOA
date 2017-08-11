package com.wuge.study.client.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by sky91 on 2015-03-30.
 *
 * @author sky91 - feitiandaxia1991@163.com
 * @since 0.0.1
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface SOAServerRequest {
    String url() default "";
}

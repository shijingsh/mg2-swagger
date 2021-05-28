/*
 * Copyright (C) 2018 Zhejiang xiaominfo Technology CO.,LTD.
 * All rights reserved.
 * Official Web Site: http://www.xiaominfo.com.
 * Developer Web Site: http://open.xiaominfo.com.
 */

package com.mg.swagger.core.util;


import com.mg.swagger.core.model.AnnotationCacheKey;

import java.lang.annotation.Annotation;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/***
 *
 * @since:knife4j 2.0.4
 * @author <a href="mailto:liukefu2050@sina.com">liukefu2050@sina.com</a>
 * 2020/06/12 22:17
 */
public class AnnotationUtils {

    private static final Map<AnnotationCacheKey, Annotation> findAnnotationCache =
            new ConcurrentHashMap<>(256);
    /**
     * 查找注解
     * @param clazz
     * @param annotationType
     * @return 查找指定注解
     */
    public static <A extends Annotation> Optional<A> findAnnotation(Class<?> clazz,Class<A> annotationType){
        return findAnnotation(clazz,annotationType,true);
    }

    public static <A extends Annotation> Optional<A> findAnnotation(Class<?> clazz,Class<A> annotationType,boolean cache){
        if (annotationType == null) {
            return Optional.empty();
        }
        AnnotationCacheKey cacheKey = new AnnotationCacheKey(clazz, annotationType);
        A result=null;
        if (cache){
            result = (A) findAnnotationCache.get(cacheKey);
            if (result==null){
                result=(A) findOneAnnotation(clazz,annotationType);
                if (result!=null){
                    findAnnotationCache.put(cacheKey,result);
                }
            }
        }else{
            result=(A) findOneAnnotation(clazz,annotationType);
        }
        return result==null?Optional.empty():Optional.ofNullable(result);
    }

    private static <A extends Annotation> Annotation findOneAnnotation(Class<?> clazz,Class<A> annotationType){
        Annotation[] annotations=clazz.getAnnotations();
        for (Annotation annotation:annotations){
            if (annotation.annotationType()==annotationType){
                return annotation;
            }
        }
        return null;
    }
}

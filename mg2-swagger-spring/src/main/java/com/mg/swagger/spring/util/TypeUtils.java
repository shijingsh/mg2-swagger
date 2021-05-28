/*
 * Copyright (C) 2018 Zhejiang xiaominfo Technology CO.,LTD.
 * All rights reserved.
 * Official Web Site: http://www.xiaominfo.com.
 * Developer Web Site: http://open.xiaominfo.com.
 */

package com.mg.swagger.spring.util;

import com.fasterxml.classmate.ResolvedType;

/**
 * @author <a href="mailto:liukefu2050@sina.com">liukefu2050@sina.com</a>
 * 2020/09/19 11:10
 * @since:knife4j 1.0
 */
public class TypeUtils {
    public static boolean isVoid(ResolvedType returnType) {
        return Void.class.equals(returnType.getErasedType()) || Void.TYPE.equals(returnType.getErasedType());
    }
}

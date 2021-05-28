/*
 * Copyright (C) 2018 Zhejiang xiaominfo Technology CO.,LTD.
 * All rights reserved.
 * Official Web Site: http://www.xiaominfo.com.
 * Developer Web Site: http://open.xiaominfo.com.
 */

package com.mg.swagger.core.model;

/***
 *
 * @since:swagger-bootstrap-ui 1.0
 * @author <a href="mailto:liukefu2050@sina.com">liukefu2050@sina.com</a>
 * 2019/07/31 15:00
 */
public class DynamicClass {


    private Class<?> targetClazz;

    private Class<?> fieldClazz;

    public Class<?> getTargetClazz() {
        return targetClazz;
    }

    public void setTargetClazz(Class<?> targetClazz) {
        this.targetClazz = targetClazz;
    }

    public Class<?> getFieldClazz() {
        return fieldClazz;
    }

    public void setFieldClazz(Class<?> fieldClazz) {
        this.fieldClazz = fieldClazz;
    }


}

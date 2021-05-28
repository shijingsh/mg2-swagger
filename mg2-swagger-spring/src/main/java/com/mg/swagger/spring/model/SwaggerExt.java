/*
 * Copyright (C) 2018 Zhejiang xiaominfo Technology CO.,LTD.
 * All rights reserved.
 * Official Web Site: http://www.xiaominfo.com.
 * Developer Web Site: http://open.xiaominfo.com.
 */

package com.mg.swagger.spring.model;

import io.swagger.models.Swagger;
import org.springframework.beans.BeanUtils;


/***
 *
 * @since:swagger-bootstrap-ui 1.8.5
 * @author <a href="mailto:liukefu2050@sina.com">liukefu2050@sina.com</a>
 * 2018/10/11 16:30
 */
public class SwaggerExt extends Swagger {

    protected SwaggerBootstrapUi swaggerBootstrapUi;

    public SwaggerBootstrapUi getSwaggerBootstrapUi() {
        return swaggerBootstrapUi;
    }

    public void setSwaggerBootstrapUi(SwaggerBootstrapUi swaggerBootstrapUi) {
        this.swaggerBootstrapUi = swaggerBootstrapUi;
    }

    public SwaggerExt(Swagger swagger){
        BeanUtils.copyProperties(swagger,this);
    }
}

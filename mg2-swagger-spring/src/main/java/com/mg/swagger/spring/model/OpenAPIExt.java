/*
 * Copyright (C) 2018 Zhejiang xiaominfo Technology CO.,LTD.
 * All rights reserved.
 * Official Web Site: http://www.xiaominfo.com.
 * Developer Web Site: http://open.xiaominfo.com.
 */

package com.mg.swagger.spring.model;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.beans.BeanUtils;

/**
 * @author <a href="mailto:liukefu2050@sina.com">liukefu2050@sina.com</a>
 * 2020/10/18 18:48
 * @since:knife4j 1.0
 */
public class OpenAPIExt extends OpenAPI {

    protected SwaggerBootstrapUi swaggerBootstrapUi;

    public SwaggerBootstrapUi getSwaggerBootstrapUi() {
        return swaggerBootstrapUi;
    }

    public void setSwaggerBootstrapUi(SwaggerBootstrapUi swaggerBootstrapUi) {
        this.swaggerBootstrapUi = swaggerBootstrapUi;
    }

    public OpenAPIExt(OpenAPI openAPI){
        BeanUtils.copyProperties(openAPI,this);
    }

}

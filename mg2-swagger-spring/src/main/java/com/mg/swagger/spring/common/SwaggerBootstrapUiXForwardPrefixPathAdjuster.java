/*
 * Copyright (C) 2018 Zhejiang xiaominfo Technology CO.,LTD.
 * All rights reserved.
 * Official Web Site: http://www.xiaominfo.com.
 * Developer Web Site: http://open.xiaominfo.com.
 */

package com.mg.swagger.spring.common;

import springfox.documentation.common.SpringVersionCapability;
import springfox.documentation.service.PathAdjuster;

import javax.servlet.http.HttpServletRequest;


/***
 *
 * @since:swagger-bootstrap-ui 1.9.0
 * @author <a href="mailto:liukefu2050@sina.com">liukefu2050@sina.com</a>
 * 2019/01/14 16:44
 */
public class SwaggerBootstrapUiXForwardPrefixPathAdjuster implements PathAdjuster {

    static final String X_FORWARDED_PREFIX = "X-Forwarded-Prefix";

    private final HttpServletRequest request;

    public SwaggerBootstrapUiXForwardPrefixPathAdjuster(HttpServletRequest request) {
        this.request = request;
    }

    @Override
    public String adjustedPath(String path) {
        String prefix = request.getHeader(X_FORWARDED_PREFIX);
        if (prefix != null) {
            if (!SpringVersionCapability.supportsXForwardPrefixHeader(new springfox.documentation.common.SpringVersion().getVersion())) {
                return prefix + path;
            } else {
                return prefix;
            }
        } else {
            return path;
        }
    }
}

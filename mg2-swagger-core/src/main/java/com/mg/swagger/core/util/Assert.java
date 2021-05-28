/*
 * Copyright (C) 2018 Zhejiang xiaominfo Technology CO.,LTD.
 * All rights reserved.
 * Official Web Site: http://www.xiaominfo.com.
 * Developer Web Site: http://open.xiaominfo.com.
 */

package com.mg.swagger.core.util;

/***
 *
 * @since:knife4j 2.0.4
 * @author <a href="mailto:liukefu2050@sina.com">liukefu2050@sina.com</a>
 * 2020/06/13 11:17
 */
public abstract class Assert {

    public static void isTrue(boolean flag,String message){
        if (flag){
            throw new IllegalArgumentException(message);
        }
    }

}

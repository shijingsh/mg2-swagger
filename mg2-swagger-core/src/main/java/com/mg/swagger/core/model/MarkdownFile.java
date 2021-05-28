/*
 * Copyright (C) 2018 Zhejiang xiaominfo Technology CO.,LTD.
 * All rights reserved.
 * Official Web Site: http://www.xiaominfo.com.
 * Developer Web Site: http://open.xiaominfo.com.
 */

package com.mg.swagger.core.model;

/***
 *
 * @since:swagger-bootstrap-ui 1.9.3
 * @author <a href="mailto:liukefu2050@sina.com">liukefu2050@sina.com</a>
 * 2019/04/17 19:34
 */
public class MarkdownFile {

    /***
     * 标题
     */
    private String title;

    /***
     * 内容
     */
    private String content;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

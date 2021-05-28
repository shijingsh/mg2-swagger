/*
 * Copyright (C) 2018 Zhejiang xiaominfo Technology CO.,LTD.
 * All rights reserved.
 * Official Web Site: http://www.xiaominfo.com.
 * Developer Web Site: http://open.xiaominfo.com.
 */

package com.mg.swagger.core.extend;

/**
 * @author <a href="mailto:liukefu2050@sina.com">liukefu2050@sina.com</a>
 * 2020/10/24 7:00
 * @since:knife4j 2.0.6
 */
public class OpenApiExtendMarkdownChildren {
    /**
     * 标题
     */
    private String title;
    /**
     * 文档内容
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

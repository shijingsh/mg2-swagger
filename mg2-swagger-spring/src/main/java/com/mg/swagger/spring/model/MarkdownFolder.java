/*
 * Copyright (C) 2018 Zhejiang xiaominfo Technology CO.,LTD.
 * All rights reserved.
 * Official Web Site: http://www.xiaominfo.com.
 * Developer Web Site: http://open.xiaominfo.com.
 */

package com.mg.swagger.spring.model;

import com.mg.swagger.core.model.MarkdownFile;

import java.util.List;

/**
 * @author <a href="mailto:liukefu2050@sina.com">liukefu2050@sina.com</a>
 * 2020/10/23 21:22
 * @since:knife4j 1.0
 */
public class MarkdownFolder {
    /**
     * 目录名称
     */
    private String directory;
    /**
     * 目录通配符,作用于去读该directory目录下的md文件
     */
    private String locations;

    /**
     * md文件
     */
    private List<MarkdownFile> markdownFiles;

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public String getLocations() {
        return locations;
    }

    public void setLocations(String locations) {
        this.locations = locations;
    }

    public List<MarkdownFile> getMarkdownFiles() {
        return markdownFiles;
    }

    public void setMarkdownFiles(List<MarkdownFile> markdownFiles) {
        this.markdownFiles = markdownFiles;
    }
}

package com.butu.ssm.entity;

public class File {
    /**
     * 上传的文件
     */
    private Integer id;

    /**
     * 文件名称
     */
    private String filename;

    /**
     * 文件地址
     */
    private String fileUrl;/**
     * 是否删除（0否 1是）
     */
    private Integer isDel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}


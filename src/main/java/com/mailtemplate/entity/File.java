package com.mailtemplate.entity;

import java.util.Date;

/**
 * @Auther: nemo
 * @Date: 19-8-30 20:46
 * @Description: 文件
 */
public class File {
    private int id;
    private int companyId;
    private String filename;
    private Date time;
    private String code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

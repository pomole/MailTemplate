package com.mailtemplate.entity;

/**
 * @Auther: nemo
 * @Date: 19-8-30 19:59
 * @Description:用户信息
 */
public class User {
    private int id;
    private int companyId;
    private String name;
    private String mail;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}

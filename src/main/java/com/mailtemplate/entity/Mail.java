package com.mailtemplate.entity;

/**
 * @Auther: nemo
 * @Date: 19-8-30 20:01
 * @Description: 邮件模板
 */
public class Mail {
    private int id;
    private int companyId;
    private String theme;
    private String template;

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

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }
}

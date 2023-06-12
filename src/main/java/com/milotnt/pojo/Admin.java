package com.milotnt.pojo;
/**
 * @author JinDunChao [2110925527@qq.com]
 * @date 2023.6.12
 */
public class Admin {

    private Integer adminAccount;
    private String adminPassword;

    public Integer getAdminAccount() {
        return adminAccount;
    }

    public void setAdminAccount(Integer adminAccount) {
        this.adminAccount = adminAccount;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminAccount=" + adminAccount +
                ", adminPassword='" + adminPassword + '\'' +
                '}';
    }
}

package org.fuxian.examyuan.model;

public class BackUser {
    private int backUserID;
    private String name;
    private String phone;
    private String pwd;

    public int getBackUserID() {
        return backUserID;
    }

    public void setBackUserID(int backUserID) {
        this.backUserID = backUserID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "BackUser{" +
                "backUserID=" + backUserID +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}

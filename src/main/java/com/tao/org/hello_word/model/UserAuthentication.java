package com.tao.org.hello_word.model;


public class UserAuthentication {

    public String username;
    public String msg;
    public UserAuthentication(){

    }
    public UserAuthentication(String username, String msg) {
        this.username = username;
        this.msg = msg;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

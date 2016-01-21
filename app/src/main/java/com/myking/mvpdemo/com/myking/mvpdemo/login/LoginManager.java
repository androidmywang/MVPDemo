package com.myking.mvpdemo.com.myking.mvpdemo.login;

/**
 * Created by myking on 2016/1/21.
 */
public interface LoginManager {

    public void login(String username, String password, OnLoginFinishedListener listener);
}

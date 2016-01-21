package com.myking.mvpdemo.com.myking.mvpdemo.login;

/**
 * Created by myking on 2016/1/21.
 */
public interface LoginView {

    public void showProgress();

    public void hideProgress();

    public void setUsernameError();

    public void setPasswordError();

    public void navigateToHome();
}


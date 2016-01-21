package com.myking.mvpdemo.com.myking.mvpdemo.login;

/**
 * Created by myking on 2016/1/21.
 */
public interface OnLoginFinishedListener {

    public void onUsernameError();

    public void onPasswordError();

    public void onSuccess();
}

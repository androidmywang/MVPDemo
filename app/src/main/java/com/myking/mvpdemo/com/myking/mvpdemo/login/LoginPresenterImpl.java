package com.myking.mvpdemo.com.myking.mvpdemo.login;

/**
 * Created by myking on 2016/1/21.
 */
public class LoginPresenterImpl implements LoginPresenter, OnLoginFinishedListener {

    private LoginView loginView;

    private LoginManager loginManager;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        this.loginManager = new LoginManagerImpl();
    }

    @Override
    public void validateCredentials(String username, String password) {
        loginView.showProgress();
        loginManager.login(username, password, this);
    }

    @Override
    public void onUsernameError() {
        loginView.setUsernameError();
        loginView.hideProgress();
    }

    @Override
    public void onPasswordError() {
        loginView.setPasswordError();
        loginView.hideProgress();
    }

    @Override
    public void onSuccess() {
        loginView.navigateToHome();
    }
}

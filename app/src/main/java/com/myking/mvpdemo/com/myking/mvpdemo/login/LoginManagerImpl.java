package com.myking.mvpdemo.com.myking.mvpdemo.login;

import android.os.Handler;
import android.text.TextUtils;

/**
 * Created by myking on 2016/1/21.
 */
public class LoginManagerImpl implements LoginManager {

    @Override
    public void login(final String username, final String password, final OnLoginFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean error = false;
                if (TextUtils.isEmpty(username)) {
                    listener.onUsernameError();
                    error = true;
                }
                if (TextUtils.isEmpty(password)) {
                    listener.onPasswordError();
                    error = true;
                }
                if (!error) {
                    listener.onSuccess();
                }
            }
        }, 2000);
    }
}

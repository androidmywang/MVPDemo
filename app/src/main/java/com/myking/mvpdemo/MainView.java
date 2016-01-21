package com.myking.mvpdemo;

import java.util.List;

/**
 * Created by myking on 2016/1/21.
 */
public interface MainView {

    public void showProgress();

    public void hideProgress();

    public void setItems(List<String> items);

    public void showMessage(String message);
}

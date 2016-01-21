package com.myking.mvpdemo;

import java.util.List;

/**
 * Created by myking on 2016/1/21.
 */
public class MainPresenterImpl implements MainPresenter, OnFinishedListener {

    private MainView mainView;
    private FindItemManager findItemManager;

    public MainPresenterImpl(MainView mainView) {
        this.mainView = mainView;
        findItemManager = new FindItemManagerImpl();
    }

    @Override
    public void onResume() {
        mainView.showProgress();
        findItemManager.findItems(this);
    }

    @Override
    public void onItemClicked(int position) {
        mainView.showMessage(String.format("Position %d clicked",position+1));


    }

    @Override
    public void onFinished(List<String> items) {
        mainView.setItems(items);
        mainView.hideProgress();
    }
}

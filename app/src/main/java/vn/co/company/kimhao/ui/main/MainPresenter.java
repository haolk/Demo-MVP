package vn.co.company.kimhao.ui.main;

import javax.inject.Inject;

import vn.co.company.kimhao.ui.base.BasePresenterImpl;

public class MainPresenter extends BasePresenterImpl<MainContract.View> implements MainContract.Presenter {

    @Inject
    public MainPresenter() {
        super();
    }

    @Override
    public void toast() {

    }

    @Override
    public void showMain1() {
        view.showMain1();
    }
}

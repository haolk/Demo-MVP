package vn.co.company.kimhao.ui.main.main1;

import javax.inject.Inject;

import vn.co.company.kimhao.ui.base.BasePresenterImpl;
import vn.co.company.kimhao.ui.main.MainPresenter;

public class Main1Presenter extends BasePresenterImpl<Main1Contract.View> implements Main1Contract.Presenter {

    private MainPresenter mainPresenter;

    @Inject
    public Main1Presenter(MainPresenter mainPresenter) {
        super();
        this.mainPresenter = mainPresenter;
    }

    @Override
    public void showMain1() {
        mainPresenter.showMain1();
    }
}

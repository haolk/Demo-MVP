package vn.co.company.kimhao.ui.main.main2;

import javax.inject.Inject;

import vn.co.company.kimhao.ui.base.BasePresenterImpl;
import vn.co.company.kimhao.ui.main.MainPresenter;

public class Main2Presenter extends BasePresenterImpl<Main2Contract.View> implements Main2Contract.Presenter {

    private MainPresenter mainPresenter;

    @Inject
    public Main2Presenter(MainPresenter mainPresenter) {
        super();

    }

}

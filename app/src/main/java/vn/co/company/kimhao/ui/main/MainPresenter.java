package vn.co.company.kimhao.ui.main;

import javax.inject.Inject;

import vn.co.company.kimhao.ui.base.BasePresenterImpl;

public class MainPresenter extends BasePresenterImpl<IMainView> implements IMainPresenter {

    @Inject
    public MainPresenter() {
        super();
    }

    @Override
    public void toast() {
        view.showToast("XIN CHAO");
    }
}

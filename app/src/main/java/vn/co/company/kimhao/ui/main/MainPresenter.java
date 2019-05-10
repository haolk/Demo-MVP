package vn.co.company.kimhao.ui.main;

import javax.inject.Inject;

import vn.co.company.kimhao.data.source.Repository;
import vn.co.company.kimhao.ui.base.BasePresenterImpl;

public class MainPresenter extends BasePresenterImpl<IMainView> implements IMainPresenter {

    private Repository repository;

    @Inject
    public MainPresenter(Repository repository) {
        super();
        this.repository = repository;
    }

    @Override
    public void toast() {
        view.showToast(repository.text());
    }
}

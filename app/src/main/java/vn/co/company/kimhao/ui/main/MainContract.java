package vn.co.company.kimhao.ui.main;

import vn.co.company.kimhao.ui.base.BasePresenter;
import vn.co.company.kimhao.ui.base.BaseView;

public interface MainContract {
    interface View extends BaseView {
        void showToast(String text);
        void showMain1();
    }

    interface Presenter extends BasePresenter<View> {
        void toast();

        void showMain1();
    }
}

package vn.co.company.kimhao.ui.main.main1;

import vn.co.company.kimhao.ui.base.BasePresenter;
import vn.co.company.kimhao.ui.base.BaseView;

public interface Main1Contract {
    interface View extends BaseView {

    }

    interface Presenter extends BasePresenter<View> {
        void showMain1();
    }
}

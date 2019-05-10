package vn.co.company.kimhao.ui.base;

import android.content.Context;

public interface BasePresenter<V extends BaseView> {

    void takeView(V view);

    void resume(Context context);

    void destroy();

}

package vn.co.company.kimhao.ui.base;

import android.content.Context;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import vn.co.company.kimhao.util.schedulers.BaseSchedulerProvider;

public abstract class BasePresenterImpl<V extends BaseView> implements BasePresenter<V> {

    public V view;
    public Context context;

    @Inject
    BaseSchedulerProvider schedulerProvider;

    private CompositeDisposable mCompositeDisposable = new CompositeDisposable();

    public BasePresenterImpl() {
        super();
    }

    @Override
    public void takeView(V view) {
        this.view = view;
    }

    @Override
    public void resume(Context context) {
        this.context = context;
    }

    @Override
    public void destroy() {
        mCompositeDisposable.clear();
        this.view = null;
    }

    public void addDisposable(Disposable disposable) {
        mCompositeDisposable.add(disposable);
    }
}

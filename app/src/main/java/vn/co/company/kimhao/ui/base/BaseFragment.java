package vn.co.company.kimhao.ui.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;

public abstract class BaseFragment<T extends BasePresenter> extends DaggerFragment implements BaseView {
    private static String TAG = "";

    @Inject
    public T presenter;

    BaseActivity activity;

    public BaseFragment() {
    }

    @LayoutRes
    public abstract int getResIdLayout();

    public abstract void newInstance(BaseActivity mActivity);

    public abstract void setView(View view);

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        TAG = ((Object) this).getClass().getSimpleName();
        if (context instanceof BaseActivity) {
            activity = (BaseActivity) context;
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getResIdLayout(), container, false);
        Log.d(TAG, "onCreateView");
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setView(view);
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
        presenter.takeView(this);
        presenter.resume(activity);
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy");
        presenter.destroy();
        activity = null;
        presenter = null;
        super.onDestroy();
    }

    @Override
    public void showLoading() {
        activity.showLoading();
    }

    @Override
    public void showLoadingError() {
        activity.showLoadingError();
    }

    @Override
    public void closeLoading() {
        activity.closeLoading();
    }
}

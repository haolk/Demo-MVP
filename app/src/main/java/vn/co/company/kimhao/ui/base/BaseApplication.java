package vn.co.company.kimhao.ui.base;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;
import vn.co.company.kimhao.di.DaggerAppComponent;

public class BaseApplication extends DaggerApplication {
//    @Override
//    public void onCreate() {
//        super.onCreate();
//        AppComponent appComponent = DaggerAppComponent.builder().application(this).build();
//        appComponent.inject(this);
//    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        AndroidInjector appComponent = DaggerAppComponent.builder().application(this).build();
        appComponent.inject(this);
        return appComponent;
    }
}

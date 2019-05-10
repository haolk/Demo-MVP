package vn.co.company.kimhao.ui.main;

import dagger.Binds;
import dagger.Module;
import vn.co.company.kimhao.util.schedulers.anotation.ActivityScoped;

@Module
public abstract class MainModule {
    @ActivityScoped
    @Binds
    abstract IMainPresenter mainPresenter(MainPresenter mainPresenter);
}

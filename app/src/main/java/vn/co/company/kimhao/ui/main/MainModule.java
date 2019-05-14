package vn.co.company.kimhao.ui.main;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import vn.co.company.kimhao.util.schedulers.anotation.ActivityScoped;
import vn.co.company.kimhao.util.schedulers.anotation.FragmentScoped;

@Module
public abstract class MainModule {
    @ActivityScoped
    @Binds
    abstract IMainPresenter mainPresenter(MainPresenter mainPresenter);

    @FragmentScoped
    @ContributesAndroidInjector
    abstract MainFragment mainFragment();
}

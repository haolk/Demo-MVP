package vn.co.company.kimhao.ui.main;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import vn.co.company.kimhao.ui.main.main1.Main1Contract;
import vn.co.company.kimhao.ui.main.main1.Main1Fragment;
import vn.co.company.kimhao.ui.main.main1.Main1Presenter;
import vn.co.company.kimhao.util.schedulers.anotation.ActivityScoped;
import vn.co.company.kimhao.util.schedulers.anotation.FragmentScoped;

@Module
public abstract class MainModule {
    @ActivityScoped
    @Binds
    abstract MainContract.Presenter mainPresenter(MainPresenter mainPresenter);

    @ActivityScoped
    @Binds
    abstract Main1Contract.Presenter main1Presenter(Main1Presenter main1Presenter);

    @FragmentScoped
    @ContributesAndroidInjector
    abstract Main1Fragment main1Fragment();
}

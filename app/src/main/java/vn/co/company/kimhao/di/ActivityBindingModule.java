package vn.co.company.kimhao.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import vn.co.company.kimhao.ui.main.MainActivity;
import vn.co.company.kimhao.ui.main.MainModule;
import vn.co.company.kimhao.util.schedulers.anotation.ActivityScoped;

@Module
public abstract class ActivityBindingModule {
    @ActivityScoped
    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity mainActivity();

}

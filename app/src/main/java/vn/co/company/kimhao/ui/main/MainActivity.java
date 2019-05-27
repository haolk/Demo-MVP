package vn.co.company.kimhao.ui.main;

import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

import dagger.Lazy;
import vn.co.company.kimhao.R;
import vn.co.company.kimhao.ui.base.BaseActivity;
import vn.co.company.kimhao.ui.main.main1.Main1Fragment;
import vn.co.company.kimhao.util.ActivityUtils;

public class MainActivity extends BaseActivity<MainContract.Presenter> implements MainContract.View {


    @Override
    public int getResIdLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: Demo
        presenter.toast();
        showMain1();
    }

    @Override
    public void showToast(String text) {
        Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showMain1() {
        Main1Fragment main1Fragment = new Main1Fragment();
        MainActivity.this.supportFragmentInjector().inject(main1Fragment);
        ActivityUtils.replaceFragmentToActivity(getSupportFragmentManager(), main1Fragment, R.id.flContainer);
    }
}

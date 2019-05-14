package vn.co.company.kimhao.ui.main;

import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

import dagger.Lazy;
import vn.co.company.kimhao.R;
import vn.co.company.kimhao.ui.base.BaseActivity;
import vn.co.company.kimhao.util.ActivityUtils;

public class MainActivity extends BaseActivity<IMainPresenter> implements IMainView {

    @Inject
    Lazy<MainFragment> mainFragmentLazyProvider;

    @Override
    public int getResIdLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: Demo
        presenter.toast();

        MainFragment mainFragment =
                (MainFragment) getSupportFragmentManager().findFragmentById(R.id.flContainer);
        if (mainFragment == null) {
            // Get the fragment from dagger
            mainFragment = mainFragmentLazyProvider.get();
            ActivityUtils.addFragmentToActivity(
                    getSupportFragmentManager(), mainFragment, R.id.flContainer);
        }

    }

    @Override
    public void showToast(String text) {
        Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
    }
}

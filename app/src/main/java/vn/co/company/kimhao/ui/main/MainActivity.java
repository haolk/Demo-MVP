package vn.co.company.kimhao.ui.main;

import android.os.Bundle;
import android.widget.Toast;

import vn.co.company.kimhao.R;
import vn.co.company.kimhao.ui.base.BaseActivity;

public class MainActivity extends BaseActivity<IMainPresenter> implements IMainView {
    @Override
    public int getResIdLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: Demo
        presenter.toast();
    }

    @Override
    public void showToast(String text) {
        Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
    }
}

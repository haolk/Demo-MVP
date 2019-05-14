package vn.co.company.kimhao.ui.main;

import android.view.View;

import javax.inject.Inject;

import vn.co.company.kimhao.R;
import vn.co.company.kimhao.ui.base.BaseActivity;
import vn.co.company.kimhao.ui.base.BaseFragment;
import vn.co.company.kimhao.util.schedulers.anotation.ActivityScoped;

@ActivityScoped
public class MainFragment extends BaseFragment<IMainPresenter> {
    @Inject
    public MainFragment() {
    }

    @Override
    public int getResIdLayout() {
        return R.layout.main_frag;
    }

    @Override
    public void newInstance(BaseActivity mActivity) {

    }

    @Override
    public void setView(View view) {

    }
}

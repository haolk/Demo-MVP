package vn.co.company.kimhao.ui.main.main2;

import android.view.View;

import javax.inject.Inject;

import vn.co.company.kimhao.R;
import vn.co.company.kimhao.ui.base.BaseActivity;
import vn.co.company.kimhao.ui.base.BaseFragment;
import vn.co.company.kimhao.util.schedulers.anotation.FragmentScoped;

@FragmentScoped
public class Main2Fragment extends BaseFragment<Main2Contract.Presenter> implements Main2Contract.View {
    @Inject
    public Main2Fragment() {
    }

    @Override
    public int getResIdLayout() {
        return R.layout.main1_frag;
    }

    @Override
    public void newInstance(BaseActivity mActivity) {

    }

    @Override
    public void setView(View view) {
    }
}

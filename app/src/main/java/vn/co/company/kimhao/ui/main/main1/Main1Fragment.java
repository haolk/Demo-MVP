package vn.co.company.kimhao.ui.main.main1;

import android.view.View;

import javax.inject.Inject;

import vn.co.company.kimhao.R;
import vn.co.company.kimhao.ui.base.BaseActivity;
import vn.co.company.kimhao.ui.base.BaseFragment;
import vn.co.company.kimhao.util.schedulers.anotation.FragmentScoped;

@FragmentScoped
public class Main1Fragment extends BaseFragment<Main1Contract.Presenter> implements Main1Contract.View {
    @Inject
    public Main1Fragment() {
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
        presenter.showMain1();
    }
}

package vn.co.company.kimhao.ui.base;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;
import vn.co.company.kimhao.R;

public abstract class BaseActivity<T extends BasePresenter> extends DaggerAppCompatActivity implements BaseView {
    private static String TAG = "";
    protected TextView tvHeader;
    public ProgressDialog waitDialog;
    public AlertDialog userDialog;

    @Inject
    public T presenter;

    @LayoutRes
    public abstract int getResIdLayout();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getResIdLayout());
        presenter.takeView(this);
        TAG = ((Object) this).getClass().getSimpleName();
        Log.d(TAG, "onCreate");

    }

    @Override
    protected void onDestroy() {
        presenter.destroy();
        presenter = null;
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    public void changeHeaderName(String name) {
        tvHeader = findViewById(R.id.tvHeaderName);
        tvHeader.setText(name);
    }

    public void hideKeyboard() {
        View view = getCurrentFocus();
        // hide keyboard
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void closeWaitDialog() {
        try {
            waitDialog.dismiss();
        } catch (Exception e) {
            //
        }
    }

    public void showDialogMessage(String title, String body, final boolean exit) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title).setMessage(body).setNeutralButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                try {
                    userDialog.dismiss();
                    if (exit) {
                        exit("");
                    }
                } catch (Exception e) {
                    if (exit) {
                        exit("");
                    }
                }
            }
        });
        userDialog = builder.create();
        userDialog.show();
    }

    public void exit(String uname) {
        exit(uname, null);
    }

    public void exit(String uname, String password) {
        Intent intent = new Intent();
        if (uname == null) {
            uname = "";
        }
        if (password == null) {
            password = "";
        }
        intent.putExtra("name", uname);
        intent.putExtra("password", password);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void showWaitDialog(String message) {
        closeWaitDialog();
        waitDialog = new ProgressDialog(this);
        waitDialog.setTitle(message);
        waitDialog.show();
    }

    @Override
    public void showLoading() {
        // TODO
    }

    @Override
    public void showLoadingError() {
        // TODO
    }

    @Override
    public void closeLoading() {
        // TODO
    }
}

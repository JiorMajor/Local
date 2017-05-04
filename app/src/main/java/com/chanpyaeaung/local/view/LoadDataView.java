package com.chanpyaeaung.local.view;

import android.content.Context;

/**
 * Created by Chan Pyae Aung on 20/4/17.
 */

public interface LoadDataView {


    void showLoading();

    void hideLoading();

    void showError(String error);

    void showRetry();

    void hideRetry();

    Context context();

}

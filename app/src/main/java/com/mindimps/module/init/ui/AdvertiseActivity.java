package com.mindimps.module.init.ui;

import com.mindimps.R;
import com.mindimps.databinding.ActivityAdvertiseBinding;
import com.mindimps.module.init.presenter.ADPresenter;

import framework.base.BaseActivity;

/**
 * 广告页
 *
 */
public class AdvertiseActivity extends BaseActivity<ADPresenter,ActivityAdvertiseBinding> {

    @Override
    public int getLayoutId() {
        return R.layout.activity_advertise;
    }

    @Override
    public void initView() {

    }
}

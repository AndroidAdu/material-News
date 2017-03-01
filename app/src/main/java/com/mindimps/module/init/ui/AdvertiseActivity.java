package com.mindimps.module.init.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.mindimps.R;
import com.mindimps.databinding.ActivityAdvertiseBinding;
import com.mindimps.module.init.model.ADEntity;
import com.mindimps.module.init.presenter.ADContract;
import com.mindimps.module.init.presenter.ADPresenter;

import framework.base.BaseActivity;
import framework.constant.HttpContants;

/**
 * 广告页
 *
 */

public class AdvertiseActivity extends BaseActivity<ADPresenter,ActivityAdvertiseBinding> implements ADContract.View {

    private ImageView ad_image;


    @Override
    public int getLayoutId() {
        return R.layout.activity_advertise;
    }

    @Override
    public void initView() {
        ad_image=(ImageView)findViewById(R.id.advertise_Image);
    }

    @Override
    public void showADImage(ADEntity adEntity) {
        //加载本地图片内容
        Glide.with(mContext)
                .load(HttpContants.IMAGE_URL+adEntity.getImageUrl())
                .into(ad_image);


    }
}

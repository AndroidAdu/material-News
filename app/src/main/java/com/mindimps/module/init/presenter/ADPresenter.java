package com.mindimps.module.init.presenter;

import android.util.Log;

import com.mindimps.base.model.BaseModel;
import com.mindimps.module.init.model.ADEntity;

import framework.network.Api;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by duxueyang on 2017/3/1.
 */

public class ADPresenter  extends  ADContract.Presenter {
    @Override
    public void getADEntity() {
        //Rxjava 发起请求数据

        Observable<BaseModel<ADEntity>> observable= Api.getInstance().service.getADImageUrl();

                observable.subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<BaseModel<ADEntity>>() {
                    @Override
                    public void onCompleted() {
                        //数据请求成功
                        Log.i("RetrofitLog","onCompleted");

                    }

                    @Override
                    public void onError(Throwable e) {
                        //请求失败
                        int a=1;
                        Log.i("RetrofitLog","onError");

                    }

                    @Override
                    public void onNext(BaseModel<ADEntity> adEntityBaseModel) {
                        //
                        int a=1;
                        Log.i("RetrofitLog","onNext"+adEntityBaseModel.getCode());
                        if(adEntityBaseModel!=null){
                            mView.showADImage(adEntityBaseModel.getData());
                        }

                    }

                });

    }

    @Override
    public void onAttached() {
        getADEntity();
    }
}

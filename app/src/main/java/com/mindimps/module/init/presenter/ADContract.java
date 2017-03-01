package com.mindimps.module.init.presenter;


import com.mindimps.module.init.model.ADEntity;

import framework.base.BasePresenter;
import framework.base.BaseView;

/**
 * Created by duxueyang on 17/2/28.
 */

public interface ADContract {

    /**
     * Activity 需要实现的接口
     */
    interface View extends BaseView {

        /**
         * 显示广告
         * @param adEntity
         */
        void showADImage(ADEntity adEntity);
    }


    /**
     * presenter 需要实现的接口
     */
    abstract class Presenter extends BasePresenter<View> {

        /**
         * 获取广告数据
         */
        public abstract void getADEntity();

    }
}

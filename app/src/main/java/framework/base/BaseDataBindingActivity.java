package framework.base;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.apt.TRouter;


/**
 * Created by duxueyang on 17/2/27.
 * 所有的Activity 添加Databinding 功能
 *
 */

public abstract  class BaseDataBindingActivity<B extends ViewDataBinding> extends AppCompatActivity {


    /**
     * 本类知识点
     * ViewDataBinding 属于com.android.databinding
     * DataBindingUtil 属于com.android.databinding
     *  B 代表ViewDataBing 的泛型
     *
     */


    public Context mContext;


    protected Toolbar toolbar;
    public B mViewBinding;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mContext = this;

        View rootView = getLayoutInflater().inflate(this.getLayoutId(), null, false);
        //databinding 绑定当前view
        mViewBinding = DataBindingUtil.bind(rootView);
        //设置布局文件
        setContentView(getLayoutId());


        //初始化
        initTransitionView();
        initPresenter();
        initToolBar();
        initView();

        //路由
        TRouter.bind(this);
    }


    /**
     * 初始化Toorbar
     */
    private void initToolBar() {
//        toolbar = (Toolbar) findViewById(R.id.toolbar);
//        if (toolbar != null) {
//            setSupportActionBar(toolbar);
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        }
    }


    /**
     * 获取布局ID
     * @return
     */
    public abstract int getLayoutId();

    /**
     * 初始化view
     */
    public abstract void initView();

    /**
     * 在这里给转场view副值
     */
    protected void initTransitionView() {
    }

    /**
     * 初始化presenter
     */
    protected void initPresenter() {
    }

}



/**
 * 自己设置的contentView
 * 设置可用SwipeBackLayout的算法
 */
//    public void setContentView(int layoutResID, View rootView) {
//        boolean isNotSwipeBack = layoutResID == R.layout.activity_main || layoutResID == R.layout.activity_flash;
//        super.setContentView(isNotSwipeBack ? rootView : getContainer(rootView));
//    }

//    private View getContainer(View rootView) {
//        rootView.setBackgroundColor(getResources().getColor(R.color.alpha_white));
//        View container = getLayoutInflater().inflate(R.layout.activity_base, null, false);
//        SwipeBackLayout swipeBackLayout = (SwipeBackLayout) container.findViewById(R.id.swipeBackLayout);
//        swipeBackLayout.setDragEdge(SwipeBackLayout.DragEdge.LEFT);
//        View ivShadow = container.findViewById(R.id.iv_shadow);
//        swipeBackLayout.addView(rootView);
//        swipeBackLayout.setOnSwipeBackListener((fa, fs) -> ivShadow.setAlpha(1 - fs));
//        return container;
//    }

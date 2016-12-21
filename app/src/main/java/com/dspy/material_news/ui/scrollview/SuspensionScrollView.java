package com.dspy.material_news.ui.scrollview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;

/**
 * Created by Administrator on 2016/2/17.
 * 悬浮导航栏的实现
 * 同时集成toorbar的实现方式
 *
 * 自定义Scrollview 设置
 *
 *
 */
public class SuspensionScrollView extends ScrollView {

    private OnScrollListener listener;
    private int mSlop;    //缓冲数据
    private View toorBar;
    private View headView;

    /**
     * 更新数据的目标格式
     */
    public void updateToorBarAlphaWithHeadView(View toorBar,View headView){
        this.toorBar=toorBar;
        this.headView=headView;
    }


    public void setOnScrollListener(OnScrollListener listener) {
        this.listener = listener;
    }

    public SuspensionScrollView(Context context) {
        this(context, null);

    }

    public SuspensionScrollView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);

    }

    public SuspensionScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }


    private void init(Context context) {
        mSlop = 10;
    }

    public interface OnScrollListener{
        void onScroll(int scrollY);
    }

    @Override
    public void computeScroll() {
        super.computeScroll();
        if(listener!=null){
            listener.onScroll(getScrollY());
        }
    }


    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        if(headView!=null&&toorBar!=null){
            float headHeight = headView.getMeasuredHeight()
                    - toorBar.getMeasuredHeight();
            int alpha = (int) (((float) t / headHeight) * 255);
            if (alpha >= 255)
                alpha = 255;
            if (alpha <= mSlop)
                alpha = 0;
            toorBar.getBackground().setAlpha(alpha);
        }
        super.onScrollChanged(l, t, oldl, oldt);
    }
}

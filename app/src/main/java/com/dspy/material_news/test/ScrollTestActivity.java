package com.dspy.material_news.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

import com.dspy.material_news.R;
import com.dspy.material_news.ui.scrollview.SuspensionScrollView;

public class ScrollTestActivity extends AppCompatActivity{

    private LinearLayout toorbar;
    private LinearLayout headview;
    private LinearLayout indicator;
    private SuspensionScrollView scrollview;

    private int picBottom;

    private FrameLayout partentLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_test);
        partentLayout=(FrameLayout)findViewById(R.id.activity_scroll_test);
        toorbar=(LinearLayout)findViewById(R.id.toorbar);
        headview=(LinearLayout)findViewById(R.id.headview);
        indicator=(LinearLayout)findViewById(R.id.indicator);
        scrollview=(SuspensionScrollView)findViewById(R.id.scrollview);

        //设置透明度

        toorbar.getBackground().setAlpha(0);

        scrollview.updateToorBarAlphaWithHeadView(toorbar,headview);
        scrollview.setOnScrollListener(new SuspensionScrollView.OnScrollListener() {
            @Override
            public void onScroll(int scrollY) {
                int scroll2=scrollY+toorbar.getBottom();
                int top = Math.max(scroll2, picBottom);
                //layout 的方法参数 左上右下  这个是距离
                indicator.layout(0, top, indicator.getWidth(), top + indicator.getHeight());
            }
        });
    }


    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            picBottom = headview.getBottom();
        }
    }

}

package com.mindimps.control.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dspy.material_news.R;

/**
 * Created by duxueyang on 16/12/22.
 */

public class TestFragment extends Fragment {

    private Toolbar toolbar;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_test,container, false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        View view=getView();
        toolbar=(Toolbar)view.findViewById(R.id.toolbar);
        initFitSystem();

    }


    private void initFitSystem() {
        int resourceId = getActivity().getResources().getIdentifier("status_bar_height", "dimen", "android");
        int statusBarHeight = getActivity().getResources().getDimensionPixelSize(resourceId);
        // 绘制一个和状态栏一样高的矩形，并添加到视图中
        toolbar.setPadding(0,statusBarHeight,0,0);
//		View rectView = new View(getActivity());
//		LinearLayout.LayoutParams params
//				= new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, statusBarHeight);
//		rectView.setLayoutParams(params);
//		rectView.setBackgroundColor(Color.parseColor("#FFFFFF"));
//		viewGroup.addView(rectView,0);
    }

    @Override
    public void onResume() {
        super.onResume();
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }



}

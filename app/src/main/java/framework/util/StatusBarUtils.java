package framework.util;


import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StatusBarUtils {

	public static void translucentBar(int color,Activity activity) {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
			activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			// 获取状态栏高度
			int resourceId = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
			int statusBarHeight = activity.getResources().getDimensionPixelSize(resourceId);
			// 绘制一个和状态栏一样高的矩形，并添加到视图中
			View rectView = new View(activity);
			LinearLayout.LayoutParams params
					= new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, statusBarHeight);
			rectView.setLayoutParams(params);
			rectView.setBackgroundColor(activity.getResources().getColor(color));
			// 添加矩形View到布局中
			ViewGroup decorView = (ViewGroup) activity.getWindow().getDecorView();
			decorView.addView(rectView);
			// 设置根布局的参数
			ViewGroup rootView = (ViewGroup) ((ViewGroup) activity.findViewById(android.R.id.content)).getChildAt(0);
			rootView.setFitsSystemWindows(true);
			rootView.setClipToPadding(true);
		}
	}


	public static void smoothSwitchScreen(Activity activity) {
		if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
			ViewGroup rootView = ((ViewGroup) activity.findViewById(android.R.id.content));
			int resourceId = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
			int statusBarHeight =activity. getResources().getDimensionPixelSize(resourceId);
			rootView.setPadding(0, statusBarHeight, 0, 0);
			activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN);
			activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
		}
	}
	
	
	
	
	/**
	 * 设置状态栏图标为深色和魅族特定的文字风格，Flyme4.0以上
	 * 可以用来判断是否为Flyme用户
	 * @param window 需要设置的窗口
	 * @param dark 是否把状态栏字体及图标颜色设置为深色
	 * @return  boolean 成功执行返回true
	 *
	 *
	 *
	 */
	public static boolean FlymeSetStatusBarLightMode(Window window, boolean dark) {
	    boolean result = false;
	    if (window != null) {
	        try {
	            WindowManager.LayoutParams lp = window.getAttributes();
	            Field darkFlag = WindowManager.LayoutParams.class
	                    .getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
	            Field meizuFlags = WindowManager.LayoutParams.class
	                    .getDeclaredField("meizuFlags");
	            darkFlag.setAccessible(true);
	            meizuFlags.setAccessible(true);
	            int bit = darkFlag.getInt(null);
	            int value = meizuFlags.getInt(lp);
	            if (dark) {
	                value |= bit;
	            } else {
	                value &= ~bit;
	            }
	            meizuFlags.setInt(lp, value);
	            window.setAttributes(lp);
	            result = true;
	        } catch (Exception e) {

	        }
	    }
	    return result;
	}

	/**
	 * 设置状态栏字体图标为深色，需要MIUIV6以上
	 * @param window 需要设置的窗口
	 * @param dark 是否把状态栏字体及图标颜色设置为深色
	 * @return  boolean 成功执行返回true
	 *
	 */
	public static boolean MIUISetStatusBarLightMode(Window window, boolean dark) {
	    boolean result = false;
	    if (window != null) {
	        Class clazz = window.getClass();
	        try {
	            int darkModeFlag = 0;
	            Class layoutParams = Class.forName("android.view.MiuiWindowManager$LayoutParams");
	            Field field = layoutParams.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE");
	            darkModeFlag = field.getInt(layoutParams);
	            Method extraFlagField = clazz.getMethod("setExtraFlags", int.class, int.class);
	            if(dark){
	                extraFlagField.invoke(window,darkModeFlag,darkModeFlag);//状态栏透明且黑色字体
	            }else{
	                extraFlagField.invoke(window, 0, darkModeFlag);//清除黑色字体
	            }
	            result=true;
	        }catch (Exception e){

	        }
	    }
	    return result;
	}


	/**
	 * 黑化状态栏
	 */
	public static void darkStatusBar(Window window){
		//设置魅族手机状态栏为dark 模式
		FlymeSetStatusBarLightMode(window,true);
		//设置小米手机状态栏为dark 模式
		MIUISetStatusBarLightMode(window,true);
	}



	/**
	 * 黑化状态栏
	 */
	public static void darkStatusBar(Window window, boolean isdark){
		//设置魅族手机状态栏为dark 模式
		FlymeSetStatusBarLightMode(window,isdark);
		//设置小米手机状态栏为dark 模式
		MIUISetStatusBarLightMode(window,isdark);
	}

	
	
}

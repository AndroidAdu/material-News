package framework.util;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/**
 * 软键盘工具类
 * 
 * @author zhy
 * 
 */
public class KeyBoardUtils
{
	/**
	 * 打卡软键盘
	 * 
	 * @param mEditText
	 *            输入框
	 * @param mContext
	 *            上下文
	 */
	public static void openKeybord(EditText mEditText, Context mContext)
	{
		InputMethodManager imm = (InputMethodManager) mContext
				.getSystemService(Context.INPUT_METHOD_SERVICE);
		imm.showSoftInput(mEditText, InputMethodManager.RESULT_SHOWN);
		imm.toggleSoftInput(InputMethodManager.SHOW_FORCED,
				InputMethodManager.HIDE_IMPLICIT_ONLY);
	}

	/**
	 * 关闭软键盘
	 * 
	 * @param mEditText
	 *            输入框
	 * @param mContext
	 *            上下文
	 */
	public static void closeKeybord(EditText mEditText, Context mContext)
	{
		InputMethodManager imm = (InputMethodManager) mContext
				.getSystemService(Context.INPUT_METHOD_SERVICE);

		imm.hideSoftInputFromWindow(mEditText.getWindowToken(), 0);
	}
	
	
	
	
	
	/**
	 * Purpose:if(isFlag)打开输入法 else 关闭输入法
	 * @author SiLiPing
	 * @param isFlag
	 */
	public void onInputMethod(boolean isFlag, EditText edit, Activity context){
		InputMethodManager inputmanger = (InputMethodManager)context.getSystemService(Context.INPUT_METHOD_SERVICE);
		if(isFlag){
			inputmanger.showSoftInput(edit, InputMethodManager.RESULT_SHOWN);
			inputmanger.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);
		}else{
			View viewa = context.getWindow().peekDecorView();
			inputmanger.hideSoftInputFromWindow(viewa.getWindowToken(), 0);
		}
	}
}

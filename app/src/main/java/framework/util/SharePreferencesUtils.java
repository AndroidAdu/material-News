package framework.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * SharePreference封装
 */
public class SharePreferencesUtils {
	//定义表名
	public static final String PREF_NAME = "config";

	private static SharedPreferences sp;
	
	private static void init(Context ctx) {
		if (sp == null) {
			//获取默认的Sharepreferences (将会在文件下自动生成一个preferences.xml)
			sp = PreferenceManager.getDefaultSharedPreferences(ctx);
		}
	}
	
	
	/**
	 * 判断文件中是否存在这个参数
	 * 
	 * @param context
	 * @param key
	 * @return
	 */
	public static boolean exitKey(Context context, String key) {
		if (sp == null)
			init(context);

		return sp.contains(key);

	}
	
	
	public static void setSharedIntData(Context context, String key, int value) {
		if (sp == null) {
			init(context);
		}
		sp.edit().putInt(key, value).commit();
	}

	public static int getSharedIntData(Context context, String key) {
		if (sp == null) {
			init(context);
		}
		return sp.getInt(key, 0);
	}

	public static int getSharedIntData(Context context, String key,
									   int defaultValue) {
		if (sp == null)
			init(context);

		return sp.getInt(key, defaultValue);
	}

	public static void setSharedlongData(Context context, String key, long value) {
		if (sp == null) {
			init(context);
		}
		sp.edit().putLong(key, value).commit();
	}

	public static long getSharedlongData(Context context, String key) {
		if (sp == null) {
			init(context);
		}
		return sp.getLong(key, 0l);
	}

	public static long getSharedlongData(Context context, String key,
										 long defaultValue) {
		if (sp == null) {
			init(context);
		}
		return sp.getLong(key, defaultValue);
	}

	public static void setSharedFloatData(Context context, String key,
										  float value) {
		if (sp == null) {
			init(context);
		}
		sp.edit().putFloat(key, value).commit();
	}

	public static Float getSharedFloatData(Context context, String key) {
		if (sp == null) {
			init(context);
		}
		return sp.getFloat(key, 0f);
	}

	public static void setSharedBooleanData(Context context, String key,
											boolean value) {
		if (sp == null) {
			init(context);
		}
		sp.edit().putBoolean(key, value).commit();
	}

	public static Boolean getSharedBooleanData(Context context, String key) {
		if (sp == null) {
			init(context);
		}

		return sp.getBoolean(key, false);
	}

	public static Boolean getSharedBooleanData(Context context, String key,
											   boolean flag) {
		if (sp == null) {
			init(context);
		}
		return sp.getBoolean(key, flag);
	}

	public static void setSharedStringData(Context context, String key,
										   String value) {
		if (sp == null) {
			init(context);
		}
		sp.edit().putString(key, value).commit();
	}

	public static String getSharedStringData(Context context, String key) {
		if (sp == null) {
			init(context);
		}
		return sp.getString(key, "");
	}

	public static String getSharedStringData(Context context, String key,
											 String defaultValue) {
		if (sp == null)
			init(context);
		if (defaultValue == null)
			defaultValue = "";
		return sp.getString(key, defaultValue);
	}
	
	
//--------------------------后面是矛盾的代码---------------------------------------------------//
	
	public static boolean getBoolean(Context ctx, String key,
									 boolean defaultValue) {
		SharedPreferences sp = ctx.getSharedPreferences(PREF_NAME,
				Context.MODE_PRIVATE);
		return sp.getBoolean(key, defaultValue);
	}

	public static void setBoolean(Context ctx, String key, boolean value) {
		SharedPreferences sp = ctx.getSharedPreferences(PREF_NAME,
				Context.MODE_PRIVATE);
		sp.edit().putBoolean(key, value).commit();
	}

	public static String getString(Context ctx, String key, String defaultValue) {
		SharedPreferences sp = ctx.getSharedPreferences(PREF_NAME,
				Context.MODE_PRIVATE);
		return sp.getString(key, defaultValue);
	}

	public static void setString(Context ctx, String key, String value) {
		SharedPreferences sp = ctx.getSharedPreferences(PREF_NAME,
				Context.MODE_PRIVATE);
		sp.edit().putString(key, value).commit();
	}
}

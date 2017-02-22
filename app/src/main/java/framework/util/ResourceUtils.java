package framework.util;

import android.content.Context;

public class ResourceUtils {

	public static int getLayoutId(Context paramContext, String paramString) {
		if (null != paramContext)
			return paramContext.getResources().getIdentifier(paramString,
					"layout", paramContext.getPackageName());
		return 0;
	}

	public static int getStringId(Context paramContext, String paramString) {
		if (null != paramContext)
			return paramContext.getResources().getIdentifier(paramString,
					"string", paramContext.getPackageName());
		return 0;
	}

	public static int getDrawableId(Context paramContext, String paramString) {
		if (null != paramContext)
			return paramContext.getResources().getIdentifier(paramString,
					"drawable", paramContext.getPackageName());
		return 0;
	}

	public static int getStyleId(Context paramContext, String paramString) {
		if (null != paramContext)
			return paramContext.getResources().getIdentifier(paramString,
					"style", paramContext.getPackageName());
		return 0;
	}

	public static int getId(Context paramContext, String paramString) {
		if (null != paramContext)
			return paramContext.getResources().getIdentifier(paramString, "id",
					paramContext.getPackageName());
		return 0;
	}

	public static int getColorId(Context paramContext, String paramString) {
		if (null != paramContext)
			return paramContext.getResources().getIdentifier(paramString,
					"color", paramContext.getPackageName());
		return 0;
	}

	public static int getIdByName(Context context, String name, String type) {
		if (null != context)
			return context.getResources().getIdentifier(
					context.getPackageName() + ":" + type + "/" + name, null,
					null);
		return 0;
	}

}
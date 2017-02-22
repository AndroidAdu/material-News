package framework.util;

import android.content.Context;

import java.util.Locale;

/**
 * Created by 雪阳 on 2016/11/2.
 * 当前系统语言
 */
public class languageUtils {
    /**
     * 当前系统语言是不是中文
     * @return
     */
    public static boolean isChinese(Context context){
        Locale locale = context.getResources().getConfiguration().locale;
        String language = locale.getLanguage();
        if (language.endsWith("zh"))
            return true;
        else
            return false;
    }

}

package framework.util;


import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;

import com.mindimp.control.constants.HttpContants;
import com.mindimp.widget.httpservice.HttpService;

public class StringUtils {
	/** 判断字符串是否有值，
	 * 如果为null或者是空字符串或者只有空格或者为"null"字符串，
	 * 则返回true，否则则返回false */
	public static boolean isEmpty(String value) {
		if (value != null && !"".equalsIgnoreCase(value.trim()) && !"null".equalsIgnoreCase(value.trim())) {
			return false;
		} else {
			return true;
		}
	}
		
	
	public static boolean isNotEmpty(String value){
		
		return !isEmpty(value);
		
	}
	
	/**
	 * 获取用户图像的Url
	 * @param
	 * @return
	 */
	public static String Get50x50ImageUrl(String userimageurl){
		if(TextUtils.isEmpty(userimageurl)){
			return "";
		}else{
			if(userimageurl.startsWith("http")){
				return userimageurl;
			}else{
				return HttpService.httpImageServicePrefixUrl+userimageurl+"@60w_60h_1e_1c";
			}
		}
	}
	
	
	/**
	 * 规定图像的大小尺寸  375x225   (随心问)
	 * 单位：px  @750w_450h_1e_1c
	 * @return
	 */
	public static String Get375x225ImageUrl(String userimageurl){
		if(TextUtils.isEmpty(userimageurl)){
			return "";
		}else{
			if(userimageurl.startsWith("http")){
				return userimageurl;
			}else{
				return HttpService.httpImageServicePrefixUrl+userimageurl+"@750w_750h_1e_1c";
			}
		}


	}
	
	
	/**
	 * @param imageurl
	 * 规定图像的大小尺寸  375x187   (多用于活动页面,和主页面的banner)
	 * 单位：px
	 * @return
	 */
	public static String Get375x187ImageUrl(String imageurl){
		if(TextUtils.isEmpty(imageurl)){
			return "";
		}else{
			if(imageurl.startsWith("http")){
				return imageurl;
			}else{
				return HttpService.httpImageServicePrefixUrl+imageurl+"@750w_374h_1e_1c";
			}
		}

	}

	/**
	 * @param imageurl
	 * 规定图像的大小尺寸  375x187   (多用于活动页面,和主页面的banner)
	 * 单位：px
	 * @return
	 */
	public static String Get375x187ImageUrl2(String imageurl){
		if(TextUtils.isEmpty(imageurl)){
			return "";
		}else{
			if(imageurl.startsWith("http")){
				return imageurl;
			}else{
				return HttpService.httpImageServicePrefixUrl+imageurl+"@750w_420h_1e_1c";
			}
		}

	}

	
	
	
	/**
	 * @param imageurl
	 * 规定图像的大小尺寸  70x70(用于城市的圆形图像)
	 * 单位：px
	 * @return
	 */
	public static String Get70x70ImageUrl(String imageurl){
		if(TextUtils.isEmpty(imageurl)){
			return "";
		}else{
			if(imageurl.startsWith("http")){
				return imageurl;
			}else{
				return HttpService.httpImageServicePrefixUrl+imageurl+"@140w_140h_1e_1c";
			}
		}

	}
	
	
/**
	 * @param imageurl
	 * 规定图像的大小尺寸  167x167(活动精选)
	 * 单位：px
	 * @return
	 */
	public static String Get167x167ImageUrl(String imageurl){
		if(TextUtils.isEmpty(imageurl)){
			return "";
		}else{
			if(imageurl.startsWith("http")){
				return imageurl;
			}else{
				return HttpService.httpImageServicePrefixUrl+imageurl+"@334w_334h_1e_1c";
			}
		}

	}

	/**
	 * @param imageurl
	 * 规定图像的大小尺寸  242x167(活动精选)
	 * 单位：px
	 * @return
	 */
	public static String Get242x167ImageUrl(String imageurl){
		if(TextUtils.isEmpty(imageurl)){
			return "";
		}else{
			if(imageurl.startsWith("http")){
				return imageurl;
			}else{
				return HttpService.httpImageServicePrefixUrl+imageurl+"@484w_334h_1e_1c";
			}
		}

	}





	/**
	 * @param imageurl
	 * 规定图像的大小尺寸  145x73(活动精选)
	 * 单位：px
	 * @return
	 */
	public static String Get145x73ImageUrl(String imageurl){
		if(TextUtils.isEmpty(imageurl)){
			return "";
		}else{
			if(imageurl.startsWith("http")){
				return imageurl;
			}else{
				return HttpService.httpImageServicePrefixUrl+imageurl+"@290w_146h_1e_1c";
			}
		}

	}
	
	
	
	/**
	 * @param imageurl
	 * 规定图像的大小尺寸  344x172(最新活动)
	 * 单位：px
	 * @return
	 */
	public static String Get344x172ImageUrl(String imageurl){
		if(TextUtils.isEmpty(imageurl)){
			return "";
		}else{
			if(imageurl.startsWith("http")){
				return imageurl;
			}else{
				return HttpService.httpImageServicePrefixUrl+imageurl+"@668w_344h_1e_1c";
			}
		}

	}
	
	
	/**
	 * @param imageurl
	 * 规定图像的大小尺寸  100x100(棒呆频道 热门话题)
	 * 单位：px
	 * @return
	 */
	public static String Get100x100ImageUrl(String imageurl){
		if(TextUtils.isEmpty(imageurl)){
			return "";
		}else{
			if(imageurl.startsWith("http")){
				return imageurl;
			}else{
				return HttpService.httpImageServicePrefixUrl+imageurl+"@100w_100h_1e_1c";
			}
		}

	}
	
	/**
	 * 阅读小组 的图片
	 * @param imageurl
	 * @return
	 */
	public static String Get69x97ImageUrl(String imageurl){
		if(TextUtils.isEmpty(imageurl)){
			return "";
		}else{
			if(imageurl.startsWith("http")){
				return imageurl;
			}else{
				return HttpService.httpImageServicePrefixUrl+imageurl+"@138w_194h_1e_1c";
			}
		}

	}

	/**
	 * 阅读小组 的图片
	 * @param imageurl
	 * @return
	 */
	public static String Get96x137ImageUrl(String imageurl){
		if(TextUtils.isEmpty(imageurl)){
			return "";
		}else{
			if(imageurl.startsWith("http")){
				return imageurl;
			}else{
				return HttpService.httpImageServicePrefixUrl+imageurl+"@192w_274h_1e_1c";
			}
		}

	}

	
	
	
	public static String GetShareUrl(String type, String eid){
		if("".equals(eid)){
			return "https://app.bonday.cn/m/"+type;
		}
		return "https://app.bonday.cn/m/"+type+"?id="+eid;
	}
	
	
	/**
	 * 完成字符串的拼接
	 * 网页的拼接
	 */
	public static String GetRequestUrl(String url){
		return HttpContants.WEB_URL+url;
	}
	
	
	/**
	 *  获取图像的url
	 */
	public static String GetImageUrl(String userimageurl){
		if(TextUtils.isEmpty(userimageurl)){
			return "";
		}else{
			if(userimageurl.startsWith("http")){
				return userimageurl;
			}else{
				return HttpContants.IMAGE_URL+userimageurl;
			}
		}
	}
	
	
	/**
	 * 获取web的url
	 */
	public static String GetWebRequestUrl(String url){
		if(TextUtils.isEmpty(url)){
			return "";
		}
		return HttpContants.WEBVIEWEB+url;
	}
	
	
	
	 /**
     * 关键字高亮显示
     * 
     * @param target  需要高亮的关键字
     * @param
     * @return spannable 处理完后的结果，记得不要toString()，否则没有效果
     */
    public static Spanned highlight(String content, String target) {
    	
    	if(content.contains(target)){
    		
    		int index = content.indexOf(target);  
    		int len = target.length(); 
    		return Html.fromHtml(content.substring(0, index)
    				+ "<font color=#FF510c>"
    				+ content.substring(index, index + len) + "</font>"  
    				+ content.substring(index + len, content.length())); 
    	}else{
    		return Html.fromHtml(content);
    	}
    	
       /* SpannableStringBuilder spannable = new SpannableStringBuilder(text);
        CharacterStyle span = null;
 
        Pattern p = Pattern.compile(target);
        Matcher m = p.matcher(text);
        while (m.find()) {
            span = new ForegroundColorSpan(Color.RED);// 需要重复！
            spannable.setSpan(span, m.start(), m.end(),
                    Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        }
        return spannable;*/
    }
	
}

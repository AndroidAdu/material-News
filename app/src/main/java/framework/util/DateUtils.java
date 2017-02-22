package framework.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期工具类
 * 
 * @author duxue
 *
 */
public class DateUtils {
	
	//获取年月日
	public static String long2String(long date) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy年MM月dd日");
		Date curDate = new Date(date);// 获取当前时间
		String str = formatter.format(curDate);
		return str;
	}


	//获取年月日
	public static String long2String3(long date) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date curDate = new Date(date);// 获取当前时间
		String str = formatter.format(curDate);
		return str;
	}
	
	//获取年月日
	public static String long2String2(long date) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd");
		Date curDate = new Date(date);// 获取当前时间
		String str = formatter.format(curDate);
		return str;
	}
	
	
	/**
	 * 获取月和日
	 */
	public static String long2StringforMD(long date){
		SimpleDateFormat formatter = new SimpleDateFormat("MM月dd日");
		Date curDate = new Date(date);// 获取当前时间
		String str = formatter.format(curDate);
		return str;
	}
	
	
	/**
	 * 获取月和日
	 */
	public static String long2StringforMD2(long date){
		SimpleDateFormat formatter = new SimpleDateFormat("MM-dd");
		Date curDate = new Date(date);// 获取当前时间
		String str = formatter.format(curDate);
		return str;
	}

	/**
	 * 获取月和日
	 */
	public static String long2StringforMD3(long date){
		SimpleDateFormat formatter = new SimpleDateFormat("MM.dd");
		Date curDate = new Date(date);// 获取当前时间
		String str = formatter.format(curDate);
		return str;
	}
	
	/**
	 * 获取小时和分钟
	 */
	public static String long2StringforHm(long date){
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
		Date curDate = new Date(date);// 获取当前时间
		String str = formatter.format(curDate);
		return str;
	}
	
	
	
	
	

	/**
	 * 返回unix时间戳 (1970年至今的秒数)
	 * 
	 * @return
	 */
	public static long getUnixStamp() {
		return System.currentTimeMillis() / 1000;
	}

	/**
	 * 得到昨天的日期
	 * 
	 * @return
	 */
	public static String getYestoryDate() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, -1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String yestoday = sdf.format(calendar.getTime());
		return yestoday;
	}

	/**
	 * 得到今天的日期
	 * 
	 * @return
	 */
	public static String getTodayDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(new Date());
		return date;
	}

	/**
	 * 时间戳转化为时间格式
	 * 
	 * @param timeStamp
	 * @return
	 */
	public static String timeStampToStr(long timeStamp) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = sdf.format(timeStamp * 1000);
		return date;
	}

	/**
	 * 得到日期 yyyy-MM-dd
	 * 
	 * @param timeStamp
	 *            时间戳
	 * @return
	 */
	public static String formatDate(long timeStamp) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(timeStamp * 1000);
		return date;
	}

	/**
	 * 得到时间 HH:mm:ss
	 * 
	 * @param timeStamp
	 *            时间戳
	 * @return
	 */
	public static String getTime(long timeStamp) {
		String time = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = sdf.format(timeStamp * 1000);
		String[] split = date.split("\\s");
		if (split.length > 1) {
			time = split[1];
		}
		return time;
	}

	/**
	 * 将一个时间戳转换成提示性时间字符串，如刚刚，1秒前
	 * 
	 * @param timeStamp
	 * @return
	 */
	public static String convertTimeToFormat(long timeStamp) {
		long curTime = System.currentTimeMillis() / (long) 1000;
		long time = curTime - timeStamp;

		if (time < 60 && time >= 0) {
			return "刚刚";
		} else if (time >= 60 && time < 3600) {
			return time / 60 + "分钟前";
		} else if (time >= 3600 && time < 3600 * 24) {
			return time / 3600 + "小时前";
		} else if (time >= 3600 * 24 && time < 3600 * 24 * 30) {
			return time / 3600 / 24 + "天前";
		} else if (time >= 3600 * 24 * 30 && time < 3600 * 24 * 30 * 12) {
			return time / 3600 / 24 / 30 + "个月前";
		} else if (time >= 3600 * 24 * 30 * 12) {
			return time / 3600 / 24 / 30 / 12 + "年前";
		} else {
			return "刚刚";
		}
	}

	/**
	 * 将一个时间戳转换成提示性时间字符串，(多少分钟)
	 * 
	 * @param timeStamp
	 * @return
	 */
	public static String timeStampToFormat(long timeStamp) {
		long curTime = System.currentTimeMillis() / (long) 1000;
		long time = curTime - timeStamp;
		return time / 60 + "";
	}
}

// Android中常用的几种获取数据的方式
// 1、Calendar
// Calendar c = Calendar.getInstance();
// year = c.get(Calendar.YEAR)
// month = c.grt(Calendar.MONTH)
// day = c.get(Calendar.DAY_OF_MONTH)
// hour = c.get(Calendar.HOUR_OF_DAY);
// minute = c.get(Calendar.MINUTE)
// 2、new Date
// SimpleDateFormat formatter = new SimpleDateFormat ("yyyy年MM月dd日 HH:mm:ss ");
// Date curDate = new Date(System.currentTimeMillis());//获取当前时间
// String str = formatter.format(curDate);
// 可以指定时区的时间
// df=DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL,Locale.CHINA);
// 如何获取Android系统时间是24小时制还是12小时制
// ContentResolver cv = this.getContentResolver();
// String strTimeFormat = android.provider.Settings.System.getString(cv,
// android.provider.Settings.System.TIME_12_24);
// (strTimeFormat.equals("24"))
// 3、new Time 获取24小时时间
// Time t=new Time(); // or Time t=new Time("GMT+8"); 加上Time Zone资料。
// t.setToNow(); // 取得系统时间。
// int year = t.year;
// int month = t.month;
// date = t.monthDay;
// int hour = t.hour; // 0-23
// int minute = t.minute;
// int second = t.second;

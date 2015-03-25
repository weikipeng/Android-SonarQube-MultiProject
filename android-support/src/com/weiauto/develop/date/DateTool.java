package com.weiauto.develop.date;

import java.text.SimpleDateFormat;
import java.util.Date;

import android.annotation.TargetApi;
import android.os.Build;
import android.text.format.DateUtils;

public class DateTool {
	private DateTool() {
	
	}
	
	public static final int SECOND_VALUE = 1000;
	public static final int MINUTE_VALUE = 60 * SECOND_VALUE;
	public static final String PATTERN_UTC ="yyyy-MM-dd'T'HH:mm:ss";
	public static final String PATTERN_YEAR_MONTH_DAY ="yyyy-MM-dd";
	
	@TargetApi(Build.VERSION_CODES.CUPCAKE)
	public static String getRelativeTime(long value){
		String result = "";
		long nowTime = System.currentTimeMillis();
		long relavite = nowTime - value;
		if(relavite < MINUTE_VALUE){
			result = relavite/SECOND_VALUE +"秒前";
			return result;
		}
		
		result = String.valueOf(DateUtils.getRelativeTimeSpanString(value, nowTime, 0L, DateUtils.FORMAT_ABBREV_ALL));
		
		return result;
	}
	
	public static Date parseUtcTime(String time){
		Date date = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(PATTERN_UTC);
			date = sdf.parse(time);
			return date;
		} catch (Exception e) {
			e.printStackTrace();
			date = new Date();
		}
		
		return date;
	}
	
	public static String getYearMonthDay(long milliseconds){
		Date date = new Date(milliseconds);
		
//		SimpleDateFormat dateFormat = new SimpleDateFormat(PATTERN_YEAR_MONTH_DAY);
//		
//		return dateFormat.format(date);
		
		return getYearMonthDay(date);
	}
	public static String getYearMonthDay(Date date){
		SimpleDateFormat dateFormat = new SimpleDateFormat(PATTERN_YEAR_MONTH_DAY);
		
		return dateFormat.format(date);
	}
	
//	public static final int Time = 1000;
//	public static final int SECOND_VALUE = 1000;
//	public static final int SECOND_VALUE = 1000;
//	public static final int SECOND_VALUE = 1000;
//	public static final int SECOND_VALUE = 1000;
//	public static final int SECOND_VALUE = 1000;
//	public static final int SECOND_VALUE = 1000;
}

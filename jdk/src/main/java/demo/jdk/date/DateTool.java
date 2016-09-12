package demo.jdk.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTool {
	
	public static final String FORMAT_DAY_TIME = "yyyy-MM-dd HH:mm:ss";
	
	
	public static Date hourAdd(Date date, int hour) {
		Date hourAdd = null;
		if (date != null) {
			Calendar calendar = Calendar.getInstance();
			
			calendar.setTime(date);
			calendar.add(Calendar.HOUR_OF_DAY, hour);
			
			hourAdd = calendar.getTime();
		}
		return hourAdd;
	}
	
	public static Date hourStart(Date date) {
		Date hourStart = null;
		if (date != null) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			
			calendar.set(Calendar.MINUTE, 0);
			calendar.set(Calendar.SECOND, 0);
			calendar.set(Calendar.MILLISECOND, 0);
			
			hourStart = calendar.getTime();
		}
		return hourStart;
	}
	
	public static String formatDayTime(Date date) {
		String format = "";
		if (date != null) {
			SimpleDateFormat simpleFormat = new SimpleDateFormat(FORMAT_DAY_TIME);
			format = simpleFormat.format(date);
		}
		return format;
	}

}

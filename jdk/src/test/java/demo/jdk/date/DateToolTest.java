package demo.jdk.date;

import java.util.Date;

import junit.framework.TestCase;

public class DateToolTest extends TestCase {
	
	public void testHourAdd() {
		
		Date currentDate = new Date();
		
		// 24 * 365 * 10000
		long total = 24 * 365 * 10;
		for(int addHour = 0; addHour <= total; addHour ++) {
			
			Date currentHourStart = DateTool.hourStart(currentDate);
			
			Date hourAddByCalendar = DateTool.hourAdd(currentHourStart, addHour);
			long currentHourStartTimeMillisSecond = currentHourStart.getTime();
			long hourAddTimeMillisSecond = 3600L * 1000 * addHour;
			Date hourAddByMillisSecond = new Date(currentHourStartTimeMillisSecond + hourAddTimeMillisSecond);
			Date hourAddByMillisSecondOne = new Date(hourAddByCalendar.getTime());
			
			String formatCalendar = DateTool.formatDayTime(hourAddByCalendar);
			String formatAddByMillisSecond = DateTool.formatDayTime(hourAddByMillisSecond);
			String formatAddByMillisSecondOne = DateTool.formatDayTime(hourAddByMillisSecondOne);
			
			// System.out.println(" \t formatCalendar: " + formatCalendar);
			// System.out.println(" \t formatAddByMillisSecond: " + formatAddByMillisSecond);
			// System.out.println(" \t formatAddByMillisSecondOne: " + formatAddByMillisSecondOne);
			if (!formatCalendar.equals(formatAddByMillisSecond)) {
				System.out.println(" \t currentHourStartTimeMillisSecond: " + currentHourStartTimeMillisSecond);
				System.out.println(" \t hourAddTimeMillisSecond: " + hourAddTimeMillisSecond);
				
			} else {
				System.out.println(" \t test cuont: " + (addHour + 1) + "  totalCount: " +  total);
			}

			
			TestCase.assertEquals(formatCalendar, formatAddByMillisSecond);
			TestCase.assertEquals(formatCalendar, formatAddByMillisSecondOne);
			// System.out.println(" \t add hour: " + addHour +  " finish verify hour add.        \n\n\n");
			
			
			// formatCalendar: 2016-10-07 08:00:00
		 	// formatAddByMillisSecond: 2016-08-18 14:57:12
		 	// formatAddByMillisSecondOne: 2016-10-07 08:00:00
		 	// currentHourStartTimeMillisSecond: 1473649200000
		 	// hourAddTimeMillisSecond: -2145767296
			
		}
	}

}

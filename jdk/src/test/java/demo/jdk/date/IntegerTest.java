package demo.jdk.date;

import junit.framework.TestCase;

public class IntegerTest extends TestCase {
	
	public void testInteger() {
		
		
		// 596 hours, 24 days, 
		int maxHourInteger = Integer.MAX_VALUE / (3600 * 1000);
		System.out.println("\n\n maxHourInteger = " + maxHourInteger);
		int maxDayInteger = Integer.MAX_VALUE/ (3600 * 1000 * 24);
		System.out.println("\n\n maxDayInteger = " + maxDayInteger);
		
		// 2562047788015 hours 
		long maxHourLong = Long.MAX_VALUE / (3600 * 1000);
		System.out.println("\n\n maxHourLong = " + maxHourLong);
		// 106751991167 days
		long maxDayLong = Long.MAX_VALUE / (3600 * 1000 * 24);
		System.out.println("\n\n maxDayLong = " + maxDayLong);
		// 6269161692 years
		long maxYearLong = Long.MAX_VALUE / (3600 * 1000 * 24 * 365);
		System.out.println("\n\n maxYearLong = " + maxYearLong);
		
	}

}

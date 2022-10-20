package day9.utilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtility {

	public static void main(String[] args) {
		getRequiredDateBasedOnNumberOfDays("dd MM yyyy HH:mm:ss", -3);
		getRequiredDateBasedOnNumberOfDays("dd MM yyyy", -3);
		getRequiredDateBasedOnNumberOfDays("dd MMM yyyy ", 3);
		getRequiredDateBasedOnNumberOfDays("dd MMMM yyyy", 3);
		getRequiredDateBasedOnNumberOfMonths("dd/MM/yyyy", 4);
		getRequiredDateBasedOnNumberOfDays("dd MMMM yyyy", 5);
	}
	public static String getRequiredDateBasedOnNumberOfDays(String format,int numberOfDays) {
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE, numberOfDays);
		SimpleDateFormat s=new SimpleDateFormat(format);
		return s.format(new Date(cal.getTimeInMillis()));
	}
	
	public static String getRequiredDateBasedOnNumberOfMonths(String format,int numberOfMonths) {
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE, numberOfMonths);
		SimpleDateFormat s=new SimpleDateFormat(format);
		return s.format(new Date(cal.getTimeInMillis()));
	}
	
	public static String getRequiredDateBasedOnNumberOfYears(String format,int numberOfYears) {
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE, numberOfYears);
		SimpleDateFormat s=new SimpleDateFormat(format);
		return s.format(new Date(cal.getTimeInMillis()));
	}

}

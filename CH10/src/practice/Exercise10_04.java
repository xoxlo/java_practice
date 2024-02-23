package practice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_04 {
	public static void main(String[] args) {
		Calendar birthday = Calendar.getInstance();
		Calendar today = Calendar.getInstance();
		birthday.set(2001, 3, 10);
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		long difference = (today.getTimeInMillis() - birthday.getTimeInMillis()) / 1000;
		System.out.println("birth day = " + df.format(new Date(birthday.getTimeInMillis())));
		System.out.println("today 	  = " + df.format(new Date(today.getTimeInMillis())));
		System.out.println(difference/(24*60*60) + "days");
	}
}

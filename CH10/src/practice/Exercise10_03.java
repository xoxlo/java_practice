package practice;

import java.util.*;
import java.text.*;

public class Exercise10_03 {
	static int paycheckCount(Calendar from, Calendar to) {
//		int monDiff;
//		if (from == null && to == null) {
//			return 0;
//		} else if (from.get(Calendar.DATE) == to.get(Calendar.DATE) && from.get(Calendar.DATE) == 21 && to.get(Calendar.DATE) == 21){
//			return 1;
//		} else
//			monDiff = to.get(Calendar.YEAR) - from.get(Calendar.YEAR) >= 0 ? to.get(Calendar.MONTH) - from.get(Calendar.MONTH) : 0;
//			if(monDiff < 0)
//				monDiff = 0;
//			else if( monDiff > 0 && (from.get(Calendar.DAY_OF_MONTH) <= 21 && to.get(Calendar.DAY_OF_MONTH) >= 21))
//				monDiff++;
//			else if( monDiff > 0 && (from.get(Calendar.DAY_OF_MONTH) >= 21 && to.get(Calendar.DAY_OF_MONTH) < 21))
//				monDiff--;
		
		if(from == null && to == null) return 0;
		if(from.equals(to) && from.get(Calendar.DAY_OF_MONTH) == 21) return 1;
		
		int fromYear = from.get(Calendar.YEAR);
		int fromMonth = from.get(Calendar.MONTH);
		int fromDay = from.get(Calendar.DAY_OF_MONTH);
		
		int toYear = to.get(Calendar.YEAR);
		int toMonth = to.get(Calendar.MONTH);
		int toDay = to.get(Calendar.DAY_OF_MONTH);
		
		int monDiff = (toYear * 12 + toMonth) - (fromYear * 12 - fromMonth);
		if (monDiff < 0) return 0;
		if(fromDay <= 21 && toDay >= 21)
			monDiff++;
		if(fromDay > 21 && toDay < 21)
			monDiff--;
		
		return monDiff;
	}
	
	static void printResult(Calendar from, Calendar to) {
		Date fromDate = from.getTime();
		Date toDate = to.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.print(sdf.format(fromDate) + " ~ " + sdf.format(toDate) + " : ");
		System.out.println(paycheckCount(from, to));
	}
	public static void main(String[] args) {
		Calendar fromCal = Calendar.getInstance();
		Calendar toCal = Calendar.getInstance();
		
		fromCal.set(2020, 0, 1);
		toCal.set(2020, 0, 1);
		printResult(fromCal, toCal);
		
		fromCal.set(2020, 0, 21);
		toCal.set(2020, 0, 21);
		printResult(fromCal, toCal);
		
		fromCal.set(2020, 0, 1);
		toCal.set(2020, 2, 1);
		printResult(fromCal, toCal);
		
		fromCal.set(2020, 0, 1);
		toCal.set(2020, 2, 23);
		printResult(fromCal, toCal);
		
		fromCal.set(2020, 0, 23);
		toCal.set(2020, 2, 21);
		printResult(fromCal, toCal);
		
		fromCal.set(2021, 0, 22);
		toCal.set(2020, 2, 21);
		printResult(fromCal, toCal);
		
	}
}

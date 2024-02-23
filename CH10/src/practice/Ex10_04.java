package practice;

import java.util.Calendar;

public class Ex10_04 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.set(2023, 9, 14);
		
		System.out.println(toString(date));
		System.out.println("= 1일 후 =");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
		
		System.out.println("= 6달 전 =");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));
		
		System.out.println("= 31일 후(roll) =");
		date.roll(Calendar.DATE, 31);		// roll 메소드는 다른 필드의 영향을 미치지 않는다. 즉, roll을 해서 그 달의 말일이 지나도 일 필드값만 변경이 되고 월은 +가 안된다
		System.out.println(toString(date));
		
		System.out.println("= 31일 후(add) =");
		date.add(Calendar.DATE, 31);
		System.out.println(toString(date));
	}
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE) + "일";
	}
}

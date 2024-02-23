package practice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exercise10_02 {
	public static void main(String[] args) {
		final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};
		String pattern = "yyyy/MM/dd";
		Scanner sc = new Scanner(System.in);
		DateFormat df = new SimpleDateFormat(pattern);
		
		Date inDate = null;
		
		System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요. (입력예:2023/10/14)");
		System.out.print(">> ");
		
		while(sc.hasNextLine()) {
			try {
				inDate = df.parse(sc.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("날짜를 " + pattern + "의 형태로 다시 입력해주세요. (입력예:2023/10/14)");
				System.out.print(">>");
			}
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		System.out.println("입력하신 날짜는 " + DAY_OF_WEEK[cal.get(Calendar.DAY_OF_WEEK)] + "요일 입니다");
	}
}

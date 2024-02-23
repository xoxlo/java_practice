package practice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex10_10 {
	public static void main(String[] args) {
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern); // 입력한 패턴 형태
		Scanner s = new Scanner(System.in);	// 날짜 입력 받음
		
		Date inDate = null;
		System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요. (입력예:2023/10/14)");
		while(s.hasNextLine()) { // '\n' 개행도 읽어야할 값으로 판단해서 항상 true를 반환 
			try {
				inDate = df.parse(s.nextLine()); // 입력한 날짜를 parse를 통해 숫자만 String으로 저장
				break;
			} catch(Exception e) { // 패턴 형태로 입력 안할 시 무한 반복 (try, catch 때문, 예외가 발생해도 정상 작동)
				System.out.println("날짜를 " + pattern + "의 형태로 다시 입력해주세요. (입력예:2023/10/14)");
			}
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		Calendar today = Calendar.getInstance();
		long day = (cal.getTimeInMillis() - today.getTimeInMillis()) / (60*60*1000); // 초의 1000분의 1이니까 1000*60(시간)*60(분)해서 시간으로 변환
		System.out.println("입력하신 날짜는 현재와 " + day + "시간 차이가 있습니다.");
	}
}

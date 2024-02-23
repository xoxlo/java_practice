package practice;

import java.util.Calendar;

public class Ex10_03 {
	public static void main(String[] args) {
		final int[] TIME_UNIT = {3600, 60, 1}; // 큰 단위를 앞에 놓는다 // 시간, 분, 초를 초단위로 저장
		final String[] TIME_UNIT_NAME = {"시간 ", "분 ", "초 "};
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		
		// time1, time2 설정
		time1.set(Calendar.HOUR_OF_DAY, 10);
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);
		
		time2.set(Calendar.HOUR_OF_DAY, 20);
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10);
		
		// time1, time2 시간 출력
		System.out.println("time1 : " + time1.get(Calendar.HOUR_OF_DAY) + "시 " + time1.get(Calendar.MINUTE) + "분 " + time1.get(Calendar.SECOND) + "초");
		System.out.println("time2 : " + time2.get(Calendar.HOUR_OF_DAY) + "시 " + time2.get(Calendar.MINUTE) + "분 " + time2.get(Calendar.SECOND) + "초");
	
		// time1과 time2의 시차
		long difference = Math.abs(time2.getTimeInMillis() - time1.getTimeInMillis()) / 1000;
		System.out.println("time1과 time2의 차이는 " + difference + "초 입니다");
		
		String tmp = "";
		for(int i = 0; i < TIME_UNIT.length; i++) {
			tmp += difference/TIME_UNIT[i] + TIME_UNIT_NAME[i]; // (차이 / 시간(3600)) -> 시간의 차이
																// (차이 / 분(60))  -> 분의 차이
																// (차이 / 초(1))   -> 초의 차이
			difference %= TIME_UNIT[i]; // 시간 -> 분 -> 초 순서대로 difference를 초기화
		}
		System.out.println("시분초로 변환하면 " + tmp + "입니다.");
	}
}

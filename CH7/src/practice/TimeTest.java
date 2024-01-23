package practice;

class Time {
	private int hour; 	// 0 ~ 23사이의 값을 가져야함
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(isNotValidHour(hour))
			return;
		this.hour = hour; 
	}
	// 매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메소드
	private boolean isNotValidHour(int hour) {
		return hour < 0 || hour > 23;
	}
	public int getHour() { return hour; }
	
	
	public void setMinute(int minute) {
		if (minute < 0 || minute > 59)
			return ;
		this.minute = minute;
	}
	public int getMinute() { return minute; }
	
	
	public void setSecond(int second) {
		if (second < 0 || second > 59)
			return ;
		this.second = second;
	}
	public int getSecond() { return second; }
}

public class TimeTest {
	public static void main(String[] args) {
		Time t = new Time();
//		t.hour = 25;
		t.setHour(21);
		System.out.println(t.getHour());
		t.setHour(100);
		System.out.println(t.getHour());
	}
}

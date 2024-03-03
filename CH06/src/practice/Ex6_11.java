package practice;

class Data_1 {
	int value;
	Data_1(){} // 기본 생성자를 추가
}

class Data_2 {
	int value;

	Data_2() {} // 기본 생성자
	
	Data_2(int x) { // 매개변수가 있는 생성자
		value = x;
	}
}

public class Ex6_11 {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(); // compile error 발생
	}
}

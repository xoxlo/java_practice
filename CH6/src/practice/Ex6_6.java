package practice;

class Data { int x; }

public class Ex6_6 {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x); // Data클래스로 만들어진 d객체의 x가 바뀐게 아니라 change메서드의 x의 값이 변경된 것
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x); // 그래서 x의 값이 그대로. 영향 미치지 못함
	}
	static void change(int x) { // 기본형 매개변수
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}


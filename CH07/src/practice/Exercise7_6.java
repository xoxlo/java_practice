package practice;

class Outer1 {			// 외부 클래스
	class Inner {		// 내부 클래스(인스턴스 클래스)
		int iv = 100;
	}
}

public class Exercise7_6 {
	public static void main(String[] args) {
		Outer1 ot1 = new Outer1();
		Outer1.Inner ii = ot1.new Inner();
		System.out.println(ii.iv);
	}
}

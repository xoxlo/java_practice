package practice;

public class Ex8_02 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(0/0); // 예외 발생 catch문 이동
			System.out.println(2); // 실행되지 않음
		} catch (ArithmeticException e) {
			System.out.println(3); // 실행됨
		}
		System.out.println(4);
	}
}

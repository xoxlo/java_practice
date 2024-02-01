package practice;

public class Ex8_01 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3);
		} catch (Exception e) {
			System.out.println(4);	// 실행되지 않음
		} // why ? 예외가 발생하지 않아서
		System.out.println(5);
	}
}

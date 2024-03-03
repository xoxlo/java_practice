package practice;

public class Ex8_03 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0); // 예외 발생 - catch문 이동
			System.out.println(4); // 실행되지 않음
		} catch (Exception e) {
			System.out.println(5); // 실행 됨
		}
		System.out.println(6);
	}
}

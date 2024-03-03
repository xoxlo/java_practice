package practice;

public class Exercise8_8 {
	public static void main(String[] args) {
		try {
			method1(); // 1. method1() 실행
			System.out.println(6);
		} catch (Exception e) { // 8. method1()에서 받은 Exception 예외를 처리
			System.out.println(7); // 9. 7출력
		}
	}
	
	static void method1() throws Exception { // 이 메소드를 호출한 메소드에게 책임을 전가함. 최고 조상인 Exception (어떤 예외든)
		try {
			method2(); // 2. method2() 실행
			System.out.println(1);
		} catch (NullPointerException e) { // 4. method2()에서 발생한 강제 예외로 실행
			System.out.println(2); // 5. 2출력
			throw e;	// 7. method1()을 호출한 main 메소드에 예외를 던지전에 예외와 상관없이 실행하는 finally 문 실행
		} catch (Exception e) {
			System.out.println(3);
		} finally {
			System.out.println(4); // 6. 4출력
		}
		System.out.println(5);
	}
	static void method2() {
		throw new NullPointerException(); // 3. 강제 예외 발생 시킴 -> method1() 메소드 안 try에서 예외가 발생했기 때문에 method1()에서 예외처리함
	}
}

package practice;

public class Exercise8_5 {
	public static void main(String[] args) {
		try {
			method1(); // 1. 메소드 실행
		} catch (Exception e) { // 6. method2()에서 발생한 예외를 처리 (최고조상 예외 Exception)
			System.out.println(5); // 7. 5출력
		}
	}
	
	static void method1() {
		try {
			method2(); // 2. 메소드 실행
			System.out.println(1);
		} catch (ArithmeticException e) {
			System.out.println(2);
		} finally { // 4. method2()에서 발생한 예외를 처리할 catch문이 없으니 method1()도 종료. 그 전에 finally문 실행
			System.out.println(3); // 5. 3출력
		}
		System.out.println(4);
	} // method1()
	static void method2() {
		throw new NullPointerException(); // 3. 강제 예외 발생. 예외 처리할 try-catch문 없으니 메소드 종료
	}
}

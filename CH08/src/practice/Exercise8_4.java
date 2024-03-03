package practice;

public class Exercise8_4 {
	static void method(boolean b) {
		try {
			System.out.println(1); // 무조건 실행 
			if (b) throw new ArithmeticException(); // b가 true -> 강제 예외 발생 -> RuntimeException절로 이동
			System.out.println(2);
		} catch(RuntimeException r) {
			System.out.println(3); // RuntimeException 발생, b가 true일 시 3 출력
			return;					// finally 문 먼저 실행 후 return
		} catch(Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5);
		}
		System.out.println(6); // return 했으니 b가 true일 땐 실행 X
	}
	public static void main(String[] args) {
		method(true); // 1 3 5
		method(false); // 1 2 5 6
	}
}

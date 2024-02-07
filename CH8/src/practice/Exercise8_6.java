package practice;

public class Exercise8_6 {
	static void method(boolean b) {
		try {
			System.out.println(1); // 2. 1출력
			if (b) System.exit(0); // 3. b가 true -> 프로그램 즉시 종료
			System.out.println(2);
		} catch (RuntimeException r) {
			System.out.println(3);
			return;
		} catch (Exception e) {
			System.out.println(4);
			return;
		} finally { // 프로그램 즉시 종료로 실행 하지 않음
			System.out.println(5);
		}
		System.out.println(6);
	}
	
	public static void main(String[] args) {
		method(true); // 메소드 실행
		method(false);
	}
}

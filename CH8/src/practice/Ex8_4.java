package practice;

public class Ex8_4 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(args[0]);
			System.out.println(0/0); // 예외 발생 - catch문 이동
			System.out.println(4); // 실행되지 않음
		} catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException)
				System.out.println("true");
			System.out.println("ArithmeticException");
//		} catch (Exception e) {	// 모든 예외의 최고 조상
//			System.out.println("Exception");
//		}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		System.out.println(6);
	}
}

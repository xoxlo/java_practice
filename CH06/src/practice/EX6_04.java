package practice;

public class EX6_04 {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);			// add메소드 호출
		long result2 = mm.substract(5l, 3l);	// substract메소드 호출
		long result3 = mm.multiply(5l, 3l);		// multiply메소드 호출
		double result4 = mm.divide(5l, 3l);		// divide메소드 호출
		mm.printGugudan(6);
		
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("substract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
	}
}

class MyMath {
	void printGugudan(int dan) {
		if(!(2<= dan && dan <=9)) {
			return; // 입력받은 단(dan)이 2~9가 아니면, 메소드 종료하고 돌아가기
		}
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
//		return; --> 반환타입 void여서 생략 가능
	}
	long add(long a, long b) {
		long result = a + b;
		return result;
//		return a + b; // 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있
	}
	long max(long a, long b) {
		if(a>b)
			return a;	// 조건식이 참일때만 실행
		else
			return b;	// 조건식이 거짓일 때 실행
	}
	
	long substract(long a, long b) { return a - b; }
	long multiply(long a, long b) { return a * b; }
	double divide(double a, double b) {
		return a / b;
	}
}
package practice;

public class Ex7_07 {
	public static void main(String[] args) {
		Car car = new Car();	// 실제 인스턴스가 무엇인지가 중요
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		Car car2 = null;
//		FireEngine fe3 = (FireEngine)car2;	car2가 null 이기 때문에 참조변수도 null을 가리킨다. 오류
//		fe3.water();
		
//		FireEngine fe3 = (FireEngine)car; // 조상 <-> 자손 간에 형변환은 되는데 오류가 뜸 (실행 시 오류)
//		Car car2 = (Car)fe2;
//		car2.drive();
		
		fe.water();
		car = fe; 		// car = (Car)fe; 에서 형변환이 생략됨 up casting
//		car.water();	// 에러. Car타입의 참조변수인 car로는 water()를 사용불가
		fe2 = (FireEngine)car; // 자손 타입 <- 조상타입 형변환 생략 불가 down casting
		fe2.water();

	}
}

class Car {
	String color;
	int door;
	
	void drive() {		// 운전하는 기능
		System.out.println("Drive, Brrrrr ~~~");
	}
	
	void stop() {		// 멈추는 기능
		System.out.println("Stop !");
	}
}

class FireEngine extends Car {		// 소방차
	void water() {		// 물을 뿌리는 기능
		System.out.println("Water !");
	}
}

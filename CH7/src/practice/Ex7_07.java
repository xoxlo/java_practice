package practice;

public class Ex7_07 {
	public static void main(String[] args) {
		Car car = new Car();
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; 		// car = (Car)fe; 에서 형변환이 생략됨 up casting
//		car.water();
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

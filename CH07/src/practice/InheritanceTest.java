package practice;

class MyPoint {
	int x;
	int y;
}

//class Circle extends MyPoint {	// 상속
//	int r;
//}

class Circle {	// 포함
	MyPoint mp;	// 선언
//	mp = new MyPoint();	// 참조변수의 초기화
	int r;
	Circle() {
		mp = new MyPoint();
	}
}

public class InheritanceTest {
	public static void main(String[] args) {
		Circle c = new Circle();
		Circle c2 = new Circle();
//		c.mp.x = 1;
//		c.mp.y = 2;
//		c.r = 3;
//		System.out.println("c.mp.x = " + c.mp.x);
//		System.out.println("c.mp.y = " + c.mp.y);
//		System.out.println("c.r = " + c.r);
		System.out.println(c.toString());
		System.out.println(c2.toString());
		System.out.println(c2);	// c.toString()이나 c나 똑같은 문장 (toString()자동적으로 호출 한다)
	}
}

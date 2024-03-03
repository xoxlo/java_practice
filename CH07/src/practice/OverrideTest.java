package practice;

class Point3 {
	int x;
	int y;
	
	public Point3(int x, int y) {	// 생성자로 멤버 변수 초기화
		this.x = x;
		this.y = y;
	}

	// Object클래스의 toString()을 오버라이딩
	public String toString() {
		return "x : " + x + ", y : " + y;
	}
}

//class Point3D extends Point3{
//	int z;
//	
//	// 조상의 getLocation()을 오버라이딩
//	String getLocation() {
//		return "x : " + x + ", y : " + y + ", z : " + z;
//	}
//}
public class OverrideTest {
	public static void main(String[] args) {
		Point3 p = new Point3(3, 5);
//		p.x = 3;
//		p.y = 6;
		System.out.println(p);
		System.out.println(p.toString());
		System.out.println("p.x : " + p.x);
		System.out.println("p.y : " + p.y);
//		p.z = 9;
//		System.out.println(p.getLocation());
	}
}

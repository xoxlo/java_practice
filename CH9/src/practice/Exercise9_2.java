package practice;

public class Exercise9_2 {
	public static void main(String[] args) {
		Point3D p1 = new Point3D(1, 2, 3);
		Point3D p2 = new Point3D(1, 2, 3);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("p1 == p2 ? " + (p1 == p2));
		System.out.println("p1.equals(p2) ? " + (p1.equals(p2)));
	}
}

class Point3D {
	int x, y, z;
	
	Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	Point3D(){
		this(0, 0, 0);
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Point3D) // obj가 Point3D의 객체인지 체크
			return ((Point3D)obj).x == this.x && // x, y, z 비교. obj를 down casting 후
					((Point3D)obj).y == this.y && // 멤버변수를 가져오고 인스턴스 변수`와 비교
						((Point3D)obj).z == this.z; // 참이면 true, 거짓이면 false
		else
			return false;
			
	}
	
	public String toString() {
		return "[" + x + ", " + y + ", " + z + "]";
	}
}

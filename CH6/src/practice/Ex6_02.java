package practice;

public class Ex6_02 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channer값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channer값은 " + t2.channel + "입니다.");
		
		t1.channel = 7;
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		
		t2 = t1;	// 참조변수 t1의 값을 t2에 저장
		System.out.println("t1의 channer값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channer값은 " + t2.channel + "입니다.");
	}
}

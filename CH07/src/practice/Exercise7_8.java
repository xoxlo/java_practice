package practice;

class Outer5 {
	int value = 10;
	
	class Inner5 {
		int value = 20;
		void method1() {
			int value = 30;
			
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer5.this.value);
		}
	}	// Inner 클래스의 끝
}	// Outer 클래스의 끝
public class Exercise7_8 {
	public static void main(String[] args) {
		Outer5 o5 = new Outer5();
		Outer5.Inner5 inner = o5.new Inner5();
		inner.method1();
	}
}

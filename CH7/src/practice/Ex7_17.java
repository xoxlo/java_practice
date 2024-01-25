package practice;

public class Ex7_17 {
	Object iv = new Object() {	// 익명 클래스
		void method() {
			
		}
	};
	static Object cv = new Object() {	// 익명 클래스
		void method() {
			
		}
	};
	
	void myMethod() {
		Object lv = new Object() {	// 익명 클래스
			void method() {
				
			}
		};
	}
}

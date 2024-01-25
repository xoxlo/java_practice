package practice;

public class Ex7_13 {
	class InstanceInner {}
	static class StaticInner {}
	
	InstanceInner iv = new InstanceInner();		// 인스턴스멤버끼리는 직접 접근 가능
	static StaticInner cv = new StaticInner();	// static 멤버끼리는 직접 접근 가능
	
	static void staticMethod() {// static 멤버는 인스턴스 멤버에 직접 접근 불가
//		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
		
		// 굳이 접근하려면 아래와 같이 객체를 생성해야 한다
		// 인스턴스 클래스는 외부 클래스를 먼저 생성해야만 생성할 수 있다
		Ex7_13 outer = new Ex7_13();		// 인스턴스 메소드에서는 인스턴스 멤버와 static 멤버 모두 접근 가능
		InstanceInner obj1 = outer.new InstanceInner();
	}
	
	void instanceMethod() {
		// 인스턴스 메소드에서는 인스턴스 멤버와 static 멤버 모두 접근 가능하다
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
		// 메소드 내에 지역적으로 선언된 내부 클래스는 외부에서 접근할 수 없다
//		LocalInner lv = new LocalInner();
	}
	
	void myMethod() {
		class LocalInner {}
		LocalInner lv = new LocalInner();
		InstanceInner obj3 = new InstanceInner();
	}
}

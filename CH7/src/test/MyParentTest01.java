package test;

import practice.MyParent;

// import practice.MyParent;

class MyChild extends practice.MyParent { // 다른 패키지라 접근 불가능, 사용하려면 public 붙여야함
	public void printMembers() {
//		System.out.println(prv);
//		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
}

public class MyParentTest01 {
	public static void main(String[] args) {
		MyParent p = new MyParent();
//		System.out.println(p.prv); // 에러 
//		System.out.println(p.dft);
//		System.out.println(p.prt);
		System.out.println(p.pub);
	}
}

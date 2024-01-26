package practice;


class Outer4 {
	static class Inner4 {
		int iv = 200;
	}
}

public class Exercise7_7 {
	public static void main(String[] args) {
		Outer4.Inner4 in4 = new Outer4.Inner4();
		System.out.println(in4.iv);
	}
}

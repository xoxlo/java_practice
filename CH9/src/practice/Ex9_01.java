package practice;


public class Ex9_01 {
	public static void main(String[] args) {
		Value v1 = new Value(10); // ex) 0x1234
		Value v2 = new Value(10); // ex) 0x2345
		
		if (v1.equals(v2))
			System.out.println("v1과 v2는 같습니다");
		else
			System.out.println("v1과 v2는 다릅니다");
		
		// v1 == v2 ---> 0x1234 == 0x2345 ----> false
	}
}

class Value {
	int value;

	Value(int value) {
		this.value = value;
	}
}

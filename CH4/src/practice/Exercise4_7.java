package practice;

public class Exercise4_7 {
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		
		for (int i = 0; i < str.length(); i++) {
			sum += str.charAt(i) - '0'; // '0'을 뺴줘야함 (숫자로 나온다고 생각)
		}
		System.out.println("sum = " + sum);
	}
}

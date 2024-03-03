package practice;

public class Exercise6_18 {
	static boolean isNumber(String str) {
		boolean result = false;
		if (str == null || str.equals(""))
			return false;
		for(int i = 0; i < str.length(); i++) {
			if(48 <= str.charAt(i) && str.charAt(i) <= 57)
				result = true;
			else {
				result = false;
				break;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		String str = "123222";
		System.out.println(str + "는 숫자입니까 ? " + isNumber(str));
		
		str = "dd23s4";
		System.out.println(str + "는 숫자입니까 ? " + isNumber(str));
	}
}

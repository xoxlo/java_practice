package practice;

public class Exercise9_4 {
	
	public static boolean contains(String src, String target) {
		return src.indexOf(target, 0) == -1 ? false : true;  // src에 target이 있나 없나 체크
															// 없으면 false, 있으면 true를 반환
	}
	
	public static void main(String[] args) {
		System.out.println(contains("12345", "23"));
		System.out.println(contains("12345", "67"));
	}
}

package practice;

public class Ex9_11 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		System.out.println("sb == sb2 ? " + (sb == sb2));
		System.out.println("sb.equals(sb2) ? " + sb.equals(sb2));
		
		// StringBuffer의 내용을 String으로 변환한다
		String s = sb.toString(); // Strings s = new String(sb); 와 같음
		String s2 = sb2.toString();
		
		System.out.println("s.equals(sb2) ? " + s.equals(s2));
	}
}

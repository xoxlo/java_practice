package practice;

public class Exercise9_5 {
	public static String delChar(String src, String delCh) {
		StringBuffer sb = new StringBuffer(src.length()); // src의 길이 만큼 객체 buffer 생성
		for(int i = 0; i < src.length(); i++) {	// src 길이 만큼 반복
			char ch = src.charAt(i);			// src에서 i번째 문자를 가져와서 문자형 변수 ch에 저장
			if(delCh.indexOf(ch) == -1)			// 삭제해야되는 문자열(delCh)에 ch가 없다면
				sb.append(ch);					// buffer, sb에다가 ch 추가
		}
		return sb.toString();					// sb 문자열 형태로 반환
	}
	
	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)" + " -> "
								+ delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2 3 4 5)" + " -> "
								+ delChar("(1 2 3 4\t5)", " \t"));
	}
}

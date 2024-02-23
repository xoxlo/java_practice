package practice;

public class Exercise9_3 {
	public static int count(String src, String target) {
		int	count = 0;	// 찾은 횟수
		int pos = 0;	// 찾기 시작할 위치
		while(src.indexOf(target, pos) != -1) { // 반복문 조건에서 -1이라면 반복 안하고 바로 종료. 이 말은 문자열이 공백임.
			pos = src.indexOf(target, pos);		// src에 pos의 위치에서부터 target이 있나 체크. 일단 -1(일치하는게 없으면)이 아니면 계속 반복
			count++;							// pos의 위치를 저장
			pos+=target.length();				// pos에다가 target 길이만큼 플러스.
		}
		return count;	// 몇번 
	}
	
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB", "AB"));
		System.out.println(count("12345", "AB"));
	}
}

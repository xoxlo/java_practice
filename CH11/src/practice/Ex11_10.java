package practice;

import java.util.*;

public class Ex11_10 {
	public static void main(String[] args) {
		Set set = new HashSet();	// 순서X 중복X, HashSet 객체 생성
		
		for(int i = 0; set.size() < 6; i++) {	// 
			int num = (int)(Math.random() * 45) + 1; // 1~45 사이의 난수를 생성
			set.add(new Integer(num));				// 생성된 난수를 set에다가 저장
		}
		
		List list = new LinkedList(set);	// 정렬하기 위해 순서가있는 List 타입으로 LinkedList 인스턴스의 매개변수로 set을 넣어줌. // LinkedList(Collection c)
		Collections.sort(list);				// Collections클래스의 sort를 이용해서 순서대로 정렬// Collections.sort(List list)
		System.out.println(list);			// list 출력
	}
}

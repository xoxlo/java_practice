package practice;

import java.util.*;
import static java.util.Collections.*;

public class Ex11_19 {
	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list);
		
		addAll(list, 1,2,3,4,5);
		System.out.println(list);
		
		rotate(list, 2);	// 오른쪽으로 두 칸씩 이동
		System.out.println(list);
		
		swap(list, 0, 2);	// index 0과 index2를 교환(swap)
		System.out.println(list);
		
		shuffle(list);		// 저장된 요소의 위치를 임의로 변경
		System.out.println(list);
		
		sort(list, reverseOrder());	// 내림차순으로 정렬
		System.out.println(list);
		
		sort(list);					// 오름차순으로 정렬
		System.out.println(list);
		
		int idx = binarySearch(list, 3);	// list에서 3이라는 값이 몇번째 index에 있는지 검색
		System.out.println("index of 3 = " + idx);
		
		System.out.println("max = " + max(list));	// list의 요소들 중 max값
		System.out.println("min = " + min(list));	// list의 요소들 중 min값
		System.out.println("min = " + max(list, reverseOrder()));
		
		fill(list, 9);	// list의 요소들을 9로 채움
		System.out.println("list = " + list);
		
		List newList = nCopies(list.size(), 2);	// newList에다가 list의 사이즈 만큼 2로 복사
		System.out.println("newList = " + newList);
		
		System.out.println(disjoint(list, newList));	// list와 newList는 서로소(공통요소가 없으면)이면 true
		
		copy(list, newList);	// list에다가 newList의 값들을 복사
		System.out.println("newList = " + newList);
		System.out.println("list = " + list);
		
		replaceAll(list, 2, 1);	// list에서 2인 요소들을 모두 1로 변경
		System.out.println("list = " + list);
		
		Enumeration e = enumeration(list);
		ArrayList list2 = list(e);
		
		System.out.println("list2 = " + list2);
	}
}

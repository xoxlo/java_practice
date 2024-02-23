package practice;

import java.util.StringJoiner;

public class Ex9_09 {
	public static void main(String[] args) {
		String animals = "dog,cat,bear";
		String[] arr = animals.split(","); // animals 배열을 ,를 기준으로 자르면서 arr 배열에 넣는다
		
		System.out.println(String.join("-", arr)); // 배열 arr 간 문자열 사이사이에 -를 join시켜줌
		
		StringJoiner sj = new StringJoiner("/","[","]");
		// 문자열 사이 간에 / 를 넣고
		// 전체 문자열을 [ 과 ]로 감싼다
		
		for(String s : arr) // 배열 arr에 있는 각각 요소를 s에 넣으면서 그 s를 변수로 가진다. 마지막 인덱스까지 반복
			sj.add(s);		// sj에 s를 추가한다
		System.out.println(sj.toString()); // sj를 문자열로 반환
	}
}

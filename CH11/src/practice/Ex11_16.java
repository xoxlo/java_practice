package practice;

import java.util.*;

public class Ex11_16 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");	// OK. 이미 존재하는 키 추가기능. 기존 값이 없어짐                                                                   
		
		Scanner sc = new Scanner(System.in);	// 화면으부터 라인단위로 입력받는다
		
		while(true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.print("id : ");
			String id = sc.nextLine().trim();
			
			System.out.print("password : ");
			String password = sc.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			}
			
			if(!(map.get(id)).equals(password)) {
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
			} else {
				System.out.println("id와 비밀번호가 일치합니다.");
				break;
			}
		}
	}
}

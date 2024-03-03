package practice;

import java.util.*;

public class Ex12_02 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		HashMap<String, Student> map = new HashMap<>();
		
//		map.put("킹왕짱", new Student("킹왕", 1, 1, 50, 100, 100));
//		Student s = map.get("킹왕짱");
		 
		list.add(new Student("자바왕", 1, 1));
		list.add(new Student("자바짱", 1, 2));
		list.add(new Student("홍길동", 2, 1));
		
		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
//			Student s = (Student)it.next();	// 지네릭스를 사용하지 않으면 형변환 필요
			Student s = it.next();
			System.out.println(s.name);
		}
	}
}

class Student {
	String name = "";
	int ban;
	int no;
//	int kor;
//	int eng;
//	int math;
	
	Student(String name, int ban, int no) { //, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
	}
}
package practice;

import java.util.*;

class Student2 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor + math + eng;
	}
	
	float getAverage() {
		return (int)((getTotal() / 3f) * 10 + 0.5) / 10f;
	}
	
	public String toString() {
		return name
			+ ", " + ban
			+ ", " + no
			+ ", " + kor
			+ ", " + eng
			+ ", " + math
			+ ", " + getTotal()
			+ ", " + getAverage()
			;
	}
}

class BanNoAscending implements Comparator {
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Student2 && o2 instanceof Student2) {
			Student2 s1 = (Student2)o1;
			Student2 s2 = (Student2)o2;
			
			int result = s1.ban - s2.ban;
			
			if(result == 0) {
				return s1.no - s2.no;
			}
			return result;
			
//			return s1.ban == s2.ban ? s1.no - s2.no : s1.ban - s2.ban;
		}
		return -1;
	}
}

public class Exercise11_04 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student2("이자바", 2, 1, 70, 90, 70));
		list.add(new Student2("안자바", 2, 2, 60, 100, 80));
		list.add(new Student2("홍길동", 1, 3, 100, 100, 100));
		list.add(new Student2("남궁성", 1, 1, 90, 70, 80));
		list.add(new Student2("김자바", 1, 2, 80, 80, 90));
		
		Collections.sort(list, new BanNoAscending());
		Iterator it = list.iterator();
		
		while (it.hasNext())
			System.out.println(it.next());
	}
}

package practice;

public class Exercise6_02 {
	public static void main(String[] args) {
		Student_2 s = new Student_2("홍길동", 1, 1, 100, 60, 76);
		
		String str = s.info();
		System.out.println(str);
	}
}

class Student_2 {
	String name; 	// 학생이름
	int ban;		// 반
	int no;			// 번호
	int kor;		// 국어점수
	int eng;		// 영어점수
	int math;		// 수학점수
	
	Student_2 (String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	String info() {
		return name+","+ban+","+no+","+kor+","+eng+","+math+","+(kor+eng+math)+","+((int)((kor+eng+math)/3f * 10 + 0.5f)/10f);
	}
	
}

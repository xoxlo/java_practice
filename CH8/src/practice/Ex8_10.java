package practice;

import java.io.*;

public class Ex8_10 {
	public static void main(String[] args) {
		try {
			File f = createFile(args[0]);
			System.out.println(f.getName() + " 파일이 성공적으로 생성되었습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " 다시 입력해 주시기 바랍니다");
		}
	}	// main 메소드 끝
	
	static File createFile(String fileName) { // throws Exception {
		try {
			if (fileName == null || fileName.equals(""))
				throw new Exception("파일이름이 유호하지 않습니다");
		} catch (Exception e) {
			fileName = "제목없음.txt";
		}
		
//		if (fileName == null || fileName.equals(""))
//			throw new Exception("파일이름이 유호하지 않습니다");
		
		File f = new File(fileName);	// File클래스의 객체를 만든다
		// File객체의 crewateNewFile메소드를 이용해서 실제 파일을 생성한다
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;		// 생성된 객체의 참조를 반환한다
	}	// createFile메소드의 끝
} // 클래스의 끝

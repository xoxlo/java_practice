package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise8_7 {
	public static void main(String[] args) {
		// 1~100 사이의 임의의 값을 얻어서 answer에 저장한다
		int answer = (int)(Math.random()*100) + 1;
		int input = 0; // 사용자 입력 공간
		int count = 0; // 시도횟수 저장 공간
		
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 : ");
			try {	// 예외가 발생할 수 있는 문장 입력
				input = new Scanner(System.in).nextInt(); // 숫자 입력
			} catch (InputMismatchException e) { // 맞는 예외 발생 시 catch 블럭 실행
				System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요.");
				continue; // 반복문의 처음으로 돌아감
			} catch (Exception e){
				System.out.println("알 수 없는 오류 발생");
			}
			if( answer > input)
				System.out.println("더 큰 수를 입력하세요.");
			else if( answer < input)
				System.out.println("더 작은 수를 입력하세요.");
			else {
				System.out.println("맞췄습니다.");
				System.out.println("시도 횟수는 " + count + "번입니다.");
				break; // 반복문 탈출
			}
		} while (true); // 계속 반복
	}
}

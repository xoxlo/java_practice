package practice;
import java.util.Scanner;

public class Exercise4_10 {
	public static void main(String[] args) {
		// 1~100사이의 임의 값을 얻어서 answer에 저장한다.
		int answer = (int)(Math.random() * 100 + 1);
		int input = 0;		// 사용자입력을 저장할 공간
		int count = 0;		// 시도횟수를 세기위한 변수
		
		// 화면으로 부터 사용자입력을 받기 위해서 Scanner 클래스 사용
		Scanner sc = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 : ");
			input = sc.nextInt(); // 입력받은 값을 변수 input에 저장한다.
			if(answer > input)
				System.out.println("더 큰 수를 입력하세요.");
			else if(answer < input)
				System.out.println("더 작은 수를 입력하세요.");
			else {
				System.out.println("맞혔습니다.");
				System.out.println("시도횟수는 " + count + "번입니다");
				break;
			}
		}while(true);
	}
}

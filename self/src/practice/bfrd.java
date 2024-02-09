package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bfrd {

	public static void main(String[] args) throws IOException {	// BufferedReader 사용하기 위해서는 예외 IOException을 던져줘야함 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine()); // BufferedReader는 문자열만 입력 받기 때문에 Integer...을 이용해서 형변환 후 입력
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		bw.write("int형 String으로 변환 출력 : ");
		for(int i = 0; i < n; i++) {
			bw.write(String.valueOf(arr[i])); // 버퍼에 담고 출력
			bw.write(" ");
		}
		bw.flush(); // 버퍼에 담은 값을 출력함과 도시에 비워주는 역할
		bw.close();
	}

}

// Stream ? (단방향 통신)
// Byte 형태로 데이터를 운ㄴ반하는데 사용되는 연결통로
// 하나의 스트림으로 입력과 출력을 동시에 처리 할 수 없다
// 큐(Queue)와 FIFO(First In First Out)구조

// Buffer ?
// 버퍼는 고정값이 아니라 가변적인 값을 받음
// 입력받은 값은 버퍼에 저장해두었다가 버퍼가 가득차거나
// 개행 문자가 나타나면 버퍼의 내용을 한 번에 전송하게 된다


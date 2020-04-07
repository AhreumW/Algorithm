package beakjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class no10773_2 {
	public static void main(String[] args) throws IOException {
		//백준 10773번 - 제로
		//10773_1에서 출력만 버퍼로 바꿔 사용

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
//		int k = br.read(); 	//입력받을값이 int일때
		int k = Integer.parseInt(br.readLine()); //int값+엔터 까지 입력받을때
		/* input */ 
		
		Stack<Integer> stack = new Stack<Integer>();

		int num = 0;	//첫번째 이후 입력숫자
		//주어지는 정수 k
		for(int i = 0; i<k ; i++) {
			num = Integer.parseInt(br.readLine());
			
			if(num==0 && !stack.empty()) {
				stack.pop();
			}else {
				stack.push(num);
			}
		}
		
		int sum = 0;
		while (!stack.empty()) {
			sum = sum + stack.pop();
		}
//		System.out.println(sum);
		out.write(sum+"\n"); //출력버퍼 출력
		out.close();
	}
}

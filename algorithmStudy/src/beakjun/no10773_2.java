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
		/*입력
		4
		3
		0
		4
		0
		
		출력 
		0 */
		//10773_1에서 출력만 버퍼로 바꿔 사용

		//인풋버퍼
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//출력버퍼
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//처음 숫자는 몇번 입력할 것인지에 대한 입력횟수값 = k
		int k = Integer.parseInt(br.readLine());  //int값 + 엔터키 까지 입력받을때
		
		Stack<Integer> stack = new Stack<Integer>();

		int num = 0;	//첫번째 이후 입력숫자
		//주어지는 정수 k
		//k 수만큼 입력값을 받음
		for(int i = 0; i<k ; i++) {
			num = Integer.parseInt(br.readLine());	//int값 + 엔터키 까지 입력받을때
			
			//스택이 비어있지 않고 0을 입력하면
			//pop시킨다.(입력을 지움)
			if(num==0 && !stack.empty()) {
				stack.pop();
			}else {
				//그게 아니라면 스택에 값 저장
				stack.push(num);
			}
		}
		
		int sum = 0; //총 합 
		
		//스택이 비어있지 않다면
		//스택값들을 모두 더해서 총합을 구한다.
		while (!stack.empty()) {
			sum = sum + stack.pop();
		}

		out.write(sum+"\n"); //출력버퍼 출력
		out.close();	//버퍼는 닫아야함~
	}
}

package beakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class no10773_1 {
	public static void main(String[] args) throws IOException {
		//백준 10773번 - 제로
		//입력
		/*첫 번째 줄에 정수 K가 주어진다. (1 ≤ K ≤ 100,000)
		이후 K개의 줄에 정수가 1개씩 주어진다. 정수는 0에서 1,000,000 사이의 값을 가지며, 정수가 "0" 일 경우에는 가장 최근에 쓴 수를 지우고, 아닐 경우 해당 수를 쓴다.
		정수가 "0"일 경우에 지울 수 있는 수가 있음을 보장할 수 있다.*/
		//출력
		/*재민이가 최종적으로 적어 낸 수의 합을 출력한다. 최종적으로 적어낸 수의 합은 231-1보다 작거나 같은 정수이다.*/
		
		/*입력
			4
			3
			0
			4
			0
			
			출력 
			0 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
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
		
		System.out.println(sum);
	}
}

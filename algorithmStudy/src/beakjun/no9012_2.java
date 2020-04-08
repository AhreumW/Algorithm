package beakjun;

import java.util.Scanner;
import java.util.Stack;

public class no9012_2 {
	// 백준 9012번 - 괄호
	/*
			입력
			입력 데이터는 표준 입력을 사용한다. 입력은 T개의 테스트 데이터로 주어진다. 
			입력의 첫 번째 줄에는 입력 데이터의 수를 나타내는 정수 T가 주어진다. 
			각 테스트 데이터의 첫째 줄에는 괄호 문자열이 한 줄에 주어진다. 
			하나의 괄호 문자열의 길이는 2 이상 50 이하이다. 
			출력
			출력은 표준 출력을 사용한다. 만일 입력 괄호 문자열이 올바른 괄호 문자열(VPS)이면 “YES”, 
			아니면 “NO”를 한 줄에 하나씩 차례대로 출력해야 한다. 
	*/		
	public static void main(String[] args) throws Exception {
		//입력
		Scanner scan = new Scanner(System.in);
		
		//첫번째줄 숫자는 괄호문자열의 개수 
		int repeat = Integer.parseInt(scan.next());
		
		//괄호 문자열 개수 
		for (int j = 0; j < repeat; j++) {
			//문자열 한 줄
			String input = scan.next();
			
			String res = "YES";		//결과값
			
			Stack stack = new Stack<>();
			
			//한 줄의 문자열에서 한 문자씩 쪼갬
			for (int i = 0; i < input.length(); i++) {
				//여는괄호가 들어오면 1을 스택에 집어넣음
				if (input.charAt(i) == '(') {
					stack.push(1);
				} else if (input.charAt(i) == ')') {
					//닫는 괄호가 들어오면 pop
					//단, 스택이 비어있으면 다 닫히지 않은 것이므로 NO 결과값.
					if (stack.isEmpty()) {
						res = "NO";
						break;
					} else {
						stack.pop();
					}
				}
			}
			//여는 괄호는 푸쉬, 닫는 괄호는 팝해서 개수가 맞으면 
			//스택은 비어있을 것이다.
			//비어있지않다면 결과값은 NO
			if(!stack.isEmpty()) {
				res = "NO";
			}
			
			//괄호 문자열당 결과값 출력
			System.out.println(res);
		}


	}

}

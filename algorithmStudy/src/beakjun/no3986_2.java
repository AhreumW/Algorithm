package beakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class no3986_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 백준 3986 - 좋은 단어
		
		//첫째 줄에 좋은 단어의 수를 출력한다.
		/*	입력
			3
			ABAB
			AABB
			ABBA
			출력
			2*/
		
/*		1. 스택에 알파벳을 넣는다. (push)
		2. 스택의 맨 위에 있는 알파벳과 넣을 알파벳이 같다면 뺀다. (pop)
		위의 처리가 올바르게 된다면 좋은 단어이다.
		그렇다면, 처리가 되지 않는다면 좋은 단어가 아니라는 것을 알 수 있다. */

		//입력버퍼
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//단어를 몇 개 입력할 것인지
		int n = Integer.parseInt(br.readLine());
		
		//출력 = 좋은 단어의 개수
		int result =0;
		
		//문자열(단어) n개만큼 반복
		for(int i =0; i<n; i++) {
		
			//스택생성
			Stack<Character> stack = new Stack<Character>();
			
			String str = br.readLine();
			
			//단어(문자열)의 한 문자씩 쪼갬
			for(int j=0; j<str.length(); j++) {
				//1. 스택이 비어있지 않고
				//2. 스택의 최상위값(바로이전문자)과 str의 j번째 문자가  같으면 
				//3. pop한다. 
				if(!stack.empty() && stack.peek() == str.charAt(j)) {
					stack.pop();
				}else {
					//그게 아니라면 스택에 넣는다. 
					stack.push(str.charAt(j));
				}
				
			}
			
			//좋은 단어 확인
			//스택이 비어있다면 좋은 단어
			if(stack.empty()) {	
				result++;
//				System.out.println(result);
			}
			
		}
		
		//result의 개수가 좋은 단어의 수 
		System.out.println(result);
		
	}

}

package beakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class no3986 {

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

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//몇개 입력할 것인지
		int n = Integer.parseInt(br.readLine());
		
		//출력 - 개수
		int result =0;
		
		System.out.println(n);
		//문자열 n개만큼 반복
		for(int i =0; i<n; i++) {
		
			//스택생성
			Stack<Character> stack = new Stack<Character>();
			
			String str = br.readLine();
			for(int j=0; j<str.length(); j++) {
				char temp = str.charAt(j); 	//한글자씩
				
				char preTemp = 0; //전 글자		
				if(j>=1) {
					preTemp = str.charAt(j-1); 	//전 글자					
				}else {
					preTemp = '0';	//절대 아닌값
				}

				stack.push(temp);//스택에 저장
				
				if(temp == preTemp) {
					System.out.println("temp : " + temp);
					System.out.println("preTemp : "+ preTemp);
					System.out.println("pop");
					stack.pop();
				}
				
			}
			//좋은 단어 확인
			if(stack.empty()) {	//비었으면 좋은단어
				result++;
				System.out.println(result);
			}
			
		}
		
		
		System.out.println(result);
		
	}

}

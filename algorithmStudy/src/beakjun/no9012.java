package beakjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class no9012 {

	public static void main(String[] args) throws Exception {
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
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Stack<Character> stack = new Stack<Character>();
		
		//입력 괄호문자열 개수 
		int k = Integer.parseInt(br.readLine());
		
		//문자열 k수만큼 받음.
		String[] str = new String[k];
		
		for(int i =0; i<k; i++) {
			str[i] = br.readLine();
		}
		
		boolean vps = true;	//완벽한 ()문인지 판단
		char temp = 0;
		String[] result = new String[k];	//결과 저장 배열
		for(int i =0; i<k; i++) {
			//문자열 길이만큼해서 charAt
			for(int j = 0; j<str[i].length(); j++) {
				temp = str[i].charAt(j);				
				
				if(temp == '(') {
					System.out.println(temp);
					stack.push(temp);
				}else {
					System.out.println(temp);
					//pop하기 전 비어있으면 나감 ()( 이런경우 vps = false
					if(stack.empty()) {
						vps = false;
						break;
					}
					
					stack.pop();
				}
			}
			
			//vps잘 닫히고 빈경우
			if(vps && stack.empty()) {
				 sb.append("YES \n");
			}else {
				 sb.append("NO \n");
			}
			
		}
		
		//출력
		 System.out.println(sb.toString());
	}

}

package beakjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class no4949 {

	public static void main(String[] args) throws IOException {
		// 백준 4949 - 균형잡힌 세상
/*		문자열에 포함되는 괄호는 소괄호("()") 와 대괄호("[]")로 2종류이고, 문자열이 균형을 이루는 조건은 아래와 같다.

		- 모든 왼쪽 소괄호("(")는 오른쪽 소괄호(")")와만 짝을 이뤄야 한다.
		- 모든 왼쪽 대괄호("[")는 오른쪽 대괄호("]")와만 짝을 이뤄야 한다.
		- 모든 오른쪽 괄호들은 자신과 짝을 이룰 수 있는 왼쪽 괄호가 존재한다.
		- 모든 괄호들의 짝은 1:1 매칭만 가능하다. 즉, 괄호 하나가 둘 이상의 괄호와 짝지어지지 않는다.
		- 짝을 이루는 두 괄호가 있을 때, 그 사이에 있는 문자열도 균형이 잡혀야 한다.
		
		입력
		하나 또는 여러줄에 걸쳐서 문자열이 주어진다. 
		각 문자열은 영문 알파벳, 공백, 소괄호("( )") 대괄호("[ ]")등으로 이루어져 있으며, 길이는 100글자보다 작거나 같다.
		입력의 종료조건으로 맨 마지막에 점 하나(".")가 들어온다.
		
		출력
		각 줄마다 해당 문자열이 균형을 이루고 있으면 "yes"를, 아니면 "no"를 출력한다.
*/
		//입력버퍼
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int input_len, i; 
		Stack<Character> stack = new Stack<Character>(); 
		char t; 
		
		//문자열 읽음
		String input = br.readLine(); 
		
		//입력이 .이 아니라면 계속 반복 
		//아나라(마)바. 혹은 띄어쓰기. 가 아니라
		//마침표 딱 하나 있는 경우 종료
		while(!input.equals(".")) { 
			
			//스택을 비워준다. 
			stack.clear(); 	
			
			//문자열 길이만큼 문자하나하나 쪼개 보기
			for(i = 0; i < input.length(); i++) { 
				//문자 하나
				t = input.charAt(i); 
				
				//문자가 여는 괄호라면 
				//스택에 push
				if(t == '(' || t == '[') { 
					stack.push(t); 
				}else if(t == ')' || t == ']') { 
					//1. 문자가 닫는 괄호인데
					
					//스택이 비어있거나 -> 이 조건은 없어도 되지 않나????
					//문자가 )인데 직전스택top값이 (이 아니라면
					//문자가 ]인데 직전스택top값이 [이 아니라면	
					//push - 짝꿍이 안맞으니까 또 넣음
					if(stack.isEmpty() || (t == ')' && stack.peek() != '(') 
							|| (t == ']' && stack.peek() != '[')) { 
						stack.push(t); 
						break; 
					} 
					//아니라면(짝이 맞다면) pop
					stack.pop(); 
				} 
			} 
			
			//스택이 비어있다면 짝이 다 맞으므로 YES
			if(stack.isEmpty()) { 
				System.out.println("yes"); 
			} else {
				//아니면 NO
				System.out.println("no");
			} 
			
			//반복입력.
			input = br.readLine();
		}

		
	}

}

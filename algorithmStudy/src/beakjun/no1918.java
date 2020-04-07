package beakjun;

import java.util.Scanner;
import java.util.Stack;

public class no1918 {

	public static void main(String[] args) {
		// 1918번 후위 표기식
		// 중위 표기식이 주어졌을 때 후위 표기식으로 고치는 프로그램을 작성하시오
		
		/* 첫째 줄에 중위 표기식이 주어진다. 
		단 이 수식의 피연산자는 A~Z의 문자로 이루어지며 수식에서 한 번씩만 등장한다. 
		그리고 -A+B와 같이 -가 가장 앞에 오거나 AB와 같이 *가 생략되는 
		등의 수식은 주어지지 않는다. 
		표기식은 알파벳 대문자와 +, -, *, /, (, )로만 이루어져 있으며, 
		길이는 100을 넘지 않는다. */
		
		//예제 입력  A*(B+C)
		//출력 ABC+*
		
		
		Stack<Character> stack = new Stack<Character>();
		
		Scanner scan = new Scanner(System.in);
		
		String input  = "";
		input = scan.nextLine();
		
		String str  = "";
		char temp = 0;
		for(int i =0; i<input.length(); i++) {
			
			temp = input.charAt(i);
			
			if(temp == '+' || temp == '-' ||temp == '*' ||temp == '/' ) {
				stack.push(temp);		
			}else if(temp == '(' || temp == ')'){
				
			}else{
				str = str + Character.toString(temp);
			}
		}
		
		for(int i = str.length()-1; i>=0; i--) {
			temp = str.charAt(i);
			stack.push(temp);
		}
		
		for(int i = 0; i<5; i++) {
			System.out.print(stack.pop());
		}
		
	}

}

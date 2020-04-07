package beakjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class no1918_2{
    public static StringBuilder infix = new StringBuilder(); //출력버퍼
    public static Stack<Character> stk = new Stack<>(); //연산자 처리용 스택
    public static void main(String args[]) throws Exception {
    	
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String postfix = in.readLine();
    	int i, len = postfix.length();
    	char ch;
    	
    	for(i=0;i<len;i++){
    	    ch = postfix.charAt(i);
    	    if(ch == '+' || ch=='-' || ch=='*' || ch=='/') operator(ch);
    	    else if(ch=='(') stk.push(ch);
    	    else if(ch==')') closeParenthese();
    	    else infix.append(ch);
    	}
        //마지막으로 스택에 남은 연산자들 전부 뽑아서 출력버퍼에 추가
       	while(!stk.isEmpty()) infix.append(stk.pop());
    	out.write(infix.toString()); //출력버퍼 출력
    	out.close();
    	in.close();
    }
    //닫는 괄호 만나면 여는 괄호 만날때까지 pop()해서 출력버퍼에 추가
    private static void closeParenthese(){
    	while(true){
    	    char ch = stk.pop();
    	    if(ch=='(') break;
    	    else infix.append(ch);
    	}
    }
    //연산자가 들어온 경우 처리
    private static void operator(char op){
    	while(true){
            //순서대로 스택이 empty, top이 (, 우선순위 이번연산자 > top인 경우 
    	    if(stk.isEmpty()||stk.peek()=='('||((op=='*' || op=='/')&&(stk.peek()=='+'||stk.peek()=='-'))){
        		stk.push(op); //스택에 push()
        		break;
    	    }
            //아니라면 위의 조건이 될 때가지 pop()하며 출력버퍼에 저장
    	    else infix.append(stk.pop());
    	}
    }
}
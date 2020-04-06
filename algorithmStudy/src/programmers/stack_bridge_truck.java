package programmers;

import java.util.EmptyStackException;
import java.util.Stack;

public class stack_bridge_truck {

	public static void main(String[] args) {
		//변수
		int bridge_length = 2;
		int weight =10;
		int[] truck_weights = {7,4,5,6};
		
		Stack<Integer> stack = new Stack<Integer>();
		
		
		//스택의 길이와 다리가 견디는무게 만큼만 트럭이 올라감 
		
		/*	//예시
		bridge_length	weight	truck_weights	return
				2		10		[7,4,5,6]			8
				100		100		[10]				101
				100		100		[10,10,10,10,10,10,10,10,10,10]	110
		*/
		
		int total_weight = 0;	//다리 위 트럭의 총무게
		int count = 0; 			//초시간		//푸쉬 팝 될때마다 count++;
		
		//다리 길이는 스택의 길이
//		for(int i =0; i<bridge_length; i++) {
//			
//			//다리위총무게 보다 다리가견디는 무게가 작어야함
//			if(total_weight <= weight) {
//				//스택의 길이만큼만 트럭이 올라감 
//				for(int j = 0; j<truck_weights.length; j++) {
//					stack.push(j);
//					count++;
//					total_weight = total_weight + truck_weights[j];
//				}
//			}else if(total_weight > weight) {
//				//무게가 너무 무거우면 팝
//				stack.pop();
//			}
//		}

		//순서가 바뀌어야하나
		//트럭들
		for(int j = 0; j<truck_weights.length; j++) {
			//다리위총무게 보다 다리가견디는 무게가 작어야함
			if(total_weight <= weight) {
				
				//다리 길이는 스택의 길이
				for(int i =0; i<bridge_length; i++) {
					stack.push(j);
					System.out.println("push"+stack.peek());
					count++;
					total_weight = total_weight + truck_weights[j];
				}
				
			}else if(total_weight > weight) {
				
				try{
					total_weight = total_weight - stack.peek();
					//무게가 너무 무거우면 팝
					stack.pop();
					System.out.println("pop"+stack.peek());
					count++;
					
				}catch (EmptyStackException e) {
					System.out.println("끝");
				}
				
			}
		}
		
		
		int answer = 0;	//리턴값
		System.out.println(count); 		//count가 answer값
	}

}

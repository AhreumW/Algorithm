package mailprogramming;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CoTe_0422_2020_2 {

	public static void main(String[] args) throws IOException {
		/*
		 * 	정수 배열과 타겟 숫자가 주어지면, 합이 타겟값이 되는 두 원소의 인덱스를 찾으시오.
			단, 시간복잡도 O(n) 여야 합니다.

			예제)
			Input: [2, 5, 6, 1, 10], 타겟 8
			Output: [0, 2] // 배열[0] + 배열[2] = 8
		 */
		
		//답지
		//	input 배열에서 
		// [타겟숫자 - i번재값]이 input배열에 존재할 때 
		// hashMap에  
		// key & value  =  i & (타겟숫자 - i번재값)의 인덱스 값 

		int target = 8;
		int[] intArr = {2, 5, 6, 1, 10};
		System.out.println("Input: "+intArr);
		
		Map<Integer, Integer> hMap = new HashMap<Integer, Integer>();
		
		for(int i=0; i<intArr.length; i++) {
			
			int checkNum = target - intArr[i];
			for(int j=0; j<intArr.length-1; j++) {
				if(checkNum == intArr[j]) {
					
				}
			}
			
		}
		
	}

}

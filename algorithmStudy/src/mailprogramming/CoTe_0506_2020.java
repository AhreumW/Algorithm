<<<<<<< HEAD
import java.sql.Array;
=======
package mailprogramming;
>>>>>>> branch 'master' of https://github.com/AhreumW/Algorithm.git

public class CoTe_0506_2020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		정수 배열(int array)이 주어지면 0이 아닌 정수 순서를 유지하며 모든 0을 배열 오른쪽 끝으로 옮기시오. 
//		단, 시간복잡도는 O(n), 공간복잡도는 O(1)여야 합니다.
//
//		예제)
//		Input: [0, 5, 0, 3, -1]
//		Output: [5, 3, -1, 0, 0]
//
//		Input: [3, 0, 3]
//		﻿Output: [3, 3, 0]
		
<<<<<<< HEAD
		int[] inputArr = {0, 5, 0, 3, -1};
	
		for(int i=0; i<inputArr.length; i++) {
			
			if(inputArr[i] == 0) {
=======
		int[] inputArr = {0, 5, 0, 3, -1};		
//		int[] inputArr = {3, 3, 0};		
		
		for(int i=0; i<inputArr.length; i++) {
			if(inputArr[i] == 0) {
				int temp = inputArr[i];
				for(int j=i; j<inputArr.length-1; j++) {
					int moveNum = inputArr[j+1];
					inputArr[j] = moveNum;
				}
				inputArr[inputArr.length-1] = temp;
			}
		}
>>>>>>> branch 'master' of https://github.com/AhreumW/Algorithm.git
				
<<<<<<< HEAD
				for(int j=i; j<inputArr.length-1; j++) {
					int temp = inputArr[j];
					inputArr[j+1] = inputArr[j];
					inputArr[inputArr.length-1] = temp; 	
				}
				
			}
		}
		
		for(int i=0; i<inputArr.length; i++) {
			System.out.println(inputArr[i]);
		}
				
=======
		for(int i=0; i<inputArr.length; i++) {			
			System.out.println(inputArr[i]);
		}
>>>>>>> branch 'master' of https://github.com/AhreumW/Algorithm.git
	}

}

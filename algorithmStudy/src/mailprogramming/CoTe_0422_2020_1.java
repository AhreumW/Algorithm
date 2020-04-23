package mailprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CoTe_0422_2020_1 {

	public static void main(String[] args) throws IOException {
		/*
		 * 	정수 배열과 타겟 숫자가 주어지면, 합이 타겟값이 되는 두 원소의 인덱스를 찾으시오.
			단, 시간복잡도 O(n) 여야 합니다.

			예제)
			Input: [2, 5, 6, 1, 10], 타겟 8
			Output: [0, 2] // 배열[0] + 배열[2] = 8
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Input: ");
		String inputStr = br.readLine();
		
		String[] inputArr = inputStr.split(", ");
		for(int i =0; i<inputArr.length-1; i++) {
			
			for(int j=0; j<i; j++) {
				int num1 = Integer.parseInt(inputArr[i]);
				int num2 = Integer.parseInt(inputArr[j]);
				
				if(num1 + num2 == 8) {
					System.out.println("Output: [" + i + ", " + j +"]");
					//break;
				}
			}
			
		}
		
	}

}

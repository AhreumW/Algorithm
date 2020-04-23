package mailprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class CoTe_0419_2020_2 {

	public static void main(String[] args) {
		/*
		 * 	정수(int)가 주어지면, 팰린드롬(palindrome)인지 알아내시오. 
		 * 	팰린드롬이란, 앞에서부터 읽으나 뒤에서부터 읽으나 같은 단어를 말합니다. 단, 정수를 문자열로 바꾸면 안됩니다.
			
			예제)
			Input: 12345
			Output: False
			
			Input: -101
			Output: False
			
			Input: 11111
			Output: True
			
			Input: 12421
			﻿Output: True
		 */
		
		//답지 
		//숫자입력값을 나누기 10 했을 때 나머지로 1글자씩 뽑아내 줄 수 있다~!!! 와....
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input: ");
		int inputNum = scan.nextInt();
		scan.close();
		
		
		System.out.print("\nOutput:");
		
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		int divideNum = inputNum;
		while(divideNum != 0) {
			//System.out.println("divideNum"+divideNum);
			
			int temp = divideNum % 10;
			//System.out.println(temp);
			numList.add(temp);
			
			divideNum = divideNum / 10;
			//System.out.println("divideNum"+divideNum);
		}
		
		ArrayList<Integer> reverseNumList = new ArrayList<Integer>();
		for(int i = numList.size()-1; i >= 0; i--) {
			reverseNumList.add(numList.get(i));
		}
		
		String outputStr = "";
		for(int i = 0; i < numList.size(); i++) {
			
			if(numList.get(i) == reverseNumList.get(i) && inputNum >= 0) {
				outputStr = "true";
			}else {
				outputStr = "false";
			}
		}
		
		System.out.print(outputStr);
		
	}

}

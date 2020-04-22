package mailprogramming;

import java.util.Scanner;

public class CoddingTest_0419_2020_1 {

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
		
		//문자열로 안 바꾸고 어떻게 하지???
		//문자열 방식 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input: ");
		int inputNum = scan.nextInt();
		scan.close();
		
		String inputStr = Integer.toString(inputNum);
		
		System.out.print("\nOutput:");
		//System.out.println(inputStr.length()/2);
		
		boolean check = true;
		
		while(check) {
			for(int i =0; i<inputStr.length()/2; i++) {
				String frontChar = Character.toString(inputStr.charAt(i));
				//System.out.println(frontChar);
				String backChar = Character.toString(inputStr.charAt(inputStr.length()-1-i));
				//System.out.println(backChar);
				
				if(frontChar.equals(backChar)) {
					check = true;
				}else {
					check = false;
					break;
				}
				
			}
		}
		
		if(check == true) {
			System.out.println(check);
		}else{
			System.out.println(check);
		}
		
		
	}

}

package array;

import java.util.Scanner;

public class studygroup0414_3 {
	public static void main(String[] args) {
	/*
		3번문제
		사용자로부터 최대 10개의 단어를 입력받아 정렬하는 프로그램을 작성하세요. 
		사전식 순서로 작은 단어가 앞에 와야 합니다. 단,각각의 단어는 15글자를 넘지 않는다고 가정합니다. 
		(+가정 : 같은 글자로 시작하는 단어는 없다)
		실행결과----
		입력을 종료하려면 그냥 엔터를 누르세요
		1번째? black
		2번째? apple
		3번째? car
		4번째? jump
		5번째? <enter>
		apple black car jump
	*/
		
		String[] inputStrArr = new String[10];
		Scanner scan = new Scanner(System.in);
		
		//입력
		for(int i =0; i<10; i++) {
			
			System.out.print((i+1)+"번째? ");
			String temp = scan.nextLine();
			
			if(temp.length() == 0) {
				break;
			}else {
				inputStrArr[i] = temp;
			}
		}
		
		
		
		String[] alphabetArr = new String[26];
		//알파벳 순서대로 저장 
		for(int i =0; i<inputStrArr.length; i++) {
			
			if(inputStrArr[i] != null) {
				
				//앞 한 글자씩 비교
				char temp = inputStrArr[i].charAt(0);
				
				//알파벳순서에 맞는 배열 위치에 넣어준다. 
				for(int j=0; j<26; j++) {
					//아스키코드 - A : 65, a : 97
					if(temp == (char)(65+j) || temp == (char)(97+j)) {
						alphabetArr[j] = inputStrArr[i];
					}
				}
			}
			
		}
		
		
		//출력
		for(int i =0; i<alphabetArr.length; i++) {
			
			if(alphabetArr[i] != null) {
				System.out.print(alphabetArr[i] + " ");
			}
			
		}
		
		
	}
}

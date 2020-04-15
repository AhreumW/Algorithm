package array;

import java.util.Scanner;

public class studygroup0414_4 {
	public static void main(String[] args) {
		/*
		4번문제
		사용자로부터 단어 하나를 입력받은뒤,
		그 문자열 내에 A부터 Z까지의 알파벳
		이 각각 몇개씩 등장하는지 세어 출력
		하는 프로그램을 작성하세요. 대소문자
		를 같이 처리하고, 등장하지 않는 알파
		벳은 출력하지 않게 합니다. 알파벳
		이외의 문자는 무시합니다.
		실행결과
		단어를 입력하세요 : superCalifragilisticexpialidocious
	*/			
		Scanner scan = new Scanner(System.in);

		System.out.print("단어를 입력하세요 : ");
		String inputStr = scan.nextLine();
		
		//입력한 단어의 글자수만큼 문자배열 생성
		char[] inputStrArr = new char[inputStr.length()];	
		//26개의 알파벳 개수를 저장
		int[] alphabetArr = new int[26];
		
		for(int i =0; i<inputStr.length(); i++) {
			//한 글자씩 저장 
			inputStrArr[i] = inputStr.charAt(i);
			
			//알파벳순서에 맞는 배열 위치에 넣어준다. 
			for(int j=0; j<26; j++) {
				//아스키코드 - A : 65, a : 97
				if(inputStrArr[i] == (char)(65+j) || inputStrArr[i] == (char)(97+j)) {
					alphabetArr[j] = alphabetArr[j]+1;
				}
			}
		}
		
		
		//출력
		for(int i =0; i<alphabetArr.length; i++) {
			
			char alphabet = (char)(97+i);	//출력용 알파벳
			
			//개수가 0개면 출력하지 않음 
			if(alphabetArr[i] != 0) {
				System.out.println( alphabet + " : " + alphabetArr[i] + "개");
			}
		}
		
		
	}
	
}

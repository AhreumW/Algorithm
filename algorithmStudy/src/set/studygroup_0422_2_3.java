package set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class studygroup_0422_2_3 {
	//백준 14425번
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//버퍼 써보자 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		Scanner scan = new Scanner(System.in);
		
		//첫번째 숫자
		int fint = scan.nextInt();
		//두번째 숫자
		int sint = scan.nextInt();
		
		
		Set<String> hashA = new HashSet<String>();
		Set<String> hashB = new HashSet<String>();
		
		
		for(int i= 0; i<fint; i++) {
			hashA.add(scan.next());
		}
		
		for(int i= 0; i<sint; i++) {
			hashB.add(scan.next());
		}
		
		System.out.println(hashA);
		System.out.println(hashB);
		
		hashA.retainAll(hashB);
		
		
		System.out.println(hashA.size());
		

		
		
	}
}

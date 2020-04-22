package set;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class studygroup_0422_2_1 {
	//백준 14425번
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//다른 사람 코드 
		//버퍼 사용
		//참신하게 또 뺏어
		
		//인풋버퍼
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputStr = br.readLine().split(" ");
	      
	      int n = Integer.parseInt(inputStr[0]);
	      int m = Integer.parseInt(inputStr[1]);
	      
	      HashSet<String> setA = new HashSet<String>();
	      
	      for (int i = 0; i < n; i++) {
	         setA.add(br.readLine());
	      }
	      
	      int before = setA.size();
	      
	      for (int i = 0; i < m; i++) {
	         setA.remove(br.readLine());
	      }
	      
	      int after = setA.size();
	      
	      System.out.println(before - after);
	
	
	}

		
	
}

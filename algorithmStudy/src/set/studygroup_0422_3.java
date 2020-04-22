package set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class studygroup_0422_3 {
	//백준 1764번
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//인풋버퍼
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputStr = br.readLine().split(" ");
	      
	    int fistNum = Integer.parseInt(inputStr[0]);
	    int secontNum = Integer.parseInt(inputStr[1]);
	      
	    //사전 순이니까 TreeSet 사용
	    TreeSet<String> hashA = new TreeSet<String>();
	    Set<String> hashB = new TreeSet<String>();
			
	    for (int i = 0; i < fistNum; i++) {
	    	hashA.add(br.readLine());
	    }
	      
	    for(int i= 0; i<secontNum; i++) {
			hashB.add(br.readLine());
		}
			
		//System.out.println(hashA);
		//System.out.println(hashB);
			
		hashA.retainAll(hashB);
			
	    //개수  
	    System.out.println(hashA.size());
	      
	    Iterator<String> itA = hashA.iterator();
			
	    int count = 0;
	    //명단 사전수
	    while(itA.hasNext() && count<hashA.size()) {
			System.out.println(itA.next());
			count++;
	    }
	    
	
	}

		
	
}

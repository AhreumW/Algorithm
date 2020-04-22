package set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class studygroup_0422_4_1 {
	//백준 11723번
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//인풋버퍼
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//연산의 수
	    int M = Integer.parseInt(br.readLine());
	      
	    System.out.println();
	    HashSet<Integer> hashS = new HashSet<Integer>();
			
	    for(int i =0; i<M; i++) {
	    	String[] strLineArr = br.readLine().split(" ");
	    	String strMethod = "";
	    	int strNum =0;
	    	
	    	if(strLineArr.length == 1) {
	    		strMethod = strLineArr[0];
	    	}else {
	    		strMethod = strLineArr[0];
	    		strNum = Integer.parseInt(strLineArr[1]);	    	
	    	}
	    	
	    	if(strMethod.equals("add")) {
		    	if(hashS.contains(strNum) == false) {
		    		hashS.add(strNum);
		    	}
		    }else if(strMethod.equals("remove")) {
		    	if(hashS.contains(strNum) == true) {
		    		hashS.remove(strNum);
		    	}
		    }else if(strMethod.equals("check")) {
		    	if(hashS.contains(strNum) == true) {
		    		System.out.println(1);
		    	}else {
		    		System.out.println(0);
		    	}
		    }else if(strMethod.equals("toggle")) {
		    	if(hashS.contains(strNum) == true) {
		    		hashS.remove(strNum);
		    	}else{
		    		hashS.add(strNum);
		    	}
		    }else if(strMethod.equals("all")) {
		    	for(int n = 1; n<=20; n++) {
		    		hashS.add(n);
		    	}
		    }else if(strMethod.equals("empty")) {
		    	hashS.clear();
		    }
	    	
	    }
	    
	    
	    
	    
	
	}

		
	
}

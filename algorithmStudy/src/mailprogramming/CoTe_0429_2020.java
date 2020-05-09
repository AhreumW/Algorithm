package mailprogramming;

public class CoTe_0429_2020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		주어진 string 에 모든 단어를 거꾸로 하시오.
//
//		예제)
//		Input: “abc 123 apple”
//		Output: “cba 321 elppa”
		
		
		String inputStr = "abc 123 apple";
		
		String[] strArr = inputStr.split(" ");
		
		//각 단어 단위
		for(int i=0; i<strArr.length; i++) {
//			System.out.println("* "+strArr[i]);
			
			for(int j=0; j<strArr[i].length()/2; j++) {
				char temp = 0;
				char temp2 = 0;
				temp = strArr[i].charAt(j);
				temp2 = strArr[i].charAt(strArr[i].length()-j-1);
				
//				System.out.println("1: "+temp);
//				System.out.println("2: "+temp2);

//				System.out.println(strArr[i].substring(j, j+1));
//				System.out.println(strArr[i].substring(strArr[i].length()-j-1, strArr[i].length()-j));
				String getStr1 = strArr[i].substring(j, j+1);
				String getStr2 = strArr[i].substring(strArr[i].length()-j-1, strArr[i].length()-j);
				
				String outStr = "";
				String firstStr = strArr[i].substring(0, j);
				String middleStr = strArr[i].substring(j+1, strArr[i].length()-j-1);
				String endStr = strArr[i].substring(strArr[i].length()-j, strArr[i].length());
				
				outStr = firstStr + getStr2+ middleStr + getStr1 + endStr;
				strArr[i] = outStr;
				
				//System.out.println("out : " + outStr);
			}
			
		}
		
		String outputStr = "";
		for(int i=0; i<strArr.length; i++) {
			outputStr = outputStr + strArr[i] + " ";
		}
		//마지막 공백 제거 
		outputStr = outputStr.substring(0, outputStr.length()-1);
		
		System.out.println(outputStr);
		
	}

}

package mailprogramming;

public class CoTe_0503_2020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		정수 배열(int array)이 주어지면 두번째로 큰 값을 프린트하시오.
//
//		예제)
//		Input: [10, 5, 4, 3, -1]
//		Output: 5
//
//		Input: [3, 3, 3]
//		Output: Does not exist.
		
//		int[] inputArr = {10, 5, 4, 3, -1};
//		int[] inputArr = {3, 3, 3};
		int[] inputArr = {5, 0, 0};		//수정필요
		
		int maxNum = 0;
		int secondNum = 0;
		boolean notEqaul = false;
		
		for(int i=0; i<inputArr.length; i++) {
			if(inputArr[i] > maxNum) {
				maxNum = inputArr[i];
			}else if(inputArr[i] < maxNum) {				
				if(inputArr[i] > secondNum) {
					secondNum = inputArr[i];
					notEqaul = true;
				}
			}
		}
		
		if(notEqaul==true) {
			System.out.println(secondNum);			
		}else {
			System.out.println("Does not exist");
		}
		
		
	}

}

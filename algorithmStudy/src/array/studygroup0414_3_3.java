package array;

import java.util.Scanner;

public class studygroup0414_3_3 {
//	형식오빠 
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String[] inputStrArr = new String[10];
      String inputStr = "";
      String temp = "";
      int count = 0;
      while(count < 10) {
         inputStr = sc.nextLine();
         if(inputStr.equals("")) {
            break;
         } else {
            inputStrArr[count++] = inputStr;
         }
      }
      
      for (int i = 0; i < count; i++) {
         for (int j = i; j < count; j++) {
            if(calc(inputStrArr[i], inputStrArr[j])) {
               temp = inputStrArr[i];
               inputStrArr[i] = inputStrArr[j];
               inputStrArr[j] = temp;
            }
         }
      }
      
      for (int i = 0; i < count; i++) {
         System.out.println(inputStrArr[i]);
      }
   }
   
   public static boolean calc(String a, String b) {
      int alen = a.length();
      int blen = b.length();
      int len = (alen < blen) ? alen : blen;
      
      for (int i = 0; i < len; i++) {
         if (a.charAt(i) > b.charAt(i)) {
            return true;
         } else if (a.charAt(i) < b.charAt(i)) {
            return false;
         }
      }
      
      if (alen > blen) {
         return true;
      }
      
      return false;
   }
}
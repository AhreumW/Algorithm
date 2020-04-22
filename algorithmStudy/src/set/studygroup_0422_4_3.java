package set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class studygroup_0422_4_3{
   public static void main(String[] args) throws NumberFormatException, IOException {
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
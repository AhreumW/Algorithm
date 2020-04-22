package set;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Set;
import java.util.TreeSet;

public class studygroup_0422_4_2 {

   public static void main(String args[]) throws IOException {
      // https://www.acmicpc.net/problem/11723

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      
      Set<Integer> st = new TreeSet<Integer>();

      int forNum = Integer.parseInt(br.readLine());

      int tempNum = 0;

      for (int i = 0; i < forNum; i++) {
         String tempStr = br.readLine();

         
         if (tempStr.equals("all") || tempStr.equals("empty")) {
            tempNum = 0;
         } else {
            tempNum = Integer.parseInt(tempStr.substring(tempStr.length() - 1));
         }

         
         if (tempStr.equals("empty")) {
            st.clear();
         } else if (tempStr.equals("all")) {
            for (int j = 0; j < 20; j++) {
               st.add(j);
            }

         } else if (tempStr.substring(0, tempStr.indexOf(" ")).equals("add")) {
            st.add(tempNum);
         } else if (tempStr.substring(0, tempStr.indexOf(" ")).equals("check")) {
            if (st.contains(tempNum) == true) {
               bw.write("1\n");
            } else {
               bw.write("0\n");
            }
         } else if (tempStr.substring(0, tempStr.indexOf(" ")).equals("remove")) {
            st.remove(tempNum);
         } else if (tempStr.substring(0, tempStr.indexOf(" ")).equals("toggle")) {
            if (st.contains(tempNum) == false) {
               st.add(tempNum);
            } else {
               st.remove(tempNum);
            }
         } 
      }
      bw.flush();
      bw.close();
      br.close();
   }

}
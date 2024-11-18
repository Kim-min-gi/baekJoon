import java.util.*;

class Solution {
    public String solution(String s) {
      StringTokenizer st = new StringTokenizer(s);

      int min = Integer.parseInt(st.nextToken());
      int max = min;

      while (st.hasMoreTokens()){
         int num = Integer.parseInt(st.nextToken());
         if (min > num){
             min = num;
         }else if (max < num){
             max = num;
         }
      }


      String answer = min + " " + max;
        
        
        
        return answer;
    }
}
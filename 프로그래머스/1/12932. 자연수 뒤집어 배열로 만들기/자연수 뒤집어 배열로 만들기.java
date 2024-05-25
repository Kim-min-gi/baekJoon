import java.util.*;

class Solution {
    public int[] solution(long n) {
         String s = n + "";
         StringBuffer sb = new StringBuffer(s);
         String[] sArr = sb.reverse().toString().split("");
         
         int[] answer = new int[sArr.length];
         
         for(int i =0; i<sArr.length; i++){
             answer[i] = Integer.parseInt(sArr[i]);
         }
        
		 return answer;
    }
}
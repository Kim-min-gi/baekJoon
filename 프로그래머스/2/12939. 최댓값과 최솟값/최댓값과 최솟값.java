import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArr = s.split(" ");
        int max = Integer.parseInt(sArr[0]);
        int min = Integer.parseInt(sArr[0]);

        for (String num : sArr){
            if (max < Integer.parseInt(num)){
                max = Integer.parseInt(num);
            }

            if (min > Integer.parseInt(num)){
                min = Integer.parseInt(num);
            }
        }

        

        answer = min + " " + max;
        
        return answer;
    }
}
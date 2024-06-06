import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = s.toUpperCase();

        char[] sArr = answer.toCharArray();

        for (int i =1; i<sArr.length; i++){
            if (65 <= sArr[i - 1] && sArr[i - 1] <= 90){
                sArr[i] = Character.toLowerCase(sArr[i]);
            }
        }


        answer = String.valueOf(sArr);


        return answer;
    }
}
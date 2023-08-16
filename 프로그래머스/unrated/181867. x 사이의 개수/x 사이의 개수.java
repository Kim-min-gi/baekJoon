import java.util.ArrayList;

class Solution {
    public int[] solution(String myString) {
        String[] myStringSplit = myString.split("x",myString.length());
        int[] answer = new int[myStringSplit.length];
        
        for(int i =0; i<myStringSplit.length; i++){
            answer[i] = myStringSplit[i].length();
        }
        
        return answer;
    }
}
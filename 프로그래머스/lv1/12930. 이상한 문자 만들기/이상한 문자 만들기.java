import java.util.*;
class Solution {
    public String solution(String s) {
        String[] words = s.split("");
        String answer = "";
        int index = 0;
        for(int i =0; i<words.length; i++){
            if(words[i].equals(" ")) {
                answer += " ";
                index = 0;
                continue;
            }
            
            if(index % 2 == 0){
                answer += words[i].toUpperCase();
            }else{
                answer += words[i].toLowerCase();
            }
            
            index++;
        }
        
        
        return answer;
    }
}
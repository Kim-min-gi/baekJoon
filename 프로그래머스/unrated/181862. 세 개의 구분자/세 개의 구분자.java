import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] sArray = myStr.split("[a|b|c]");
        
        List<String> list = new ArrayList<>();
        for(String s : sArray){
            if(!s.equals("")){
                list.add(s);
            }
        }
        
        String[] answer = list.toArray(new String[list.size()]);
        if(answer.length == 0){
            answer = new String[1];
            answer[0] = "EMPTY";
        }       
    
        return answer;
    }
}
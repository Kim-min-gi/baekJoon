import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> answer = new ArrayList<>();
        for(String s : strArr){
            if(s.indexOf("ad") == -1){
                answer.add(s);
            }
        }
        
        return answer.toArray(new String[answer.size()]);
    }
}
import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        List<String> list = new ArrayList<>();
        
        for(int i =0; i<strings.length; i++){
            list.add(strings[i].charAt(n) + strings[i]);
        }
        
        Collections.sort(list);
        
        String[] answer = new String[list.size()];
        for(int j=0; j<answer.length; j++){
            answer[j] = list.get(j).substring(1,list.get(j).length());
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {

    public boolean isSame(String a, String b){
        
        if(a.charAt(a.length() - 1) == b.charAt(0)) return false;
        
        return true;
    }
    
    public int[] solution(int n, String[] words) {
        ArrayList<String> list = new ArrayList<>();
        int[] answer = new int[2];
        list.add(words[0]);

        for(int i=1; i<words.length; i++){
            if(list.contains(words[i]) || isSame(list.get(list.size()-1),words[i])){
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
            list.add(words[i]);
        }
        
     

        return answer;
    }
}
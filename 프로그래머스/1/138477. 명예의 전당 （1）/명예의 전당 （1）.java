import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<score.length; i++){
            
            if(list.size() < k){
                list.add(score[i]);
                Collections.sort(list);
                answer[i] = list.get(0);
                continue;
            }
            
            
            if(list.size() == k){
                
                if(list.get(0) < score[i]){
                    list.remove(0);
                    list.add(score[i]);
                    Collections.sort(list);
                }
                
                answer[i] = list.get(0);
            }
  
        }

        return answer;
    }
}
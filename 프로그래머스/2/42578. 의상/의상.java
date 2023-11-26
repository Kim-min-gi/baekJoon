import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String,Integer> list = new HashMap<>();
        
        for(int i =0; i<clothes.length; i++){
            list.put(clothes[i][1],list.getOrDefault(clothes[i][1],0) + 1);
        }
        
        Iterator<Integer> count = list.values().iterator();
        while(count.hasNext()){
            answer *= count.next().intValue() + 1;
        }

        
        return answer - 1;
    }
}
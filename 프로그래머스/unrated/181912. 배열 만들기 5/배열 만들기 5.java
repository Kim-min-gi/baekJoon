import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        
        for(String o : intStrs){
           String subString = o.substring(s,s+l);
           int num = Integer.valueOf(subString);
           if(k < num) list.add(num);
        }
        
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}
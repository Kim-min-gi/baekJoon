import java.util.*;
class Solution {
    public int[] solution(int[] arr) {

        
        List<Integer> stk = new ArrayList<>();
        int i=0;
        
        while(arr.length>i){
            
            if(stk.isEmpty()){
                stk.add(arr[i]);
                i++;
            }else if(stk.get(stk.size()-1) < arr[i]){
                stk.add(arr[i]);
                i++;
            }else if(stk.get(stk.size()-1) >= arr[i]) stk.remove(stk.size()-1);
            
        }
        
        
        return stk.stream().mapToInt(j->j).toArray();
    }
}
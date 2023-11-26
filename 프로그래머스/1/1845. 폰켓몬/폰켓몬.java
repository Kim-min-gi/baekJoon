import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int count = nums.length / 2;
        HashSet<Integer> list = new HashSet<>(); 
        
        for(int num : nums){
            list.add(num);
        }
        
        if(list.size() > count){
            return count;
        }
        
        return list.size();
    }
}
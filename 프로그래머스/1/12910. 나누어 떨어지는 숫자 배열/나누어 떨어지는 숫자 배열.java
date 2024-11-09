import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        
        for(int num : arr){
            if(num % divisor == 0) list.add(num);
        }

        int[] answer = list.isEmpty() ? new int[]{-1} : list.stream().mapToInt(i -> i).sorted().toArray();
        
        
        return answer;
    }
}
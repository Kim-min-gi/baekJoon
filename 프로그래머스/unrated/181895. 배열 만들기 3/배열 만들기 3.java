import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<>();
        
        for(int i =0; i<intervals.length; i++){
             int startIndex = intervals[i][0];
             int endIndex = intervals[i][1];
            
            for(int j = startIndex; j<=endIndex; j++){
                list.add(arr[j]);
            }
            
            
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
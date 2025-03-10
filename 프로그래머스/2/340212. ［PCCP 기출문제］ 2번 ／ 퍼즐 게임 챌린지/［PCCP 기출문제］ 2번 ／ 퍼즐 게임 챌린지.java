import java.util.*;

class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int answer = Integer.MAX_VALUE;
        int start = 1;
        int end = Arrays.stream(diffs).max().orElseThrow();
        
        while(start <= end){
            int mid = (start + end) / 2;
            
            if(isChecked(diffs,times,limit,mid)){
                end = mid - 1;
                answer = answer > mid ? mid : answer;
                continue;
            }
            
            start = mid + 1;
        }
        
        return answer;
    }
    
    public static boolean isChecked(int[] diffs, int[] times, long limit,int level){
        long totalTime = times[0];
        int preTime = times[0];
        
         for(int i =1; i<diffs.length; i++){
            if(diffs[i] <= level) totalTime += times[i];
            else if(diffs[i] > level) totalTime += (diffs[i] - level) * (times[i] + preTime) + times[i];
            
            if(totalTime > limit) return false;
            preTime = times[i];
        }
        
        return true;
        
    }
}
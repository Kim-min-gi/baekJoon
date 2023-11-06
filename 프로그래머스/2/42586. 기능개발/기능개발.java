import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        for(int i =0; i<progresses.length; i++){
            double d = (100 - progresses[i]) / (double) speeds[i];
            int day = (int) Math.ceil(d);
            
            
            int j = i + 1;
            for(; j<progresses.length; j++){
                if(progresses[j] + day * speeds[j] < 100){
                    break;
                }
            }
            
            list.add(j - i);
            i = j - 1;
            
        }
      
        return list.stream().mapToInt(i -> i).toArray();
    }
}
import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> q = new LinkedList<>();
        int truckSumWeight = 0;      
        int index = 0;
        int answer = 0;
        
        
        for(int i =0; i<bridge_length; i++){
            q.offer(0);
        }
        
        while(index < truck_weights.length){
           truckSumWeight -= q.poll();
           answer++;
        
           if(truckSumWeight + truck_weights[index] <= weight){
               q.offer(truck_weights[index]);
               truckSumWeight += truck_weights[index++];
           }else{
               q.offer(0);
           }
        }
        
        
        return answer + bridge_length;
    }
}
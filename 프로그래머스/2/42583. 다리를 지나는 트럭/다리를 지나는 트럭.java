import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> que = new LinkedList<>();
        
        for(int i =0; i<bridge_length - 1; i++){
            que.add(0);
        }
        
        que.add(truck_weights[0]);
        
        int bridgeWegiht = truck_weights[0];
        int answer = 1;
        int index = 1;
        
        while(!que.isEmpty()){
            answer++;
            bridgeWegiht -= que.poll();
            
            if(index < truck_weights.length){
                if(bridgeWegiht + truck_weights[index] <= weight){
                    bridgeWegiht += truck_weights[index];
                    que.add(truck_weights[index]);
                    index++;
                }else{
                    que.add(0);
                }
            }
            
        }
        
        
        return answer;
    }
}
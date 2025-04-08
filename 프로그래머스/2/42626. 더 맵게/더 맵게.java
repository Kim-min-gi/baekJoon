import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> que = new PriorityQueue<>();
        
        for(int num : scoville){
            que.add(num);
        }
        
        while(que.peek() < K){
            
            if(que.size() < 2) {
                answer = -1;
                break;
            }
            
            int num = que.poll();
            int num2 = que.poll();
            
            int num3 = num + num2 * 2;
            que.add(num3);
            answer++;
        }
        
        
        return answer;
    }
}
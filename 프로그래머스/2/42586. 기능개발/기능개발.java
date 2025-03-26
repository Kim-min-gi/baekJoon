import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> que = new LinkedList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        
        
        for(int i =0; i<progresses.length; i++){
            if((100 - progresses[i]) % speeds[i] == 0){
                que.offer((100 - progresses[i]) / speeds[i]);
            }else{
                que.offer(((100 - progresses[i]) / speeds[i]+1));
            }
        }
                          
        int now = que.poll();
        int count = 1;                  
                          
        while(!que.isEmpty()){
            if(now >= que.peek()){
                count++;
                que.poll();
            }else{
                answer.add(count);
                now = que.poll();
                count = 1;
            }
        }                  
        answer.add(count);                  
        
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
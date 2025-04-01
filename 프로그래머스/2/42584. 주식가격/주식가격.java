import java.util.Stack;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack();
        
        for(int i =0; i<prices.length; i++){
            while(!stack.isEmpty() && prices[i] < prices[stack.peek()]){
                int num = stack.pop();
                answer[num] = i - num;
            }
            stack.push(i);
        }
        
        while(!stack.isEmpty()){
            int num = stack.pop();
            answer[num] = prices.length - num - 1;
        }
        
        return answer;
    }
}
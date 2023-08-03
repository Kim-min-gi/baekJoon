class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int multiply = 1;
        int square = 0;
        int answer = 0;
        
        for(int i : num_list){
            sum += i;
            multiply *= i;
        }
        
        square = sum * sum;
        
        if(square > multiply){
            answer = 1;
        }
        
        return answer;
    }
}
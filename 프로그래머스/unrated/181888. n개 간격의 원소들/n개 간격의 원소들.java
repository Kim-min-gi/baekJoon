class Solution {
    public int[] solution(int[] num_list, int n) {
        int length = num_list.length;
        int[] answer = {};
        if(length % n == 0){
            answer = new int[length / n];
        }else{
            answer = new int[length / n + 1];
        }
        int index = 0;
        for(int i = 0; i<length; i+=n) 
        {
            answer[index++] = num_list[i];
        }
       
        return answer;
    }
}
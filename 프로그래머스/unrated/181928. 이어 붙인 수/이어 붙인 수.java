class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String oddNumber = "";
        String even = "";
        for(int i : num_list){
            if(i % 2 ==0){
                even += i;
            }else{
                oddNumber += i;
            }
        }
        answer = Integer.parseInt(even) + Integer.parseInt(oddNumber);
        
        return answer;
    }
}
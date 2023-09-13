class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        String num = ""+x;
        int sum = 0;
        for(int i =0; i<num.length(); i++){
          sum +=  num.charAt(i) - '0';
        }
        
        if(x % sum == 0){
            answer = true;
        }
        
        return answer;
    }
}
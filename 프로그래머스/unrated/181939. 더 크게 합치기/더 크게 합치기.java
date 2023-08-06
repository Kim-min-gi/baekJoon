class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int a_Plus_b = Integer.parseInt(""+a+b);
        int b_Plus_a = Integer.parseInt(""+b+a);
        
        if(a_Plus_b == b_Plus_a || a_Plus_b > b_Plus_a){
            answer = a_Plus_b;
        }else if(a_Plus_b < b_Plus_a){
            answer = b_Plus_a;
        }
        
        return answer;
    }
}
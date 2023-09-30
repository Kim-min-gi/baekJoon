class Solution {
    public int solution(int n) {
        int answer = 0;
        String trans = "";
        while(n != 0){
            trans += n % 3;
            n = n / 3;
        }
        
        answer = Integer.parseInt(trans,3);
        
        return answer;
    }
}
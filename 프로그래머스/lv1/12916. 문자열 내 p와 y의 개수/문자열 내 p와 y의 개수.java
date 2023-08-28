class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int countP = 0;
        int countY = 0;
        for(char c : s.toCharArray()){
            if(c == 'p' || c == 'P'){
                countP++;
            }
            
            if(c =='y' || c =='Y'){
                countY++;
            }
        }
        
        if(countP == countY) answer = true;
        else if(countP == 0 && countY ==0) answer = true;

        // // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        // System.out.println(answer);

        return answer;
    }
}
class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        char[] codeToArray = code.toCharArray();
        
        for(int i =0; i<codeToArray.length; i++){
            if(i%q == r) answer += codeToArray[i];
        }
        
        return answer;
    }
}
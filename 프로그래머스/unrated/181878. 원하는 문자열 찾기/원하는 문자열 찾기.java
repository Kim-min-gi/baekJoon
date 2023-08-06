class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String loser_myString = myString.toLowerCase();
        String loser_pat = pat.toLowerCase();
        
        if(loser_myString.contains(loser_pat)){
            answer = 1;
        };
        
        return answer;
    }
}
class Solution {
    public int solution(String myString, String pat) {
        String replaceMyString = myString.replace("A","X").replace("B","A").replace("X","B");
        int answer = 0;
        if(replaceMyString.contains(pat)){
            answer = 1;
        }
        return answer;
    }
}
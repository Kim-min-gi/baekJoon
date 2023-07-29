class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        int idx = 0;
        for(String s : strArr){
            if(idx % 2 == 0){
               answer[idx] = s.toLowerCase();
            }else{
               answer[idx] = s.toUpperCase();
            }
            idx++;
        }
        
        return answer;
    }
}
class Solution {
    public String solution(String[] seoul) {
        
        int count = 0;
        
        for(String s : seoul){
            if(s.equals("Kim")) break;
            count++;
        }
        
        String answer = "김서방은 "+ count + "에 있다";
        
        return answer;
        
    }
}
class Solution {
    public String solution(String s) {
        int length = s.length();
        int start, end;
        
        
        if(length % 2 == 0){
            start = length / 2 -1;
            end = length / 2 +1;
        }else{
            start = length / 2;
            end = start + 1;
        }
        
        return s.substring(start,end);
        
    }
}
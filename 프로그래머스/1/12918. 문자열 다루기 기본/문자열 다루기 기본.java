class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        int length = s.length();
        
        if(length == 4 || length == 6){
            try{
                int check = Integer.parseInt(s);
                answer = true;
            }catch(NumberFormatException e){
                
            }
        }
            
    
        return answer;
        
    }
}
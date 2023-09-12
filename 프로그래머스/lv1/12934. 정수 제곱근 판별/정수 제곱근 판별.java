class Solution {
    public long solution(long n) {
       Long x = (long) Math.sqrt(n);
       Long result = (long) Math.pow(x,2);
    
       if(result == n){
           return  (long) Math.pow(x+1,2);
       }
        
        return -1;                    
        
    }
}
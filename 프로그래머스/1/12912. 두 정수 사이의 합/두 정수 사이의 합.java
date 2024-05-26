class Solution {
    public long solution(int a, int b) {
       long x = 0L;
        
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        
        for(long i =min; i<=max; i++){
            x += i;
        }
        
        return x;
        
    }
}
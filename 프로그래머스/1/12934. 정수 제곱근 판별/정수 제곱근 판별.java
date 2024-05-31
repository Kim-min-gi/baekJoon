class Solution {
    public long solution(long n) {
        long x = (long) Math.sqrt(n);
        long result = (long) Math.pow(x,2);
        
        if(result == n) return (long) Math.pow(x+1,2);
        else return -1;
        
        
    }
}
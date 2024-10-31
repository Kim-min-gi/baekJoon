import java.util.*;

class Solution {
    public long solution(long n) {
        
        String[] numArr = String.valueOf(n).split("");
        Arrays.sort(numArr, Comparator.reverseOrder());
        
        return Long.parseLong(String.join("",numArr));
    }
}
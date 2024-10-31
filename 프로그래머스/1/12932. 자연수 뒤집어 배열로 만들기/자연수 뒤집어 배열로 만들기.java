import java.util.*;
class Solution {
    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        
        return Arrays.stream(sb.reverse().toString().split("")).mapToInt(Integer::parseInt).toArray();
    }
}
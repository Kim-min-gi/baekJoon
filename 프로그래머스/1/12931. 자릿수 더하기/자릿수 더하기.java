import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String length = ""+n;

        for (int i =0; i<length.length(); i++){
            answer += n % 10;
            n /= 10;
        }
        
        return answer;
    }
}
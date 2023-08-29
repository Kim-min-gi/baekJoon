import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigInteger aToInt = new BigInteger(a);
        BigInteger bToInt = new BigInteger(b);
        answer += aToInt.add(bToInt);
        
        return answer;
    }
}
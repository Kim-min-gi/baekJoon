class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] binomials = binomial.split(" ");
        
        int a = Integer.parseInt(binomials[0]);
        int b = Integer.parseInt(binomials[2]);
        
        if(binomials[1].equals("+")) answer =  a + b;
        else if(binomials[1].equals("-")) answer = a - b;
        else if(binomials[1].equals("*")) answer = a * b;
        
        return answer;
    }
}
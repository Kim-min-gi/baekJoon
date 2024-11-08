class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int pCount = 0;
        int yCount = 0;

        for (char c : s.toLowerCase().toCharArray()){
            if (c == 'p') pCount++;
            if (c == 'y') yCount++;
        }

        if (pCount == yCount) answer = true;

        return answer;
    }
}
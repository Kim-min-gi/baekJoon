class Solution {
    public int solution(String t, String p) {
        long pNumber = Long.parseLong(p);
        int count = 0;

        for (int i =0; i<= t.length() - p.length(); i++){

            String substring = t.substring(i, i + p.length());
            long tNumber = Long.parseLong(substring);

            if (tNumber <= pNumber) count++;

        }
        
        
        return count;
    }
}
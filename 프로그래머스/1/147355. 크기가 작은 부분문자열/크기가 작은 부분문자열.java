class Solution {
    public int solution(String t, String p) {
       	int length = p.length();
		long num = Long.parseLong(p);
		int result = 0;

         for (int i = 0; i <= t.length() - length; i++) {
            long tValue = Long.parseLong(t.substring(i, i + length));
            if (tValue <= num)
                result++;
        }
        
		return result;
    }
}
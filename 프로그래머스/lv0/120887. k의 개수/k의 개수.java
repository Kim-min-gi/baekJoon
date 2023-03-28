class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        char ks = (char)(k + '0');
        for(int y =i; y<=j; y++){
            String ys = Integer.toString(y);
            for(int u = 0; u<ys.length(); u++){
                if(ys.charAt(u) == ks) answer++;
            }
        }
        return answer;
    }
}
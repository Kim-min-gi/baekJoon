class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] have = new int[n];
        int answer = 0;

        for (int i : reserve){
            have[i-1]++;
        }

        for (int i : lost){
            have[i-1]--;
        }
        
        for (int i =0; i<have.length; i++){
            if (have[i] == 1){
                if (i-1 >= 0 && have[i-1] == -1){
                    have[i-1]++;
                } else if (i+1 < have.length && have[i+1] == -1) {
                    have[i+1]++;
                }
            }
        }

        for (int i : have){
            if (i != -1) answer++;
        }

        return answer;
    }
}
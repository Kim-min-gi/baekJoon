class Solution {
    public int solution(int[] date1, int[] date2) {
        String dateSum1= "";
        String dateSum2= "";
        for(int i=0; i<date1.length; i++){
            dateSum1 += date1[i];
            dateSum2 += date2[i];
        }
        
        return Integer.parseInt(dateSum2) > Integer.parseInt(dateSum1) ? 1 : 0;
    }
}
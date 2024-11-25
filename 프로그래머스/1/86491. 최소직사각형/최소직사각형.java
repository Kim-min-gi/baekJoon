class Solution {
    public int solution(int[][] sizes) {
    
        int maxWidth = 0;
        int minHeight = 0;

        for (int[] a : sizes){

            int width = Math.max(a[0],a[1]);
            int height = Math.min(a[0],a[1]);

            maxWidth = Math.max(maxWidth,width);
            minHeight = Math.max(minHeight,height);


        }
        
        
        return maxWidth * minHeight;
    }
}
class Solution {
    public int solution(int[][] sizes) {
        int wMax = 0;
        int hMax = 0;
        
        for(int[] size : sizes){
            int w = Math.max(size[0], size[1]);
            int h = Math.min(size[0], size[1]);
            wMax=Math.max(wMax,w);
            hMax=Math.max(hMax,h);
        }
        
        
        return wMax * hMax;
    }
}
class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        int rowStart = 0;
        int rowEnd = n-1;
        int columnStart = 0;
        int columnEnd = n-1;
        
        while(num <= n*n){
            // 왼쪽 -> 오른쪽
            for (int i = columnStart; i <= columnEnd; i++) {
                answer[rowStart][i] = num++;
            }
            rowStart++;

            // 위쪽 -> 아래쪽
            for (int i = rowStart; i <= rowEnd; i++) {
                answer[i][columnEnd] = num++;
            }
            columnEnd--; 

            // 오른쪽 -> 왼쪽
            for (int i = columnEnd; i >= columnStart; i--) {
                answer[rowEnd][i] = num++;
            }
            rowEnd--; 

            // 아래쪽 -> 위쪽
            for (int i = rowEnd; i >= rowStart; i--) {
                answer[i][columnStart] = num++;
            }
            columnStart++; 
        }
        
        
        
        return answer;
    }
}
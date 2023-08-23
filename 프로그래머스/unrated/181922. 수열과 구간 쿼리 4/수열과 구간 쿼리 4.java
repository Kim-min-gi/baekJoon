class Solution {
    public int[] solution(int[] arr, int[][] queries) {
       for(int k = 0; k < queries.length; k++)
            for(int i = queries[k][0]; i <= queries[k][1]; i++) {
                if(i % queries[k][2] == 0)
                    arr[i]++;
        }
        return arr;
    }
}
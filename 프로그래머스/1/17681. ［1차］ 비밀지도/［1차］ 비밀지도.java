class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String a;
        for(int i =0; i<n; i++){
            a = String.format("%16s", Integer.toBinaryString(arr1[i] | arr2[i]));       
            a = a.substring(a.length() - n);
            a = a.replaceAll("1", "#");
            a = a.replaceAll("0", " ");
            answer[i] = a;
        }
        
        return answer;
    }
}
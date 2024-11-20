import java.util.*;
class Solution {
    
    public String solution(String x, String y) {
        
        StringBuilder sb = new StringBuilder();
        int[] xArr = new int[10];
        int[] yArr = new int[10];

        for (int i =0; i<x.length(); i++){
            xArr[x.charAt(i) - '0']++;
        }

        for (int i =0; i<y.length(); i++){
            yArr[y.charAt(i) - '0']++;
        }


        for (int i = 9; i>=0; i--){
            int count = Math.min(xArr[i],yArr[i]);
            for (int j = 0; j<count; j++){
                sb.append(i);
            }
        }

        if(sb.length() == 0) return "-1";
        if(sb.charAt(0) == '0') return "0";
        
        return sb.toString();

        
    }
}
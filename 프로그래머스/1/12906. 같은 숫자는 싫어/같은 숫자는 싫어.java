import java.util.*;
import java.io.*;

public class Solution {
    public int[] solution(int []arr) {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(arr[0]);
        
         for (int i =1; i<arr.length; i++){
            if (arr[i-1] == arr[i]) continue;

            list.add(arr[i]);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
        
    }
}
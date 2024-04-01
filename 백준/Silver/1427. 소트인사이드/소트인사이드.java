import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] stringArr = br.readLine().split("");
        int[] arr = new int[stringArr.length];

        int index = 0;
        for (String c : stringArr){
            arr[index++] = Integer.parseInt(c);
        }

        for (int i = 0; i<arr.length-1; i++){
            int minIndex = i;
            for (int j = i+1; j<arr.length; j++){
                if (arr[minIndex] < arr[j]) minIndex = j;
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        String answer = "";
        for (int num : arr){
            answer += num;
        }


        System.out.println(answer);
    }



}
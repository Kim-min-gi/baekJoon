



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    static int[] arr;

    public static int getAnswer(int num){
        arr[0] = 1;
        arr[1] = 1;

        for (int i=2; i<=num+1; i++){
            arr[i] = arr[i-2] + arr[i-1];
        }


        return arr[num+1];
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        arr = new int[num+2];

        System.out.println(getAnswer(num));


    }
}
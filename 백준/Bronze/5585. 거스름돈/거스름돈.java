import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int pay = Integer.parseInt(br.readLine());
        int[] arr = {500, 100, 50, 10, 5, 1};
        pay = 1000 - pay;
        int count = 0;

        for (int i =0; i<arr.length; i++){
            if (pay / arr[i] > 0){
                count += pay / arr[i];
                pay = pay % arr[i];
            }
        }

        System.out.println(count);


    }
}
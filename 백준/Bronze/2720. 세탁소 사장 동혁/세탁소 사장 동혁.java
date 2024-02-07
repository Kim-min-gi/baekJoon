import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main{


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = {25, 10, 5, 1};
        int[] cent;
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i<t; i++){
            cent = new int[4];
            int pay = Integer.parseInt(br.readLine());

            for (int j=0; j<arr.length; j++){
                if (pay / arr[j] > 0){
                    cent[j] = pay / arr[j];
                    pay = pay % arr[j];
                }
            }

            for (int k : cent){
                sb.append(k).append(' ');
            }

            sb.append('\n');
        }

        System.out.println(sb);


    }
}
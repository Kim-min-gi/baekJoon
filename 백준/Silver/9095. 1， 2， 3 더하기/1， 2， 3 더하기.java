import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Main{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[11];;

        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;

        for (int i =0; i<T; i++){
            int n = Integer.parseInt(br.readLine());

            for (int j = 4; j<=n; j++){
                arr[j] = arr[j-1] + arr[j-2] + arr[j-3];
            }

            sb.append(arr[n]).append('\n');

        }

        System.out.println(sb);

    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;


public class Main{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(br.readLine());
        int min = Math.abs(A-B);

        for (int i =0; i<N; i++){
            int num = Integer.parseInt(br.readLine());

            min = Math.min(Math.abs(B-num) + 1, min);
        }

        System.out.println(min);

    }

}
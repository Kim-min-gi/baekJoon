import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arrA = new int[N];
        Integer[] arrB = new Integer[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;

        for (int i =0; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            arrA[i] = num;
        }

        Arrays.sort(arrA);
        st = new StringTokenizer(br.readLine());

        for (int i =0; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            arrB[i] = num;
        }

        Arrays.sort(arrB , Collections.reverseOrder());

        for (int i = 0; i<N; i++){
            sum += arrA[i] * arrB[i];
        }

        System.out.println(sum);
    }
}
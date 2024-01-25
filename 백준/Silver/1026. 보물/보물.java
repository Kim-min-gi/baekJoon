import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrA = new ArrayList<>();
        ArrayList<Integer> arrB = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int sum = 0;

        for (int i =0; i<N; i++){
            int numA = Integer.parseInt(st.nextToken());
            int numB = Integer.parseInt(st2.nextToken());
            arrA.add(numA);
            arrB.add(numB);
        }

        for (int i = 0; i<N; i++){
            int min = Collections.min(arrA);
            int max = Collections.max(arrB);

            sum += min * max;

            arrA.remove(Integer.valueOf(min));
            arrB.remove(Integer.valueOf(max));
        }

        System.out.println(sum);
    }
}
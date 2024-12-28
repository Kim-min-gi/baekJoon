



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {




    public static int getAnswer(int m,int[] arr) {
        int lt =0,count = 0, sum =0;

        for (int rt = 0; rt<arr.length; rt++){
            sum += arr[rt++];
            if (sum == m) count++;

            while (sum >= m){
                sum -= arr[lt++];
                if (sum == m) count++;
            }
        }


        return count;
    }







    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        int index = 0;
        while (st.hasMoreTokens()){
            arr[index++] = Integer.parseInt(st.nextToken());
        }

        System.out.println(getAnswer(m,arr));


    }
}
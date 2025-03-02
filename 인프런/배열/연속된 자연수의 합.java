



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {




    public static int getAnswer(int n,int[] arr) {
        int sum = 0;
        int count = 0;
        int lt = 0;

        for(int i= 0; i<arr.length; i++){
            sum += arr[i];
            if (sum == n) count++;

            while (sum >= n){
                sum -= arr[lt++];
                if (sum == n) count++;
            }
        }

        return count;
    }







    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = n/2+1;
        int[] arr = new int[m];


        for (int i =0; i<m; i++){
            arr[i] = i+1;
        }

        System.out.println(getAnswer(n,arr));


    }
}
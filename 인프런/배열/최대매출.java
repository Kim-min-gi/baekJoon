



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {




    public static int getAnswer(int n,int k,int[] arr) {
        int answer = 0;
        int sum = 0;

        for (int i =0; i<k; i++){
            sum += arr[i];
        }
        answer = sum;

        for (int i = k; i<n; i++){
            sum += (arr[i] - arr[i-k]);
            answer = Math.max(answer,sum);
        }


        return answer;
    }







    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];


        st = new StringTokenizer(br.readLine());
        int index = 0;
        while (st.hasMoreTokens()){
            arr[index++] = Integer.parseInt(st.nextToken());
        }


        System.out.println(getAnswer(n,k,arr));


    }
}
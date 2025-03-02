



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {




    public static int getAnswer(int n,int k,int[] arr) {
        int count = 0;
        int lt = 0;
        int length = 0;

        for (int i =0; i<n; i++){
            if (arr[i] == 0) count++;
            while (count > k){
                if(arr[lt] == 0) count--;
                lt++;
            }
            length = Math.max(length, i-lt+1);
        }


        return length;
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
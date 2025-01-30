



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;




public class Main {

    static int answer = Integer.MIN_VALUE;
    static int n,c;


    public void getAnswer(int l,int sum,int[] arr){

        if (sum > c) return;

        if (l == n){
            answer = Math.max(answer,sum);
        }else{
            getAnswer(l+1,sum+arr[l],arr);
            getAnswer(l+1,sum,arr);
        }


    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        c = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        Main main = new Main();

        int[] arr = new int[n];

        for (int i =0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }


//        int index = 0;
//        while (st.hasMoreTokens())
//        {
//            int num = Integer.parseInt(st.nextToken());
//            arr[index++] = num;
//        }

        main.getAnswer(0,0,arr);

        System.out.println(answer);



    }
}
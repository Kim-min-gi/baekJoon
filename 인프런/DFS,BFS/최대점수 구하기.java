



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;




public class Main {

    static int answer = Integer.MIN_VALUE;
    static int n,m;


    public void getAnswer(int l,int sum,int time,int[] arr,int[] times){

        if (m < time) return;

        if(l == n){
            answer = Math.max(answer,sum);
        }else{
            getAnswer(l+1,sum+arr[l],time + times[l],arr,times);
            getAnswer(l+1,sum,time,arr,times);
        }



    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        Main main = new Main();

        int[] arr = new int[n];
        int[] time = new int[n];

        for (int i =0; i<n; i++){

            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
            time[i] = Integer.parseInt(st.nextToken());

        }


//        int index = 0;
//        while (st.hasMoreTokens())
//        {
//            int num = Integer.parseInt(st.nextToken());
//            arr[index++] = num;
//        }

        main.getAnswer(0,0,0,arr,time);

        System.out.println(answer);



    }
}
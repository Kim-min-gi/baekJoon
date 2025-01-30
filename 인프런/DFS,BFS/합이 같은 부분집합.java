



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;




public class Main {

    static String answer = "NO";
    boolean flag = false;
    static int n , total = 0;

    public void getAnswer(int l,int sum,int[] arr){

        if (flag) return;

        if (sum > total/2) return;


        if (l == n){
            if (total-sum == sum){
                answer = "YES";
                flag = true;
            }

        }else{
            getAnswer(l+1,sum + arr[l],arr);
            getAnswer(l+1,sum,arr);
        }



    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n  = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        Main main = new Main();


        int[] arr = new int[n];

        int index = 0;

        while (st.hasMoreTokens())
        {
            int num = Integer.parseInt(st.nextToken());
            arr[index++] = num;
            total += num;
        }

        main.getAnswer(0,0,arr);

        System.out.println(answer);



    }
}




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;




public class Main {

    static int n,m,answer = Integer.MAX_VALUE;


    public void getAnswer(int l,int sum,int[] coins){

        if (sum > m) return;

        if (l >= answer) return;

        if (sum == m){
            answer = Math.min(answer,l);
        }else{
            for (int i =0; i<n; i++){
                getAnswer(l+1,sum+coins[i],coins);
            }
        }


    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        int[] coins = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        Main main = new Main();

        int index = 0;
        while (st.hasMoreTokens()){
            coins[index++] = Integer.parseInt(st.nextToken());
        }

        coins = Arrays.stream(coins).boxed().sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue).toArray();


        m = Integer.parseInt(br.readLine());


        main.getAnswer(0,0,coins);

        System.out.println(answer);



    }
}
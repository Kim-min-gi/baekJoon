



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



public class Main {

    static int[] coins;

    public static int getAnswer(int m){
        int[] dy = new int[m + 1];
        Arrays.fill(dy,Integer.MAX_VALUE);
        dy[0] = 0;

        for (int i = 0; i<coins.length; i++){

            for (int j=coins[i]; j<=m; j++){
                dy[j] = Math.min(dy[j] , dy[j - coins[i]]+1);
            }

        }

        return dy[m];
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        coins = new int[num];

        int index = 0;
        while (st.hasMoreTokens()){
            coins[index++] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());

        System.out.println(getAnswer(m));


    }
}
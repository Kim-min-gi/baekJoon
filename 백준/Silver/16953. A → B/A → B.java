import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main{
    static long a,b;
    static int count = 0;
    static boolean check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());



        dfs(a,1);
        if (check) System.out.println(count);
        else System.out.println(-1);

    }

    public static void dfs(long num, int cnt){
            if (num > b) return;

            if (num == b){
                count = cnt;
                check = true;
                return;
            }

            dfs(num*2, cnt + 1);
            dfs(num*10+1, cnt + 1);

    }

}
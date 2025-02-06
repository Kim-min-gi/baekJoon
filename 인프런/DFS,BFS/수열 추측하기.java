



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;




public class Main {

    static int[] d,p,chk;
    static int[][] df = new int[35][35];
    static int n,f;
    static boolean flag;



    public static int dfs(int n,int r){
        if (df[n][r] > 0) return df[n][r];

        if (n == r || r == 0) return 1;
        else return df[n][r] = dfs(n-1,r-1) + dfs(n-1,r);

    }

    public static void dfs2(int l, int sum){
        if (flag) return;

        if (l == n){
            if (sum == f) {
                for (int num : p) System.out.print(num + " ");
                flag = true;
            }
        }else{
            for (int i = 1; i<=n; i++){
                if (chk[i] == 0){
                    chk[i] = 1;
                    p[l] = i;
                    dfs2(l+1,sum + (p[l] * d[l]));
                    chk[i] = 0;
                }
            }
        }


    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        f = Integer.parseInt(st.nextToken());

        d = new int[n];
        p = new int[n];
        chk = new int[n+1];


        for (int i =0; i<n; i++){
            d[i] = dfs(n-1,i);
        }

        dfs2(0,0);

    }
}
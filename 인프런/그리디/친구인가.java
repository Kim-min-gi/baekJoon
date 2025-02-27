



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;




public class Main {

    static int n,m;
    static int[] arr;


    public static int Find(int n){
        if (n == arr[n]) return n;
        else return Find(arr[n]);
    }

    public static void Union(int a,int b){
        int fa = Find(a);
        int fb = Find(b);

        if (fa != fb) arr[fa] = fb;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n+1];

        for (int i =1; i<=n; i++){
            arr[i] = i;
        }


        for (int i =1; i<=m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            Union(a,b);
        }

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int fa = Find(a);
        int fb = Find(b);

        if (fa != fb) System.out.println("NO");
        else System.out.println("YES");



    }
}
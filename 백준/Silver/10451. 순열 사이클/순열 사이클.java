import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Main{
    static int[] arr;
    static boolean[] visited;

    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());


        for (int i =0; i<T; i++){
            int N = Integer.parseInt(br.readLine());
            int count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());

            arr = new int[N+1];
            visited = new boolean[N+1];

            for (int j=1; j<=N; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            for (int j=1; j<=N; j++){
                if (!visited[j]){
                    dfs(j);
                    count++;
                }
            }

            sb.append(count).append('\n');
        }

        System.out.println(sb);

    }

    static void dfs(int x){
        visited[x] = true;
        if (!visited[arr[x]]) dfs(arr[x]);
    }

}
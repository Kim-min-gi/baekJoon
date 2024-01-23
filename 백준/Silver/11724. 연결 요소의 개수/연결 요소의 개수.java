import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{

    static ArrayList<Integer>[] arr;
    static boolean[] visited;
    static int count,N,M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new ArrayList[N+1];
        visited = new boolean[N+1];
        count = 0;

        for (int i =0; i<arr.length; i++){
            arr[i] = new ArrayList<>();
        }

        for (int i =0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a].add(b);
            arr[b].add(a);
        }

        for (int i = 1; i<=N; i++){
            if (!visited[i]){
                dfs(i);
                count++;
            }
        }

        System.out.println(count);

    }

    static void dfs(int node){
        visited[node] = true;
        for (int nextNode : arr[node]){
            if (!visited[nextNode]){
                dfs(nextNode);
            }
        }

    }

}
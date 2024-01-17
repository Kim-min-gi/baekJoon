import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    static boolean[] visited;
    static ArrayList<Integer>[] arr;
    static int count = 0;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        arr = new ArrayList[N+1];
        visited = new boolean[N+1];


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

        bfs();

        System.out.println(count);
    }

    public static void bfs(){
        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        visited[1] = true;
        while (!que.isEmpty()){
            int next_node = que.poll();
            for (int i : arr[next_node]){
                if (!visited[i]){
                    que.add(i);
                    visited[i] = true;
                    count++;
                }
            }
        }
    }




}
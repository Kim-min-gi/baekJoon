import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    static ArrayList<Integer>[] arr;
    static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        arr = new ArrayList[N+1];

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

        for (int i =0; i<arr.length; i++){
            Collections.sort(arr[i]);
        }

        check = new boolean[N+1];
        dfs(start);
        System.out.println();
        check = new boolean[N+1];
        bfs(start);
    }

    public static void dfs(int index){
        System.out.print(index+" ");
        check[index] = true;
        for (int num : arr[index]){
            if (!check[num]){
                dfs(num);
            }
        }
    }

    public static void bfs(int index){
        check[index] = true;
        Queue<Integer> que = new LinkedList<>();
        que.add(index);

        while (!que.isEmpty()){
            int now_node = que.poll();
            System.out.print(now_node + " ");
            for (int i : arr[now_node]){
                if (!check[i]){
                    check[i] = true;
                    que.add(i);
                }
            }
        }

    }

}




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Edge implements Comparable<Edge>{
    int v1;
    int v2;
    int cost;

    public Edge(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }
}


public class Main {

    static int n,m;
    static int[] arr;


    public static int Find(int n){
        if (n == arr[n]) return n;
        else return arr[n] = Find(arr[n]);
    }

    public static void Union(int a,int b){
        int fa = Find(a);
        int fb = Find(b);

        if (fa != fb) arr[fa] = fb;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Edge> list = new ArrayList<>();
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n+1];

        for (int i =1; i<=n; i++){
            arr[i] = i;
        }


        for (int i =0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            list.add(new Edge(a,b,cost));
        }

        int answer = 0;
        Collections.sort(list);

        for (Edge e : list){
            int fa = Find(e.v1);
            int fb = Find(e.v2);
            if (fa != fb){
                answer += e.cost;
                Union(e.v1,e.v2);
            }
        }

        System.out.println(answer);

    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {

    static int n;
    static int k;
    static final int size = 100001;
    static int[] map;
    static int[] dx = {-1, 1};
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        map = new int[size];
        visited = new boolean[size];

        if (n == k)
            System.out.println(0);
        else
            bfs(n);
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
//            System.out.println(current);
            for (int i = 0; i < 3; i++) {
                int nx;
				
                
                if (i == 2) { // 2일경우 다음 좌표를 현재 * 2
                    nx = current * 2;
                }
                else {
                    nx = current + dx[i];
                }

                if (nx == k) {
                    System.out.println(map[current] + 1);
                    return;
                }

                if (nx >= 1 && nx < size && !visited[nx]) {
                    queue.add(nx);
                    map[nx] = map[current] + 1;
                    visited[nx] = true;
                }
            }

        }
    }
}
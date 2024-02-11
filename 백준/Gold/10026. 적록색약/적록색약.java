import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Node{
    int x,y;
    public Node(int x,int y){
        this.x = x;
        this.y = y;
    }

}


public class Main{

    static char[][] arr;
    static boolean[][] visited;

    static int N;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};



    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        arr = new char[N][N];
        visited = new boolean[N][N];

        for (int i =0; i<N; i++){
            String s = br.readLine();

            for (int j =0; j<N; j++){
                arr[i][j] = s.charAt(j);
            }
        }

        int count = 0;
        for (int i =0; i<N; i++){
            for (int j = 0; j<N; j++){
                if (!visited[i][j]){
                    bfs(i,j,arr[i][j]);
                    count++;
                }
            }
        }

        sb.append(count).append(" ");


        for (int i = 0; i<N; i++){
            for (int j = 0; j<N; j++){
                if (arr[i][j] == 'R'){
                    arr[i][j] = 'G';
                }
            }
        }

        visited = new boolean[N][N];
        count = 0;

        for (int i =0; i<N; i++){
            for (int j = 0; j<N; j++){
                if (!visited[i][j]){
                    bfs(i,j,arr[i][j]);
                    count++;
                }
            }
        }

        sb.append(count);

        System.out.println(sb);

    }

    static void bfs(int x, int y,char color){
        Queue<Node> que = new LinkedList<>();
        que.add(new Node(x,y));
        visited[x][y] = true;

        while (!que.isEmpty()){
           Node now = que.poll();
           for (int i =0; i<4; i++){
               int next_x = now.x + dx[i];
               int next_y = now.y + dy[i];

               if (next_x >= 0 && next_y >= 0 && next_x < N && next_y < N && !visited[next_x][next_y]){
                   if (arr[next_x][next_y] == color){
                       visited[next_x][next_y] = true;
                       que.add(new Node(next_x,next_y));
                   }
               }


           }


        }


    }

}
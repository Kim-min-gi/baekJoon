import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    static boolean[][] visited;
    static int[][] arr;
    static int[] dirX = {0,-1,0,1};
    static int[] dirY = {1,0,-1,0};
    static int count,N,M,X,Y;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++){
            count = 0;
            st = new StringTokenizer(br.readLine());
            X = Integer.parseInt(st.nextToken());
            Y = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            arr = new int[X][Y];
            visited = new boolean[X][Y];

            for (int j = 0; j<M; j++){
                st = new StringTokenizer(br.readLine());
                int bx = Integer.parseInt(st.nextToken());
                int by = Integer.parseInt(st.nextToken());

                arr[bx][by] = 1;
            }

            for (int k = 0; k<X; k++){
                for (int l=0; l<Y; l++){
                    if (!visited[k][l] && arr[k][l] == 1){
                        count++;
                        dfs(k,l);
                    }
                }
            }

            sb.append(count).append('\n');
        }

        System.out.println(sb);
    }


    static void dfs(int x , int y) {
        visited[x][y] = true;

        for (int i = 0; i<4; i++){
            int nowX = dirX[i] + x;
            int nowY = dirY[i] + y;

            if (nowX >= 0 && nowX < X && nowY >= 0 && nowY < Y && !visited[nowX][nowY] && arr[nowX][nowY] == 1){
                dfs(nowX,nowY);
            }

        }


    }

}
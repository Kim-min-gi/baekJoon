import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main{

    static class tomato{
        int x,y,day;

        tomato(int x , int y, int day){
            this.x = x;
            this.y = y;
            this.day = day;
        }

    }

    static int[][] arr;
    static int count,N,M;
    static int[] dirX = {0,0,-1,1};
    static int[] dirY = {-1,1,0,0};
    static Queue<tomato> que = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        arr = new int[N][M];


        for (int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for (int j =0; j<M; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] == 1){
                    que.add(new tomato(i,j,0));
                }
            }
        }

        bfs();

    }

    static void bfs() {
        int day = 0;
        while (!que.isEmpty()) {
            tomato t = que.poll();

            int x = t.x;
            int y = t.y;
            day = t.day;

            for (int i = 0; i < 4; i++) {
                int nextX = x + dirX[i];
                int nextY = y + dirY[i];

                if (nextX >= 0 && nextX < N && nextY >= 0 && nextY < M) {
                    if (arr[nextX][nextY] == 0) {
                        que.add(new tomato(nextX, nextY, day + 1));
                        arr[nextX][nextY] = 1;
                    }

                }
            }
        }
        if (check()){
            System.out.println(day);
        }else{
            System.out.println(-1);
        }
    }

    static boolean check(){
        for (int i = 0; i<N; i++){
            for (int j =0; j<M; j++){
                if (arr[i][j] == 0) return false;
            }
        }
        return true;
    }

}
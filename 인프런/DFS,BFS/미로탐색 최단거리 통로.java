



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



class Point{
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

}


public class Main {

    static int[][] arr= new int[7][7],dis = new int[7][7];
    static int[] dx = {0,1,-1,0};
    static int[] dy = {1,0,0,-1};
    static int answer = 0;

    public static void bfs(int x, int y){
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x,y));
        while (!queue.isEmpty()){
            Point point = queue.poll();
            for (int i =0; i<4; i++){
                int nx = dx[i] + point.x;
                int ny = dy[i] + point.y;

                if (nx >= 0 && nx < 7 && ny >= 0 && ny < 7 && arr[nx][ny] == 0){
                    arr[nx][ny] = 1;
                    queue.offer(new Point(nx,ny));
                    dis[nx][ny] = dis[point.x][point.y] + 1;
                }

            }
        }



    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i =0; i<7; i++){
            st = new StringTokenizer(br.readLine());
            for (int j =0; j<7; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        arr[0][0] = 1;
        bfs(0,0);

        if (dis[6][6] == 0) System.out.println(-1);
        else System.out.println(dis[6][6]);


    }
}
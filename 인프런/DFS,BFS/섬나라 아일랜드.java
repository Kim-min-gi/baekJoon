



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

    static int[] dx = {0,1,0,-1,1,-1,-1,1};
    static int[] dy = {1,0,-1,0,1,1,-1,-1};
    static Queue<Point> queue = new LinkedList<>();
    static int n,m,answer;
    static int[][] arr,board;

    public static void getAnswer(){
        while (!queue.isEmpty()){
            Point point = queue.poll();

            for (int i =0; i<8; i++){
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1){
                    queue.offer(new Point(nx,ny));
                    board[nx][ny] = 0;
                }

            }

        }


    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        board = new int[n][n];

        StringTokenizer st;

        for (int i =0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<n; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i =0; i<n; i++){
            for (int j=0; j<n; j++){
                if (board[i][j] == 1){
                    answer++;
                    queue.offer(new Point(i,j));
                    board[i][j] = 0;
                    getAnswer();
                }
            }
        }

        System.out.println(answer);



    }
}
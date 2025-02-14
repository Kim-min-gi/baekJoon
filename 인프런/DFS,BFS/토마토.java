



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

    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static Queue<Point> queue = new LinkedList<>();
    static int n,m;
    static int[][] arr,borad;


    public static void getAnswer(){

        while (!queue.isEmpty()){
            Point point = queue.poll();
            for (int i=0; i<4; i++){
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];

                if (nx >= 0 && nx <m && ny >= 0 && ny < n && arr[nx][ny] == 0){
                    arr[nx][ny] = 1;
                    queue.offer(new Point(nx,ny));
                    borad[nx][ny] = borad[point.x][point.y] + 1;
                }

            }
        }

    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m][n];
        borad = new int[m][n];

        for (int i =0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            for (int j =0; j<n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 1) queue.offer(new Point(i,j));
            }
        }

        getAnswer();
        boolean flag = true;

        for (int i =0; i<m; i++){
            for (int j =0; j<n; j++){
                if (arr[i][j] == 0) flag = false;
            }
        }

        if (flag){
            int max = Integer.MIN_VALUE;
            int answer = 0;

            for (int i =0; i<m; i++){
                for (int j =0; j<n; j++){
                    answer = Math.max(answer, borad[i][j]);
                }
            }

            System.out.println(answer);

        }else{
            System.out.println(-1);
        }



    }
}
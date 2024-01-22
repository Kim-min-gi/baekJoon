import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    static int arr[][];
    static boolean visit[][];
    static int dirX[] = {0, 0, -1, 1};
    static int dirY[] = {-1, 1, 0, 0};

    static int count = 0;
    static int nowX, nowY, N;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arrayList = new ArrayList<>();

        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        visit = new boolean[N][N];

        for (int i =0; i<N; i++){
            String s = br.readLine();
            for (int j =0; j<N; j++){
                arr[i][j] = s.charAt(j) - '0';
            }
        }

        for (int i = 0; i<N; i++){
            for (int j = 0; j<N; j++){

                if (!visit[i][j] && arr[i][j] == 1){
                    count = 0;
                    dfs(i,j);
                    arrayList.add(count);
                }

            }
        }

        Collections.sort(arrayList);
        sb.append(arrayList.size()).append('\n');
        for (int x : arrayList){
            sb.append(x).append('\n');
        }
        System.out.println(sb);

    }

    static boolean check() {
        return (nowX >= 0 && nowX < N && nowY >= 0 && nowY < N);
    }

    static void dfs(int x , int y) {
        visit[x][y] = true;
        count++;

        for (int i = 0; i<4; i++){
            nowX = dirX[i] + x;
            nowY = dirY[i] + y;

            if (check() && !visit[nowX][nowY] && arr[nowX][nowY] == 1){
                dfs(nowX,nowY);
            }
        }
    }

}
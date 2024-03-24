import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    static String[][] arr = new String[5][5];
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static HashSet<String> set = new HashSet<>();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for (int i = 0; i<5; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j<5; j++){
                arr[i][j] = st.nextToken();
            }
        }

        for (int i = 0; i<5; i++){
            for (int j = 0; j<5; j++){
                dfs(i,j,0,arr[i][j]);
            }
        }

        System.out.println(set.size());

    }

    static void dfs(int i, int j, int cnt, String num){
        if (cnt == 5){
            set.add(num);
            return;
        }

        for (int d = 0; d<4; d++){
            int now_x = i + dx[d];
            int now_y = j + dy[d];

            if (now_x < 0 || now_x >= 5 || now_y < 0 || now_y >= 5){
                continue;
            }

            dfs(now_x,now_y,cnt+1,num + arr[now_x][now_y]);
        }
    }



}
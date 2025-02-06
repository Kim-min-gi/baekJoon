



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;




public class Main {

    static int[][] arr = new int[7][7];
    //    static int[] dx = {1, 0, 0, -1};  // 순서 조정
//    static int[] dy = {0, 1, -1, 0};  // 순서 조정
    static int[] dx = {0,1,-1,0};
    static int[] dy = {1,0,0,-1};
    static int answer = 0;

    public static void dfs(int x, int y){

        if (x == 6 && y == 6){
            answer++;
        }else {
            for (int i = 0; i < 4; i++) {
                int ndx = x + dx[i];
                int ndy = y + dy[i];
                if (ndx >= 0 && ndx < 7 && ndy >= 0 && ndy < 7 && arr[ndx][ndy] == 0) {
                    arr[ndx][ndy] = 1;
                    dfs(ndx, ndy);
                    arr[ndx][ndy] = 0;
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
        dfs(0,0);

        System.out.println(answer);
//        for (int i = 0; i < 7; i++) {
//            for (int j = 0; j < 7; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }


    }
}




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {




    public static int getAnswer(int[][] arr){
        int[] dx = {-1,0,1,0};
        int[] dy = {0,-1,0,1};

        int answer = 0;

        for (int i = 0; i<arr.length; i++){
            for (int j =0; j<arr.length; j++){
                boolean flag = true;
                for (int k=0; k<4; k++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx >= 0 && nx < arr.length && ny >= 0 && ny < arr.length && arr[nx][ny] >= arr[i][j]){
                        flag = false;
                        break;
                    }
                }
                if (flag) answer++;
            }
        }


        return answer;
    }




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        String[] sArr;

        for (int i =0; i<arr.length; i++){
            sArr = br.readLine().split(" ");
            for (int j =0; j<arr.length; j++){
                arr[i][j] = Integer.parseInt(sArr[j]);
            }
        }

        System.out.println(getAnswer(arr));


    }
}
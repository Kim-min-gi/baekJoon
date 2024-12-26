



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {




    public static int getAnswer(int[][] arr){

        int answer = 0;
        int max = Integer.MIN_VALUE;

        for (int i =0; i<arr.length; i++){
            int cnt = 0;
            for (int j =0; j<arr.length; j++){
                if (i == j) continue;
                for (int k=0; k<5; k++){
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }

            if (cnt > max){
                max = cnt;
                answer = i+1;
            }
        }


        return answer;
    }




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][5];
        String[] sArr;

        for (int i =0; i<arr.length; i++){
            sArr = br.readLine().split(" ");
            for (int j =0; j<5; j++){
                arr[i][j] = Integer.parseInt(sArr[j]);
            }
        }

        System.out.println(getAnswer(arr));


    }
}
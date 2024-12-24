import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {



    public static int getAnswer(int[][] arr){
        int answer = 0;
        int sum1 , sum2;

        for (int i =0; i<arr.length; i++){
            sum1 = sum2 = 0;
            for (int j=0; j<arr.length; j++){
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer,sum1);
            answer = Math.max(answer,sum2);
        }


        sum1 = sum2 = 0;
        for (int i =0; i<arr.length; i++){
            sum1 += arr[i][i];
            sum2 += arr[i][arr.length - i - 1];
        }
        answer = Math.max(answer,sum1);
        answer = Math.max(answer,sum2);


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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
    static Integer[][] dp = new Integer[41][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());


        dp[0][0] = 1;	// N=0 일 때의 0 호출 횟수
        dp[0][1] = 0;	// N=0 일 때의 1 호출 횟수
        dp[1][0] = 0;	// N=1 일 때의 0 호출 횟수
        dp[1][1] = 1;	// N=1 일 때의 1 호출 횟수

        // fibonacci(3) = fibonacci(2) + fibonacci(1)의 공식을 이용 하여 점화식 생성
        for(int i=2; i<=40; i++) {
            dp[i][0] = dp[i-1][0] + dp[i-2][0];
            dp[i][1] = dp[i-1][1] + dp[i-2][1];
        }

        for(int i=0; i<T; i++) {
            int idx = Integer.parseInt(br.readLine());
            sb.append(dp[idx][0]).append(" ").append(dp[idx][1]).append('\n');
        }

        System.out.println(sb);



    }



}
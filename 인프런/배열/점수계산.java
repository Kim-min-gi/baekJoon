import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] sArr = br.readLine().split(" ");
        int answer = 0;
        int score = 0;

        for (String s : sArr) {
            score++;
            if (s.equals("0")) score = 0;
            else {
                answer += score;
            }
        }

        System.out.println(answer);

    }
}
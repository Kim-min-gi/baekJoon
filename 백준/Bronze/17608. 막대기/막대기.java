import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int count = 1; // 초기값을 0으로 설정

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int right_max = arr[n - 1]; // 오른쪽에서 가장 높은 봉우리

        // 오른쪽에서 보이는 봉우리의 개수 세기
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > right_max) {
                right_max = arr[i]; // 오른쪽에서 가장 높은 봉우리 업데이트
                count++; // 보이는 봉우리 개수 증가
            }
        }

        System.out.println(count);
    }
}
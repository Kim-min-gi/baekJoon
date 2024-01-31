import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i =0; i<N; i++){

            int M = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();

            for (int j=0; j<M; j++){
                st = new StringTokenizer(br.readLine());
                st.nextToken();

                String key = st.nextToken();

                map.put(key, map.getOrDefault(key,0) + 1);

            }

            int result = 1;

            for (int num : map.values()){
                result *= (num + 1); // 안입은 경우도 생각해야 해서 +1
            }

            //알몸인 상태는 제거해야 하므로 -1
            sb.append(result - 1).append('\n');

        }

        System.out.println(sb);

    }
}
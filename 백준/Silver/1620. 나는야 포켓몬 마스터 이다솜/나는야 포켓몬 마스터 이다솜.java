import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		HashMap<String, Integer> map2 = new HashMap<String, Integer>();
		
		
		for(int i = 1; i <= N; i++) {
			String s = br.readLine();
			map1.put(i, s);
			map2.put(s, i);
		}
		
		for(int i = 0; i < M; i++) {
			String s = br.readLine();
			if(49 <= s.charAt(0) && s.charAt(0) <= 57) {
				sb.append(map1.get(Integer.parseInt(s))).append("\n");
			}else {
				sb.append(map2.get(s)).append("\n");
			}
		}
		System.out.println(sb);
	}

}
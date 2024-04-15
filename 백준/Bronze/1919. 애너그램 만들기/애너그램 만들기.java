import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main{


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();

        int[] c = new int[26];
        int[] d = new int[26];

        for (int i = 0; i < a.length(); i++) {
            c[a.charAt(i) - 'a']++;
        }
        for (int i = 0; i < b.length(); i++) {
            d[b.charAt(i) - 'a']++;
        }
        int cnt = 0;

        for (int i = 0; i < 26; i++) {
            cnt += Math.abs(c[i] - d[i]);
        }

        System.out.println(cnt);

    }

}
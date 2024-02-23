import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main{


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Set<String> set = new HashSet<>();
        set.add("ChongChong");

        for (int i =0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String people = st.nextToken();
            String people2 = st.nextToken();

            if (set.contains(people) || set.contains(people2)) {
                set.add(people);
                set.add(people2);
            }
        }

        System.out.println(set.size());

    }

}
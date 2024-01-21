import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<Integer> aSet = new HashSet<>();
        HashSet<Integer> bSet = new HashSet<>();

        st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()){
            int number = Integer.parseInt(st.nextToken());
            aSet.add(number);
        }

        HashSet<Integer> copyAset = (HashSet<Integer>)aSet.clone();

        st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()){
            int number = Integer.parseInt(st.nextToken());
            bSet.add(number);
        }

        copyAset.removeAll(bSet);
        bSet.removeAll(aSet);

        System.out.println(copyAset.size() + bSet.size());



    }

}
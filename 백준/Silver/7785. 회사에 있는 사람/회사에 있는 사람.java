import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String,String> list = new HashMap<>();

        for(int i =0; i<N; i++){
            String[] s = br.readLine().split(" ");
            if (!list.containsKey(s[0])){
                list.put(s[0],s[1]);
            }else{
                list.remove(s[0]);
            }
        }

        ArrayList<String> arrayList = new ArrayList<>(list.keySet());

        Collections.sort(arrayList,Collections.reverseOrder());

        for (String name : arrayList){
            System.out.println(name);
        }


    }
}
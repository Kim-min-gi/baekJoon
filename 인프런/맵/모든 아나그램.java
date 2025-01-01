import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {




    public static int getAnswer(String s, String t) {
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();

        int length = t.length()-1;
        int lt = 0;
        int count = 0;

        for (char c : t.toCharArray()) map2.put(c,map2.getOrDefault(c,0)+1);


        for (int i =0; i<length; i++){
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
        }

        for (int i= length; i<s.length(); i++){
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
            if (map1.equals(map2)) count++;
            map1.put(s.charAt(lt),map1.getOrDefault(s.charAt(lt),0)-1);
            if (map1.get(s.charAt(lt)) == 0) map1.remove(s.charAt(lt));
            lt++;
        }



        return count;
    }







    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();


        System.out.println(getAnswer(s,t));
    }
}
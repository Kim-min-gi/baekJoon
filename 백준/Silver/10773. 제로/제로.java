import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i< num; i++){
            int number = Integer.parseInt(br.readLine());
            if(number != 0) {
                list.add(number);
            }else{
                list.remove(list.size()-1);
            }

        }

        if(list.size() != 0){
            int sum = 0;
            for(int i =0; i<list.size(); i++){
                sum+= list.get(i);
            }
            System.out.println(sum);
        }else{
            System.out.println(0);
        }



    }

}
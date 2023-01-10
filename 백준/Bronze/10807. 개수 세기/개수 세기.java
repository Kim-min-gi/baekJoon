import java.util.StringTokenizer;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i =0; i<size; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int search = Integer.parseInt(br.readLine());
        
        for(int j=0; j<arr.length; j++){
            if(arr[j] == search){
                count++;
            }
        }
        
        System.out.println(count);
        br.close();
        
    }
}
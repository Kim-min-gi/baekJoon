import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];

        for(int i =0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
         
        int max = 0;
        int indexNum = 0;
        for(int j = 0; j<arr.length; j++){
            if(arr[j] > max){
                max = arr[j];
                indexNum = j+1;
            }
        }
        
        System.out.println(max);
        System.out.println(indexNum);
        
    }
}
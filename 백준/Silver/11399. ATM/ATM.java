import java.util.*;

public class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        int sum =0;
        int waiting =0;
        
        for(int j=0; j<arr.length; j++){
            sum += arr[j];
            waiting += sum;
        }
        
        System.out.println(waiting);
        
    }
    
    
}
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] list = new int[a];
        
        for(int i =0; i<a; i++){
            list[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = a - 1; i >= 0; i--){
            if(list[i] <= b){
                count += (b / list[i]);
				b = b % list[i];
            }
        }
        
        System.out.println(count);
    }
    
    
    
}
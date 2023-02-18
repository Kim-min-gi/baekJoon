import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[26];
        String s = br.readLine();
        
        for(int i=0; i<s.length(); i++){
            if('a' <= s.charAt(i) && s.charAt(i) <= 'z'){
                arr[s.charAt(i) - 'a']++;
            }else{
                arr[s.charAt(i) - 'A']++;
            } 
        }
        int max = -1;
        char c= '?';
        
        for(int i=0; i< 26; i++){
            if(arr[i] > max){
                max = arr[i];
                c = (char)(i+65); 
            }else if(arr[i] == max){
                c = '?';
            }
        }
        
        System.out.println(c);
    }
}
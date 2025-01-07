



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



class Person{
    int id;
    int priority;

    public Person(int id,int priority){
        this.id = id;
        this.priority = priority;
    }
}


public class Main {


    public static void getAnswer(int[] arr) {
        for (int i =1; i<arr.length; i++){
            int temp = arr[i];
            int j = i-1;
            while (j >=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = temp;

        }


    }







    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         st = new StringTokenizer();
        int n = Integer.parseInt(br.readLine());


        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        int index = 0;
        while (st.hasMoreTokens()){
            arr[index++] = Integer.parseInt(st.nextToken());
        }

        getAnswer(arr);

        for (int a : arr){
            System.out.print(a + " ");
        }
    }
}




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

        int temp;
        for (int i=0; i<arr.length - 1; i++){
            for (int j=1; j<arr.length - i; j++){
                if (arr[j] < arr[j-1]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }

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
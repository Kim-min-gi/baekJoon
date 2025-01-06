



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
        int minIndex;
        int temp;
        for (int i=0; i<arr.length - 1; i++){
            minIndex = i;
            for (int j=i+1; j<arr.length; j++){
                if (arr[j] < arr[minIndex]) minIndex = j;
            }

            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

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
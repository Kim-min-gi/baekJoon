



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


    public static int getAnswer(int n,int m,int[] arr) {
        Queue<Person> queue = new LinkedList<>();
        int answer = 1;

        for (int i =0; i<n; i++){
            queue.offer(new Person(i,arr[i]));
        }

        while (!queue.isEmpty()){
            Person temp = queue.poll();
            for (Person x : queue){
                if (x.priority > temp.priority){
                    queue.offer(temp);
                    temp = null;
                    break;
                }
            }

            if (temp!= null){
                if (temp.id == m) return answer;
                else answer++;
            }
        }




        return answer;
    }







    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        int index = 0;
        while (st.hasMoreTokens()){
            arr[index++] = Integer.parseInt(st.nextToken());
        }


        System.out.println(getAnswer(n,m,arr));
    }
}
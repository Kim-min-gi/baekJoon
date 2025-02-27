



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Lecture implements Comparable<Lecture>{
    int money;
    int time;

    public Lecture(int money,int time){
        this.money = money;
        this.time = time;
    }

    @Override
    public int compareTo(Lecture o) {
        return o.time - this.time;
    }
}



public class Main {

    static int n,max = Integer.MIN_VALUE;

    public static int getAnswer(ArrayList<Lecture> list){
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;
        Collections.sort(list);

        int j = 0;
        for (int i = max; i>=1; i--){
            for (; j<n; j++){
                if (list.get(j).time < i) break;
                que.offer(list.get(j).money);
            }
            if (!que.isEmpty()) answer += que.poll();
        }

        return answer;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        ArrayList<Lecture> list = new ArrayList<>();
        StringTokenizer st;

        for (int i =0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int money = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());
            list.add(new Lecture(money,time));
            if (time>max) max = time;
        }


        System.out.println(getAnswer(list));



    }
}
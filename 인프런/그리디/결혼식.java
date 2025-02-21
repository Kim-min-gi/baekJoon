



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



class Time implements Comparable<Time>{
    int time;
    int state;

    public Time(int t,int s){
        this.time = t;
        this.state = s;
    }

    @Override
    public int compareTo(Time o) {
        if (o.time == this.time) return this.state - o.state;
        return this.time - o.time;
    }
}


public class Main {


    public static int getAnswer(ArrayList<Time> list){
        Collections.sort(list);
        int count = 0;
        int answer = Integer.MIN_VALUE;
        for (Time b : list){
            if (b.state == 's'){
                count++;
            }else count--;
            answer = Math.max(answer,count);
        }

        return answer;

    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Time> list = new ArrayList<>();
        StringTokenizer st;

        for (int i =0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int t2 = Integer.parseInt(st.nextToken());
            list.add(new Time(t,'s'));
            list.add(new Time(t2,'e'));
        }


        System.out.println(getAnswer(list));


    }
}
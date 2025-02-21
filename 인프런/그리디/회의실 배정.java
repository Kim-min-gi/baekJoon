



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



class Time implements Comparable<Time>{
    int s;
    int e;

    public Time(int s,int e){
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(Time o) {
        if (o.e == this.e) return this.s - o.s;
        return this.e - o.e;
    }
}


public class Main {


    public static int getAnswer(ArrayList<Time> list){
        Collections.sort(list);
        int emdTime = 0;
        int answer = 0;
        for (Time b : list){
            if (b.s >= emdTime){
                answer++;
                emdTime = b.e;
            }
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
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            list.add(new Time(s,e));
        }


        System.out.println(getAnswer(list));


    }
}
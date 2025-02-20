



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



class Body implements Comparable<Body>{
    int h;
    int w;

    public Body(int h,int w){
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Body o) {
        return o.h - this.h;
    }
}


public class Main {


    public static int getAnswer(ArrayList<Body> list){
        Collections.sort(list);
        int max = Integer.MIN_VALUE;
        int answer = 0;
        for (Body b : list){
            if (b.w > max){
                answer++;
                max = b.w;
            }
        }

        return answer;

    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Body> list = new ArrayList<>();
        StringTokenizer st;

        for (int i =0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            list.add(new Body(h,w));
        }


        System.out.println(getAnswer(list));


    }
}
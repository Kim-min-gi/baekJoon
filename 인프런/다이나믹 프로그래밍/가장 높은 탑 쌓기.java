



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



class Break implements Comparable<Break>{
    int x;
    int y;
    int w;

    public Break(int x, int y, int w){
        this.x = x;
        this.y = y;
        this.w = w;
    }

    @Override
    public int compareTo(Break o) {
        return o.x - this.x;
    }
}


public class Main {

    static int[] dis;

    public static int getAnswer(ArrayList<Break> list){
        int answer = 0;
        Collections.sort(list);
        dis[0] = list.get(0).y;
        answer = dis[0];

        for (int i = 1; i<list.size(); i++){
            int max = 0;
            for (int j=i-1; j>=0; j--){
                if(list.get(j).w > list.get(i).w && dis[j] > max) max = dis[j];
            }
            dis[i] = max + list.get(i).y;
            answer = Math.max(answer,dis[i]);
        }

        return answer;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st;
        ArrayList<Break> list = new ArrayList<>();
        dis = new int[num];

        for (int i =0; i<num; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            list.add(new Break(x,y,w));
        }

        System.out.println(getAnswer(list));

    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



class Point{
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}


public class Main {

    //    static int[] dx = {0,1,0,-1,1,-1,-1,1};
//    static int[] dy = {1,0,-1,0,1,1,-1,-1};
    static int n,m,length,answer = Integer.MAX_VALUE;
    //    static int[][] arr,board;
    static int[] combi;
    static ArrayList<Point> hs,pz;

    public static void getAnswer(int L,int s){
        if (L == m){
            int sum = 0;
            for (Point house : hs){
                int dis = Integer.MAX_VALUE;
                for (int num : combi) {
                    dis = Math.min(dis,Math.abs(house.x-pz.get(num).x) + Math.abs(house.y-pz.get(num).y));
                }
                sum += dis;
            }
            answer = Math.min(answer,sum);
        }else{
            for (int i=s; i<length; i++){
                combi[L] = i;
                getAnswer(L+1,i+1);
            }
        }

    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        hs = new ArrayList<>();
        pz = new ArrayList<>();


        for (int i =0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<n; j++){
                int num = Integer.parseInt(st.nextToken());
                if (num == 1) hs.add(new Point(i,j));
                else if (num == 2) pz.add(new Point(i,j));
            }
        }

        length = pz.size();
        combi = new int[m];
        getAnswer(0,0);


        System.out.println(answer);



    }
}
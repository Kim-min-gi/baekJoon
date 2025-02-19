



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

    static int[] arr,dis;

    public static int getAnswer(){
        int answer = 0;
        dis[0] = 1;

        for (int i = 1; i<arr.length; i++){
            int max = 0;
            for (int j = i -1; j>=0; j--){
                if (arr[j] < arr[i] && dis[j] > max) max = dis[j];
            }
            dis[i] = max + 1;
            answer = Math.max(answer,dis[i]);
        }

        return answer;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        arr = new int[num];
        dis = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine());

        int index = 0;
        while (st.hasMoreTokens()){
            arr[index++] = Integer.parseInt(st.nextToken());
        }

        System.out.println(getAnswer());


    }
}
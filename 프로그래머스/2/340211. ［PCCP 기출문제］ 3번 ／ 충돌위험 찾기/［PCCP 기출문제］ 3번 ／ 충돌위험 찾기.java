import java.util.*;
class Solution {
    
    static Queue<int[]>[] recodes;
    static int n;
    static int result;



    public static void recoding(int[][] points, int[][] routes){
        for (int i=0; i<n; i++){

            int[] route = routes[i];
            int x = points[route[0] - 1][1];
            int y = points[route[0] - 1][0];


            recodes[i].add(new int[]{x,y});

            for (int j =1; j< route.length; j++){
                int px = points[route[j] - 1][1];
                int py = points[route[j] - 1][0];

                while (py != y){
                    if (py > y) y++;
                    else y--;

                    recodes[i].add(new int[]{x,y});
                }

                while (px != x){
                    if (px > x) x++;
                    else x--;

                    recodes[i].add(new int[]{x,y});
                }

            }



        }
    }


    public static void dangerousCounting(){
        int count = 0;

        while (count < n){
            int[][] map = new int[101][101];
            count = 0;


            for (int i =0; i<n; i++){
                if (recodes[i].isEmpty()){
                    count++;
                    continue;
                }

                int[] temp = recodes[i].poll();
                map[temp[0]][temp[1]]++;
            }

            for (int i = 0; i < 101; i++) {
                for (int j = 0; j < 101; j++) {
                    if (map[i][j] > 1) result++;
                }
            }
        }

    }
    
    public int solution(int[][] points, int[][] routes) {
         n = routes.length;
        recodes = new LinkedList[n];

        for (int i = 0; i < n; i++) {
            recodes[i] = new LinkedList<>();
        }

        recoding(points, routes);

        dangerousCounting();

        return result;
    }
}
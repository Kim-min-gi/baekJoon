
import java.util.*;
import java.io.*;

public class Main {
	//그림 좌표 관련 클래스
    static class position{
        int x,y;
        public position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static int N;
    static char[][] art;	
    static boolean[][] visited;	
    static int[] dx = {0,0,-1,1};	
    static int[] dy = {-1,1,0,0};	
    static public void  main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        art = new char[N][N];
        for(int i=0;i<N;i++){
            String str = br.readLine();
            for(int j=0;j<N;j++)
                art[i][j] = str.charAt(j);
        }
        bw.write(search() + " ");	
        colorChange();		
        bw.write(search() + "\n");	
        bw.flush();		//결과 출력
        bw.close();
        br.close();
    }
    static int search(){
        visited = new boolean[N][N];
        int count = 0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(!visited[i][j]){
                    bfs(j,i,art[i][j]);
                    count++;
                }
            }
        }
        return count;
    }
    static void bfs(int x, int y, char color){
        Queue<position> queue = new LinkedList<>();
        visited[y][x] = true;
        queue.add(new position(x,y));
        while(!queue.isEmpty()){
            position cur = queue.poll();
            for(int i=0;i<4;i++){
                int tempX = cur.x + dx[i];
                int tempY = cur.y + dy[i];
                if(tempX>=0 && tempY>=0 && tempX<N && tempY<N && !visited[tempY][tempX]){
                    if(art[tempY][tempX] == color){
                        visited[tempY][tempX] = true;
                        queue.add(new position(tempX,tempY));
                    }
                }
            }
        }

    }
    static void colorChange() {
        for (int i = 0; i < N; i++) {
            for(int j=0;j<N;j++){
                if(art[i][j] == 'R')
                    art[i][j] = 'G';
            }
        }
    }
}
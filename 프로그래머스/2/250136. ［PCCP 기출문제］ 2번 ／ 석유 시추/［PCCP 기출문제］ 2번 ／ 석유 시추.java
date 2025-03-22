import java.util.*;

class Solution {
    
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static int[] sum;
    static int[][] visited;

    
    class Point{
         int x;
         int y;
        
        Point(int x, int y){
          this.x = x;
          this.y = y;
        }
        
    };
    
    
    public void BFS(int[][] land){
        Queue<Point> que = new LinkedList<>();
        int x = land.length;
        int y = land[0].length;
        int nx,ny,count;
        boolean in[];
        
        for(int i =0; i<x; i++){
            for(int j=0; j<y; j++){
                if(visited[i][j] == 0 && land[i][j] == 1){
                    in = new boolean[y];
                    
                    que.add(new Point(i,j));
                    visited[i][j] = 1;
                    in[j] = true;
                    count = 1;
                    
                    while(!que.isEmpty()){
                        Point np = que.poll();
                        
                        for(int k =0; k<4; k++){
                            nx = np.x + dx[k];
                            ny = np.y + dy[k];
                            
                            if(nx >= 0 && nx < x && ny >= 0 && ny < y){
                                if(visited[nx][ny] == 0 && land[nx][ny] == 1){
                                    visited[nx][ny] = 1;
                                    que.add(new Point(nx,ny));
                                    in[ny] = true;
                                    count++;
                                }
                            }
                            
                        }
                        
                    }
                    
                    for(int k =0; k<y; k++){
                        if(in[k]) sum[k] += count; 
                    }
                    
                }
            }
        }
        
        
    }
    
    
    public int solution(int[][] land) {
        int answer = 0;
        int x = land.length;
        int y = land[0].length;
        
        
        sum = new int[y];
        visited = new int[x][y];
        
        BFS(land);
        
        for(int i = 0; i<sum.length; i++) answer = Math.max(answer,sum[i]);
        
        
        return answer;
    }
}
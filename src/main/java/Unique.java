import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public boolean hasPath(int[][] maze, int[] start, int[] dest) {

        int[][] d = {{-1,0}, {1,0},{0,-1},{0,1}};
        boolean[][] visited = new boolean[maze.length][maze[0].length];

        Queue<int[]> q = new LinkedList<>();
        q.offer(start);
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            if(cur[0]==dest[0] && cur[1]== dest[1]){return true;}

            for(int[] a : d){
                int x = cur[0]+a[0];
                int y = cur[1]+a[1];
                while(x<maze.length && y<maze[0].length && x>0&&y>0 && maze[x][y]==0){
                    x += a[0];
                    y += a[1];
                }

                if(!visited[x-a[0]][y-a[1]]){
                    q.add(new int[] {x-a[0], y -a[0]});
                    visited[x-a[0]][y-a[1]] = true;
                }
            }

        }

        return false;
    }

}

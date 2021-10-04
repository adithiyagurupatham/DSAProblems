/**
Program to find the time required to make all the good oranges as rotten
Link : https://practice.geeksforgeeks.org/problems/rotten-oranges2536/1
Time Complexity : O(M*N)
Space Complexity : O(M*N)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class RottenOranges{

  static class Ele
    {
        int x;
        int y;
        int time;

        Ele(int _x,int _y,int _time)
        {
            x = _x;
            y = _y;
            time = _time;
        }
    }

    static int orangesRotting(int[][] grid)
    {
        // Code here
        int count=0,rot=0,row=grid.length,col=grid[0].length,max = Integer.MIN_VALUE;
        Queue<Ele> q = new LinkedList<>();
        int[] dx = new int[]{1,0,-1,0};
        int[] dy = new int[]{0,-1,0,1};
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]!=0)
                {
                    count++;
                }
                if(grid[i][j]==2)
                {
                    Ele ele = new Ele(i,j,0);
                    q.add(ele);
                }
            }
        }
        while(!q.isEmpty())
        {
            Ele ele = q.remove();
            rot++;
            int x = ele.x;
            int y = ele.y;
            int time = ele.time;
            max = Math.max(max,time);
            for(int i=0;i<4;i++)
            {
                int newX = x+dx[i];
                int newY = y+dy[i];
                if(newX>=0 && newX<row && newY>=0 && newY<col && grid[newX][newY]==1)
                {
                   grid[newX][newY] = 2;
                   q.add(new Ele(newX,newY,time+1));
                }
            }
        }
        if(count==rot)
        {
            return max;
        }
        return -1;


    }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the row count");
    Integer row = Integer.valueOf(br.readLine());
    System.out.println("Enter the column count");
    Integer col = Integer.valueOf(br.readLine());
    int[][] matrix = new int[row][col];
    System.out.println("Enter the elements");
    String[] inputString;
    for(int i=0;i<row;i++){
      inputString = br.readLine().split(" ");
      for(int j=0;j<col;j++){
        matrix[i][j] =  Integer.valueOf(inputString[j]);
      }
    }
    System.out.println("The min time required for rotting is  " +orangesRotting(matrix));
  }
}

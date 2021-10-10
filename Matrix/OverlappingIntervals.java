/**
Program to rotate the matrix in anti-clockwise direction
Link : https://practice.geeksforgeeks.org/problems/rotate-by-90-degree-1587115621/1/
Time Complexity : O(NlogN)
Space Complexity : O(N)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
public class OverlappingIntervals{

  static int[][] overlappedInterval(int[][] intervals)
    {
        ArrayList<int[]> list = new ArrayList<>();
        if(intervals==null || intervals.length==0)
        {
            return intervals;
        }
        Arrays.sort(intervals,(a,b) -> a[0]-b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int[] each : intervals)
        {
            if(end>=each[0])
            {
                end = Math.max(end,each[1]);
            }
            else
            {
                list.add(new int[]{start,end});
                start = each[0];
                end = each[1];
            }
        }
        list.add(new int[]{start,end});
        return list.toArray(new int[0][]);

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
    int[][] ans = overlappedInterval(matrix);
    System.out.println("Post rotation the array becomes " +Arrays.deepToString(ans));
  }
}

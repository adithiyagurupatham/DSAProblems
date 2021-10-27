/**
Program to find the count of unique paths to the destination
Link : https://practice.geeksforgeeks.org/problems/number-of-unique-paths5339/1
Time Complexity : O(row*col)
Space Complexity : O(row*col)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class UniquePathCountOptimal{

  static int findPathCount(int[][] dp){
        int row = dp.length,col = dp[0].length;
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[row-1][col-1];
    }

  static int numberOfPath(int a, int b)
    {
      int[][] dp = new int[a][b];
      for(int i=0;i<a;i++){
          dp[i][0]=1;
      }
      for(int i=0;i<b;i++){
          dp[0][i]=1;
      }
      return findPathCount(dp);
    }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the row count");
    Integer row = Integer.valueOf(br.readLine());
    System.out.println("Enter the column count");
    Integer col = Integer.valueOf(br.readLine());
    System.out.println("The number of unique path is "+numberOfPath(row, col));
  }
}

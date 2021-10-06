/**
Program to find the minimum number of operations required to change string 'a' to string 'b'
Link : https://practice.geeksforgeeks.org/problems/edit-distance3702/1
Time Complexity : O(M*N)
Space Complexity : O(M*N)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class EditDistance{
  static int editDistance(String s, String t) {
        if(s.equals(t))
        {
            return 0;
        }
        int[][] dp = new int[s.length()+1][t.length()+1];
        for(int[] r : dp)
        {
            Arrays.fill(r,-1);
        }
        for(int i=0;i<dp.length;i++)
        {
            dp[i][0]=i;
        }
        for(int i=0;i<dp[0].length;i++)
        {
            dp[0][i]=i;
        }

        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {

                if(s.charAt(i-1)==t.charAt(j-1))
                {
                    dp[i][j] = dp[i-1][j-1];

                }
                else
                {
                    dp[i][j] = 1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                }
            }
        }
        return dp[s.length()][t.length()];
    }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the first string");
    String s = br.readLine();
    System.out.println("Enter the second string");
    String t = br.readLine();
    System.out.println("The minimum cost required is "+editDistance(s, t));
  }
}

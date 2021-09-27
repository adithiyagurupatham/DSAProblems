/**
Program to find the longest distinct substring
Link : https://practice.geeksforgeeks.org/problems/longest-distinct-characters-in-string5848/0/
Time Complexity : O(N^2)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class LongestDistinctSubstringOptimal{

  static int longestSubstrDistinctChars(String str){
        int ans=0;
        boolean[] visited = new boolean[256];
        for(int i=0;i<str.length();i++)
        {
            for(int j=i;j<str.length();j++)
            {
                if(visited[str.charAt(j)])
                {
                    break;
                }
                ans = Math.max(ans,j-i+1);
                visited[str.charAt(j)] = true;
            }
            Arrays.fill(visited,false);
        }
        return ans;
    }

  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the  string");
      String str = br.readLine();
      System.out.println("The longest distinct substring is  "+ longestSubstrDistinctChars(str));
  }

}

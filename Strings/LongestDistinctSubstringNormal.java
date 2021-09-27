/**
Program to find the longest distinct substring
Link : https://practice.geeksforgeeks.org/problems/longest-distinct-characters-in-string5848/0/
Time Complexity : O(N^3)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class LongestDistinctSubstringNormal{

  static boolean isDistinct(String str,int i,int j)
    {
        boolean[] visited = new boolean[256];
        for(int k=i;k<=j;k++)
        {
            if(visited[str.charAt(k)])
            {
                return false;
            }
            visited[str.charAt(k)] = true;
        }
        return true;
    }

    static int longestSubstrDistinctChars(String str){
        int ans=0;
        for(int i=0;i<str.length();i++)
        {
            for(int j=i;j<str.length();j++)
            {
                if(isDistinct(str,i,j))
                {
                    ans = Math.max(ans,j-i+1);
                }
            }
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

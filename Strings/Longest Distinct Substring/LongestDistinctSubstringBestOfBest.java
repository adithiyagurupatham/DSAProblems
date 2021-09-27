/**
Program to find the longest distinct substring
Link : https://practice.geeksforgeeks.org/problems/longest-distinct-characters-in-string5848/0/
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;
public class LongestDistinctSubstringBestOfBest{

  static int longestSubstrDistinctChars(String str){
        int ans=0;
        Map<Character,Integer> map = new HashMap<>();
        for(int l=0,r=0;r<str.length();r++)
        {
            if(map.containsKey(str.charAt(r)) && map.get(str.charAt(r)) >=l)
            {
                l = map.get(str.charAt(r))+1;
            }
            map.put(str.charAt(r),r);
            ans = Math.max(ans,r-l+1);
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

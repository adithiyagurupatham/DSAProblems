/**
Program to find the longest distinct substring
Link : https://practice.geeksforgeeks.org/problems/longest-distinct-characters-in-string5848/0/
Time Complexity : O(2*N)
Space Complexity : O(N)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.HashSet;
public class LongestDistinctSubstringBest{

  static int longestSubstrDistinctChars(String str){
        int ans=0;
        Set<Character> set = new HashSet<>();
        for(int l=0,r=0;r<str.length();r++)
        {
            if(set.contains(str.charAt(r)))
            {
                while(l<=r && set.contains(str.charAt(r)))
                {
                    Character c = str.charAt(l);
                    set.removeIf(each -> each.equals(c));
                    l++;
                }
                set.add(str.charAt(r));
            }
            else
            {
                set.add(str.charAt(r));
                ans = Math.max(ans,r-l+1);
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

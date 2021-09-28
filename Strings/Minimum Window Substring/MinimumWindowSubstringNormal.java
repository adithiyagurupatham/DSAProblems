/**
Program to minimum length substring which contains all characters of pattern
Link : https://practice.geeksforgeeks.org/problems/longest-distinct-characters-in-string5848/0/
Time Complexity : O(N^2)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class MinimumWindowSubstringNormal{

  static boolean isPresent(int[] count,int[] pat)
    {
        for(int i=0;i<256;i++)
        {
            if(count[i]<pat[i]){
                return false;
            }
        }
        return true;
    }

   static String smallestWindow(String s, String p)
    {
        int[] pat = new int[256];
        int[] count = new int[256];
        int min = Integer.MAX_VALUE;
        int minI = Integer.MAX_VALUE;
        int minJ = Integer.MAX_VALUE;
        for(int i=0;i<p.length();i++)
        {
            pat[p.charAt(i)]++;
        }
        for(int i=0;i<=s.length()-p.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                count[s.charAt(j)]++;
                if(isPresent(count,pat))
                {
                    if((j-i+1)<min)
                    {
                        minI = i;
                        minJ = j;
                        min = j-i+1;
                    }
                }
            }
            Arrays.fill(count,0);
        }
        return (min== Integer.MAX_VALUE)?"-1":s.substring(minI,minJ+1);
    }

  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the  string");
      String str = br.readLine();
      System.out.println("Enter the pattern");
      String pat = br.readLine();
      System.out.println("The minimum window substring is  "+smallestWindow(str, pat) );
  }

}

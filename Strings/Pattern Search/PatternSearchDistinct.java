/**
Program to chekc if the distinct pattern is existing in the text or not
Link : https://practice.geeksforgeeks.org/problems/distinct-pattern-search-1587115620/1/
Time Complexity : O(m+n)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class PatternSearchDistinct{
  static boolean search(String pat, String txt)
    {
        int m = txt.length();
        int n = pat.length();
        for(int i=0;i<=m-n;){
            int j;
            for(j=0;j<n;j++){
                if(pat.charAt(j)!=txt.charAt(i+j))
                {
                    break;
                }
            }
            if(j==n){
                return true;
            }
            if(j==0)
            {
                i++;
            }
            else{
                i+=j;
            }
        }
        return false;
    }

  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the search text");
      String txt = br.readLine();
      System.out.println("Enter the pattern");
      String pat = br.readLine();
      System.out.println("The pattern existence in search text is "+search(pat, txt));
  }

}

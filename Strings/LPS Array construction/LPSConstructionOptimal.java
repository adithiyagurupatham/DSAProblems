/**
Program to construct the LPS array of the given String
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class LPSConstructionOptimal{

  static int[] constructLPS(String str,int n)
    {
      int[] lps = new int[n];
      int i=1,len=0;
      while(i<n)
      {
          if(str.charAt(i)==str.charAt(len))
          {
            len++;
            lps[i]=len;
            i++;
          }
          else if(len==0)
          {
            lps[i] = 0;
            i++;
          }
          else
          {
            len = lps[len-1];
          }
      }
      return lps;
    }

  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the text");
      String str = br.readLine();
      int[] lps = constructLPS(str, str.length());
      System.out.println("The LPS array is  "+Arrays.toString(lps));
  }

}

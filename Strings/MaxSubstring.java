/**
Program to find the maximum difference of zero count and one count subarray
Link : https://practice.geeksforgeeks.org/problems/maximum-difference-of-zeros-and-ones-in-binary-string4111/1#
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class MaxSubstring{

  static int maxSubstring(String s) {
        int max = 0,val =0;
        for(int i=0;i<s.length();i++)
        {
            int x = (s.charAt(i)=='0')?1:-1;
            val = Math.max(x,val+x);
            max = Math.max(max,val);
        }
        if(max==0)
        {
            return -1;
        }
        return max;

    }

  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the  string");
      String str = br.readLine();
      System.out.println("The maximum length substring is  "+ maxSubstring(str));
  }

}

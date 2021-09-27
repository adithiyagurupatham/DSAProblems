/**
Program to find the total number of steps required make the string follow the rules
Link : https://practice.geeksforgeeks.org/problems/the-modified-string-1587115621/1/
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class ModifiedString{

  static long modified(String s)
    {
        long ans=0,freq=1;
        if(s.length()<=2){
            return ans;
        }
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i) == s.charAt(i-1))
            {
                freq++;
            }
            else if(s.charAt(i) != s.charAt(i-1) && freq<3)
            {
                freq=1;
            }
            if(freq==3)
            {
               freq=1;
               ans++;
            }
        }
        return ans;
    }

  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the  string");
      String str = br.readLine();
      System.out.println("The required count is  "+ modified(str));
  }

}

/**
Program to check if both the strings are Isomorphic or not
Link : https://practice.geeksforgeeks.org/problems/isomorphic-strings-1587115620/1/
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class IsomorphicString{

  static boolean areIsomorphic(String str1,String str2)
    {
        int[] count = new int[256];
        int[] secCount = new int[256];
        if(str1.length()!=str2.length())
        {
            return false;
        }
        for(int i=0;i<str1.length();i++)
        {
            char c = str1.charAt(i);
            char d = str2.charAt(i);
            if(count[c]!=secCount[d])
            {
                return false;
            }
            count[c] = i+1;
            secCount[d] = i+1;
        }
        return true;


    }

  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the first string");
      String firString = br.readLine();
      System.out.println("Enter the second string");
      String secString = br.readLine();
      System.out.println("The isomorphic status is  "+areIsomorphic(firString, secString));
  }

}

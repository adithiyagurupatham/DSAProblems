/**
Program to check if the given string is Panagram or not
Link : https://practice.geeksforgeeks.org/problems/pangram-checking-1587115620/1/
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Panagram{

  static boolean checkPangram(String str) {
        int[] count = new int[256];
        for(int i=0;i<str.length();i++)
        {
            if(Character.isUpperCase(str.charAt(i))){
                count[Character.toLowerCase(str.charAt(i))]++;
            }
            else
            {
                count[str.charAt(i)]++;
            }
        }
        for(int i=97;i<=122;i++)
        {
            if(count[i]==0)
            {
                return false;
            }
        }
        return true;
    }

  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the  string");
      String str = br.readLine();
      System.out.println("The panagram status of the string is  "+ checkPangram(str));
  }

}

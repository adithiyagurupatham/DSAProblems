/**
Program to check if  the given string is Isogram or not
Link : https://practice.geeksforgeeks.org/problems/check-if-a-string-is-isogram-or-not-1587115620/1/
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class IsogramString{

  static boolean isIsogram(String data){
        int[] count = new int[256];
        for(int i=0;i<data.length();i++)
        {
            if(count[data.charAt(i)]>0)
            {
                return false;
            }
            count[data.charAt(i)]++;
        }
        return true;
    }

  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the  string");
      String str = br.readLine();
      System.out.println("The isomorphic status is  "+ isIsogram(str));
  }

}

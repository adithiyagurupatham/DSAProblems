/**
Program to check if one string is the rotation of other string
Link : https://practice.geeksforgeeks.org/problems/check-if-strings-are-rotations-of-each-other-or-not-1587115620/1/
Time Complexity : O(N^2)
Space Complexity : O(N)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class RotationCheckerNormal{

  static boolean areRotations(String s1, String s2 )
  {
      for(int i=0;i<s1.length();i++)
      {
          StringBuilder sb = new StringBuilder(s1.substring(i));
          for(int j=0;j<i;j++)
          {
              sb.append(s1.charAt(j));
          }
          if(sb.toString().equals(s2)){
              return true;
          }
      }
      return false;
  }

  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the  text");
      String str = br.readLine();
      System.out.println("Enter the other text");
      String x = br.readLine();
      System.out.println("The rotation checker status is  "+areRotations(str,x));
  }

}

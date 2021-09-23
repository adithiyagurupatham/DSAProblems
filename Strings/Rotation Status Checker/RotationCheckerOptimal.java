/**
Program to check if one string is the rotation of other string
Link : https://practice.geeksforgeeks.org/problems/check-if-strings-are-rotations-of-each-other-or-not-1587115620/1/
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class RotationCheckerOptimal{

  static boolean areRotations(String s1, String s2 )
  {
    if(s1.length()!=s2.length()){
          return false;
      }
      return (s1+s1).indexOf(s2)>=0;
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

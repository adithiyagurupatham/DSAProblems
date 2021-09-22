/**
Program to implement the strstr function
Link : https://practice.geeksforgeeks.org/problems/implement-strstr/1/
Time Complexity : O(m+n)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class strstrImplementationNormal{

  static int strstr(String s, String x)
    {
       return s.indexOf(x);
    }

  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the  text");
      String str = br.readLine();
      System.out.println("Enter the other text");
      String x = br.readLine();
      System.out.println("The index of occurance is "+strstr(str,x));
  }

}

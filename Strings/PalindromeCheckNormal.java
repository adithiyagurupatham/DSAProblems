/**
Program to chekc if the given string is palindrome or not
Link : https://practice.geeksforgeeks.org/problems/palindrome-string0817/1#
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
public class PalindromeCheckNormal{

  static boolean isPalindrome(String S) {
        // code here
        StringBuilder sb = new StringBuilder(S);
        sb.reverse();
        if(sb.toString().equals(S)){
            return true;
        }
        return false;
    }

  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the string");
      String str = br.readLine();
      System.out.println("The palindrome check is "+isPalindrome(str));
  }

}

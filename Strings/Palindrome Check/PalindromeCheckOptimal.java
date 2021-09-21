/**
Program to chekc if the given string is palindrome or not
Link : https://practice.geeksforgeeks.org/problems/palindrome-string0817/1#
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
public class PalindromeCheckOptimal{

  static boolean isPalindrome(String S) {
        int i=0,j=S.length()-1;
        while(i<j)
        {
            if(S.charAt(i)!=S.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the string");
      String str = br.readLine();
      System.out.println("The palindrome check is "+isPalindrome(str));
  }

}

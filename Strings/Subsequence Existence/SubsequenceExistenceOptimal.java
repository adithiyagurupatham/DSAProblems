/**
Program to check if the string is a subSequence of another
Link : https://practice.geeksforgeeks.org/problems/given-two-strings-find-if-first-string-is-a-subsequence-of-second/1/
Time Complexity : O(M+N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
public class SubsequenceExistenceOptimal{


  static boolean isSubSequence(String A, String B)
    {
        int i=0,j=0;
        while(i<B.length() && j<A.length()){
            if(B.charAt(i) == A.charAt(j)){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        return (j==A.length());
    }


  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the substring text");
      String subString = br.readLine();
      System.out.println("Enter the original text");
      String str = br.readLine();
      System.out.println("The subSequence existence status is "+isSubSequence(subString, str));
  }

}

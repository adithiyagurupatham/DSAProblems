/**
Program to check if the string is a subSequence of another
Link : https://practice.geeksforgeeks.org/problems/given-two-strings-find-if-first-string-is-a-subsequence-of-second/1/
Time Complexity : O(2^N*N)
Space Complexity : O(N)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
public class SubsequenceExistenceNormal{


  static void printSubsequence(String str,String temp,List<String> ans)
  {
    if(str.length()==0 ){
      if(temp.length()>0){
          ans.add(temp);
      }
      return ;
    }

    printSubsequence(str.substring(1), temp,ans);
    printSubsequence(str.substring(1), temp+str.charAt(0),ans);

  }

  static boolean isSubSequence(String A, String B)
    {
        List<String> ans = new ArrayList<>();
        printSubsequence(B,"",ans);
        return ans.contains(A);
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

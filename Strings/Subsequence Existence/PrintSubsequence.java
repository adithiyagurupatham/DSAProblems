/**
Program to print the subsequence of string
Time Complexity : O(2^N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
public class PrintSubsequence{


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


  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the  text");
      String str = br.readLine();
      System.out.println("The subsequence of the string are ");
      List<String> ans = new ArrayList<>();
      printSubsequence(str, "",ans);
      System.out.println(ans);
  }

}

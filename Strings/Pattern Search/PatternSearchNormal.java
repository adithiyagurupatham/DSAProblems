/**
Program to chekc if the pattern is existing in the text or not
Link : https://practice.geeksforgeeks.org/problems/naive-pattern-search-1587115620/1/
Time Complexity : O(m*n)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class PatternSearchNormal{
  static boolean isExist(String pat,int i,String txt){
        for(int j=0;j<pat.length();j++){
            if(txt.charAt(i+j)!=pat.charAt(j)){
                return false;
            }
        }
        return true;
    }

    static boolean search(String pat, String txt)
    {
            for(int i=0;i<=txt.length()-pat.length();i++){
                boolean flag = isExist(pat,i,txt);
                if(flag){
                    return true;
                }
            }
            return false;
    }

  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the search text");
      String txt = br.readLine();
      System.out.println("Enter the pattern");
      String pat = br.readLine();
      System.out.println("The pattern existence in search text is "+search(pat, txt));
  }

}

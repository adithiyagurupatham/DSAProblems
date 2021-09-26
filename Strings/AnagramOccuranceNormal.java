/**
Program to count the total count of anagrams present in the string
Link : https://www.geeksforgeeks.org/anagram-substring-search-search-permutations/
Time Complexity : O((n-m+1)*m)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class AnagramOccuranceNormal{

  static boolean isAnagram(String pat, String txt,int i)
  {
    int[] count = new int[256];
    for(int j=0;j<pat.length();j++)
    {
      count[pat.charAt(j)]++;
      count[txt.charAt(i+j)]--;
    }
    for(int k=0;k<count.length;k++)
    {
      if(count[k]!=0)
      {
        return false;
      }
    }
    return true;
  }

    static boolean search(String pat, String txt) {
        for(int i=0;i<=txt.length()-pat.length();i++)
        {
          if(isAnagram(pat, txt, i))
          {
            return true;
          }
        }
        return false;
    }

  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the  text");
      String txt = br.readLine();
      System.out.println("Enter the pattern");
      String pat = br.readLine();
      System.out.println("The anagram occurance status is "+search(pat,txt));
  }

}

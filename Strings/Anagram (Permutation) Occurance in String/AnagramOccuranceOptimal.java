/**
Program to check if the permutation/anagram of the pattern is present in the string
Link : https://www.geeksforgeeks.org/anagram-substring-search-search-permutations/
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class AnagramOccuranceOptimal{

  static boolean isValid(int[] count,int[] hash){
        for(int i=0;i<count.length;i++){
            if(count[i]!=hash[i]){
                return false;
            }
        }
        return true;
    }

    static boolean search(String pat, String txt) {
        int[] count = new int[256];
        int[] hash = new int[256];
        if(pat.length()>txt.length())
        {
            return false;
        }
        for(int i=0;i<pat.length();i++){
            hash[pat.charAt(i)]++;
        }
        for(int i=0;i<pat.length();i++){
            count[txt.charAt(i)]++;
        }
        if(isValid(count,hash)){
            return true;
        }
        for(int start=1,end=pat.length();start<=txt.length()-pat.length();start++,end++){
            count[txt.charAt(end)]++;
            count[txt.charAt(start-1)]--;
            if(isValid(count,hash)){
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

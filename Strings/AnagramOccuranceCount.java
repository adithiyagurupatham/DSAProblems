/**
Program to count the total count of anagrams present in the string
Link : https://practice.geeksforgeeks.org/problems/count-occurences-of-anagrams5839/1#
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class AnagramOccuranceCount{

  static boolean isValid(int[] count,int[] hash){
        for(int i=0;i<count.length;i++){
            if(count[i]!=hash[i]){
                return false;
            }
        }
        return true;
    }

    static int search(String pat, String txt) {
        int[] count = new int[26];
        int[] hash = new int[26];
        int ans=0;
        if(pat.length()>txt.length())
        {
            return ans;
        }
        for(int i=0;i<pat.length();i++){
            hash[pat.charAt(i)-'a']++;
        }
        for(int i=0;i<pat.length();i++){
            count[txt.charAt(i)-'a']++;
        }
        if(isValid(count,hash)){
            ans++;
        }
        for(int start=1,end=pat.length();start<=txt.length()-pat.length();start++,end++){
            count[txt.charAt(end)-'a']++;
            count[txt.charAt(start-1)-'a']--;
            if(isValid(count,hash)){
                ans++;
            }
        }
        return ans;

    }

  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the  text");
      String txt = br.readLine();
      System.out.println("Enter the pattern");
      String pat = br.readLine();
      System.out.println("The anagram occurance count is "+search(pat,txt));
  }

}

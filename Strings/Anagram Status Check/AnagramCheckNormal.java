/**
Program to check if both the given strings are anagram/not
Link : https://practice.geeksforgeeks.org/problems/anagram-1587115620/1/
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.ArrayList;
public class AnagramCheckNormal{


  static boolean isAnagram(String a,String b)
    {
        char[] arr = a.toCharArray();
        char[] brr = b.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(brr);
        String s = new String(arr);
        String t = new String(brr);
        return s.equals(t);
    }


  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the first string");
      String firString = br.readLine();
      System.out.println("Enter the second string");
      String secString = br.readLine();
      System.out.println("The anagram status is "+isAnagram(firString,secString));
  }

}

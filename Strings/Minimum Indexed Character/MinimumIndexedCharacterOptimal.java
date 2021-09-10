/**
 Program to find the minimum index of pattern string character
 Link : https://practice.geeksforgeeks.org/problems/minimum-indexed-character-1587115620/1#
 Time Complexity : O(M+N)
 Space Complexity : O(patt)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Set;
import java.util.HashSet;
public class MinimumIndexedCharacterOptimal{

  static int minIndexChar(String str, String patt)
    {
        char[] charArray = patt.toCharArray();
        Set<Character> set = new HashSet<>();
        for(Character each : charArray){
            set.add(each);
        }
        for(int i=0;i<str.length();i++){
            if(set.contains(str.charAt(i))){
                return i;
            }
        }
        return -1;
    }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input string");
    String str = br.readLine();
    System.out.println("Enter the pattern string");
    String patt = br.readLine();
    System.out.println("The minimum index character occurance is "+minIndexChar(str, patt));
  }
}

/**
 Program to find the minimum index of pattern string character
 Link : https://practice.geeksforgeeks.org/problems/minimum-indexed-character-1587115620/1#
 Time Complexity : O(M*N)
 Space Complexity : O(1)
*/
import java.io.*;
import java.util.*;
public class MinimumIndexedCharacterNormal{

  static int minIndexChar(String str, String patt)
    {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<patt.length();i++){
            for(int j=0;j<str.length();j++){
                if(patt.charAt(i) == str.charAt(j) && j<min)
                    min=j;
            }
        }
        return (min==Integer.MAX_VALUE)?-1:min;
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

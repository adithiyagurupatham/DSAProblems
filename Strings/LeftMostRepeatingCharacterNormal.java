/**
Program to find the index of the left most repeating character
Link : https://practice.geeksforgeeks.org/problems/repeating-character-first-appearance-leftmost/1/
Time Complexity : O(N^2)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.ArrayList;
public class LeftMostRepeatingCharacterNormal{


  static int repeatedCharacter(String S)
    {
        for(int i=0;i<S.length();i++){
            for(int j=i+1;j<S.length();j++){
                if(S.charAt(i)==S.charAt(j)){
                    return i;
                }
            }
        }
        return -1;
    }


  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the first string");
      String str = br.readLine();
      System.out.println("The left most repeating character index is "+repeatedCharacter(str));
  }

}

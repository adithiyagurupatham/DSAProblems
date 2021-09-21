/**
Program to find the  left most non - repeating character
Link : https://practice.geeksforgeeks.org/problems/non-repeating-character-1587115620/1/
Time Complexity : O(N^2)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.ArrayList;
public class LeftMostNonRepeatingCharacterNormal{


  static char nonrepeatingCharacter(String S)
    {
        for(int i=0;i<S.length();i++){
            boolean flag = false;
            for(int j=0;j<S.length();j++){
                if(i!=j && S.charAt(i)==S.charAt(j)){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                return S.charAt(i);
            }
        }
        return '$';

    }


  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the first string");
      String str = br.readLine();
      System.out.println("The left most repeating character  is "+nonrepeatingCharacter(str));
  }

}

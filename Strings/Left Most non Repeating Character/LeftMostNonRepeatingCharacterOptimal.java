/**
Program to find the  left most non - repeating character
Link : https://practice.geeksforgeeks.org/problems/non-repeating-character-1587115620/1/
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.ArrayList;
public class LeftMostNonRepeatingCharacterOptimal{


  static char nonrepeatingCharacter(String S)
    {

        int[] count = new int[26];
        Arrays.fill(count,-1);
        for(int i=0;i<S.length();i++){
            if(count[S.charAt(i)-'a']==-1){
               count[S.charAt(i)-'a'] = i;
            }
            else{
                count[S.charAt(i)-'a'] = -2;
            }
        }
        Integer min = Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(count[i]>=0){
                min = Math.min(min,count[i]);
            }
        }
        return (min==Integer.MAX_VALUE)?'$':S.charAt(min);

    }


  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the first string");
      String str = br.readLine();
      System.out.println("The left most repeating character  is "+nonrepeatingCharacter(str));
  }

}

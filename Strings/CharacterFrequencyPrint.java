/**
Program to print the character frequency of string
Time Complexity : O(n)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class CharacterFrequencyPrint{
  static void print(int[] count){
        for(int i=0;i<26;i++){
          if(count[i]>0)
            System.out.println((char)(i+'a')+" "+count[i]);
        }
    }

    static void  findFrequency(String txt)
    {
            int[] count = new int[26];
            for(int i=0;i<txt.length();i++){
              count[txt.charAt(i)-'a']++;
            }
            print(count);
    }

  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the  text");
      String txt = br.readLine();
      System.out.println("The frequency count of the string is ");
      findFrequency(txt);
  }

}

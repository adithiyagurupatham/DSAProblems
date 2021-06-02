/**
Program to check if only unique characters are present in the string
Link : https://www.geeksforgeeks.org/determine-string-unique-characters/
Time Complexity : O(N)
SPace Complexity : O(256)
*/
import java.io.*;
import java.util.*;
public class UniqueCharacterStringASCII{

  static int CHAR_COUNT;

  static boolean isUniqueCharacterString(String input){
    CHAR_COUNT=256;
    boolean[] booleanArray = new boolean[CHAR_COUNT];
    Arrays.fill(booleanArray,false);
    char[] charArray = input.toCharArray();
    for(char each : charArray){
      if(booleanArray[each]){
        return false;
      }
      booleanArray[each]=true;
    }
    return true;
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input string");
    String input = br.readLine();
    System.out.println("is the string a unique character string "+isUniqueCharacterString(input));
  }
}

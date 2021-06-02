/**
Program to check if only unique characters are present in the string
Link : https://www.geeksforgeeks.org/determine-string-unique-characters/
Time Complexity : O(NlogN)
SPace Complexity : O(1)
*/
import java.io.*;
import java.util.*;
public class UniqueCharacterStringSorting{

  static boolean isUniqueCharacterString(String input){
    char[] charArray = input.toCharArray();
    Arrays.sort(charArray);
    for(int i=0;i<charArray.length-1;i++){
      if(charArray[i]==charArray[i+1]){
        return false;
      }
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

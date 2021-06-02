/**
Program to check if only unique characters are present in the string
Link : https://www.geeksforgeeks.org/determine-string-unique-characters/
Works only with characters a to z
Time Complexity : O(N)
SPace Complexity : O(1)
*/
import java.io.*;
import java.util.*;
public class UniqueCharacterStringBit{

  static boolean isUniqueCharacterString(String input){
    int checker=0;
    for(int i=0;i<input.length();i++){
      int index = input.charAt(i)-'a';
      if((checker&(1<<index))>0){
        return false;
      }
      checker|=(1<<index);
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

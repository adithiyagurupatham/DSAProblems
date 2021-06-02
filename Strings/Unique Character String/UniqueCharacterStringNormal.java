/**
Program to check if only unique characters are present in the string
Link : https://www.geeksforgeeks.org/determine-string-unique-characters/
Time Complexity : O(N^2)
SPace Complexity : O(1)
*/
import java.io.*;
public class UniqueCharacterStringNormal{

  static boolean isUniqueCharacterString(String input){
    for(int i=0;i<input.length();i++){
      for(int j=i+1;j<input.length();j++){
        if(input.charAt(i)==input.charAt(j)){
          return false;
        }
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

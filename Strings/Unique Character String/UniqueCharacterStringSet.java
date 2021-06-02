/**
Program to check if only unique characters are present in the string
Link : https://www.geeksforgeeks.org/determine-string-unique-characters/
Time Complexity : O(N)
SPace Complexity : O(N)
*/
import java.io.*;
import java.util.*;
public class UniqueCharacterStringSet{

  static boolean isUniqueCharacterString(String input){
    Set<Character> set = new HashSet<>();
    for(char each : input.toCharArray()){
      if(set.contains(each)){
        return false;
      }
      set.add(each);
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

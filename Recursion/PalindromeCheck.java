/**
Check if the given string is a palindrome or not
*/
import java.io.*;
public class PalindromeCheck{

  static boolean isPalindrome(String s,int start,int end){
    if(s==null || s.length()==0){
      return false;
    }
    if(start>=end){
      return true;
    }
    if(s.charAt(start)!=s.charAt(end)){
      return false;
    }
    return isPalindrome(s,start+1,end-1);
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the string");
    String input =  br.readLine();
    boolean isPalindrome =  isPalindrome(input,0,input.length()-1);
    if(isPalindrome){
      System.out.println("The given string "+input+" is  a palindrome");
    }
    else{
      System.out.println("The given string "+input+" is not a palindrome");
    }
  }

}

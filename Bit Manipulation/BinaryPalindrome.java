/*
   To check the palindrome of binary representation of a given number

   Link : https://www.techiedelight.com/check-if-binary-representation-number-palindrome/
*/
import java.io.*;
public class BinaryPalindrome{
  static boolean isPalindrome(int input){
    int temp=input,reverse=0;
    while(temp>0){
      reverse = (reverse<<1) | (temp&1);
      temp>>=1;
    }
    return input==reverse;
  }
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number");
    Integer value= Integer.valueOf(br.readLine());
    System.out.println("Is the given input "+value+" a palindrome "+isPalindrome(value));
  }
}

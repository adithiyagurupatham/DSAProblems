/**
Program to check if given number is lucky or not
Link : https://www.geeksforgeeks.org/lucky-numbers/
Complexity : O(logN)
*/
import java.io.*;
public class LuckyNumber{

  static int counter=2;
  static boolean isLuckyNumber(int n){
    if(n%counter==0){
      return false;
    }
    if(counter>n){
      return true;
    }
    int new_pointer = n;
    new_pointer = new_pointer-(new_pointer/counter);
    counter++;
    return isLuckyNumber(new_pointer);
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input");
    Integer input = Integer.valueOf(br.readLine());
    System.out.println("is the number a luck number "+isLuckyNumber(input));
  }
}

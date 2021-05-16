/**
To find the sum of digits using recursion
*/
import java.io.*;
public class DigitSum{
  static int getDigitSum(int input){
     if(input<=1){
       return input;
     }
     return (input%10)+getDigitSum(input/10);

  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input");
    Integer input = Integer.valueOf(br.readLine());
    System.out.println("The sum of digits is "+getDigitSum(input));

  }
}

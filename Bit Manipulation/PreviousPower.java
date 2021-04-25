/*
   Program to find the previous power of 2 for the given number

   Link : https://www.techiedelight.com/round-previous-power-2/
*/
import java.io.*;
public class PreviousPower{

  static int getPreviousPower(int input){
    while((input&(input-1)) !=0){
      input = input & (input-1);
    }
    return input;
  }

  public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the input");
      Integer value = Integer.valueOf(br.readLine());
      System.out.println("The previous power of 2 is "+getPreviousPower(value));
  }
}

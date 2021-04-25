/*
   Program to find the next highest power of 2 for the given number

   Link : https://www.techiedelight.com/round-next-highest-power-2/
*/
import java.io.*;
public class NextHighestPower{

  static int getNextHighestPower(int input){
    input--; // to handle the perfect power of 2 numbers
    while((input&(input-1)) !=0){
      input = input & (input-1);
    }
    input<<=1;
    return input;
  }

  public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the input");
      Integer value = Integer.valueOf(br.readLine());
      System.out.println("The nearest power of 2 is "+getNextHighestPower(value));
  }
}

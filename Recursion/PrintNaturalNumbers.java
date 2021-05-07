/**
 Recursive approach to print natural numbers till n
*/
import java.io.*;
public class PrintNaturalNumbers{

  static void printNumbers(int number){
    if(number==0){
      return;
    }
    printNumbers(number-1);
    System.out.print(number+" ");
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input ");
    Integer input = Integer.valueOf(br.readLine());
    System.out.println("The natural numbers are ");
    printNumbers(input);
    System.out.println();
  }

}

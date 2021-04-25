/*
   Number of bts need to be flipped to change number from x to y
*/
import java.io.*;
public class FlipBits{
  static int flipsNeeded(Integer source,Integer destination){
    int counter=0;
    int result = source ^ destination; // take XOR and count the set bits
    while(result>0){
      result = result&(result-1);
      counter++;
    }
    return counter;
  }
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the source number");
    Integer source = Integer.valueOf(br.readLine());
    System.out.println("Enter the destination number");
    Integer destination = Integer.valueOf(br.readLine());
    System.out.println("The number of flips needed is "+flipsNeeded(source,destination));
  }
}

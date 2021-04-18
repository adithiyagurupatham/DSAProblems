import java.util.*;
import java.io.*;
public class BrianKerningamAlgorithm{

  static int getSetBitCount(int n){
    int counter=0;
    while(n>0){
      n=(n&(n-1));
      counter++;
    }
    return counter;
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number");
    Integer number = Integer.valueOf(br.readLine());
    System.out.println("The set bit count is "+getSetBitCount(number));
  }
}

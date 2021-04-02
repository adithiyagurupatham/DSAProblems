import java.io.*;
import java.util.*;
import java.lang.*;

public class DigitsCounter {

  static int getDigitsCount(int number){
    int counter =0;
    while(number!=0){
      number=number/10;
      counter++;
    }
    return counter;
  }


  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    Integer value = Integer.valueOf(input);
    System.out.println("The total digits are "+getDigitsCount(value));
  }
}

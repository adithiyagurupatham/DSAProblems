import java.util.*;
import java.io.*;
import java.lang.*;

public class ReverseDigits {
  public static void main(String args[]) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Integer input = Integer.valueOf(br.readLine());
    StringBuilder sb = new StringBuilder(String.valueOf(input));
    sb.reverse();
    System.out.println(reverseDigits(input));
  }

  static Integer reverseDigits(Integer input){
    StringBuilder sb = new StringBuilder(String.valueOf(input));
    sb.reverse();
    Integer reverseValue = Integer.valueOf(sb.toString());
    return reverseValue;
  }

}

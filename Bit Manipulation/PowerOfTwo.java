/**
To check if the given number is a power of two or not
*/
import java.io.*;
import java.util.*;
public class PowerOfTwo{

  static boolean isPower(int n){
    if(n==0){
      return false;
    }
    return ((n&(n-1))==0);
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number");
    Integer number = Integer.valueOf(br.readLine());
    System.out.println("The solution is "+isPower(number));
  }
}

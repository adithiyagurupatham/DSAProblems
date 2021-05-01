/**
Program to implement power function(int x,int n) in log(n) time
*/
import java.io.*;
public class PowerFunction{
  static int findPower(int number,int power){
    int answer=1;
    while(power>0){
      if((power&1)==1){
        answer*=number; // multiply the numer with answer only if the power is odd
      }
      power>>=1;
      number*=number; // multiply the number by itself 
    }
    return answer;
  }
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number for which power should be calculated");
    Integer number = Integer.valueOf(br.readLine());
    System.out.println("Enter the power ");
    Integer power = Integer.valueOf(br.readLine());
    System.out.println("The power value is "+findPower(number,power));
  }
}

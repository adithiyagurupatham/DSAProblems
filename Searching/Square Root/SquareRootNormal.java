/**
Program to find the floor squareRoot of a given number
Time Complexity : O(Sqrt(N))
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class SquareRootNormal{
  static int getSquareRoot(int number){
    int i=1;
    while(i*i<=number){
      i++;
    }
    return i-1;
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input ");
    Integer number = Integer.valueOf(br.readLine());
    System.out.println("The floor squareRoot is "+getSquareRoot(number));
  }
}

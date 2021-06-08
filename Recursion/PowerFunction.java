/**
Program to find the power of a given number
Link : https://www.geeksforgeeks.org/write-a-c-program-to-calculate-powxn/
Complexity : O(logN)
*/
import java.io.*;
public class PowerFunction{
  static int RecursivePower(int n,int p)
    {
        if(p==0){
            return 1;
        }
        if(p==1){
            return n;
        }
        int temp = RecursivePower(n,p/2);
        if(p%2==0){
            return temp*temp;
        }
        return n*temp*temp;
    }
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the base");
    Integer base = Integer.valueOf(br.readLine());
    System.out.println("Enter the power");
    Integer power = Integer.valueOf(br.readLine());
    System.out.println("The answer is "+RecursivePower(base,power));
  }
}

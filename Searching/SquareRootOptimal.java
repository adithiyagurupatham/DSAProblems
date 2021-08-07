/**
Program to find the floor squareRoot of a given number
Time Complexity : O(logN)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class SquareRootOptimal{
  static int getSquareRoot(int number){
    int low = 1,high = number,ans=-1;
    while(low<=high){
      int mid = low + ((high - low)/2);
      int midSqr = mid*mid;
      if(midSqr==number){
        return mid;
      }
      if(midSqr<=number){
        ans = mid;
        low = mid+1;
      }
      else{
        high = mid - 1;
      }
    }
    return ans;
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input ");
    Integer number = Integer.valueOf(br.readLine());
    System.out.println("The floor squareRoot is "+getSquareRoot(number));
  }
}

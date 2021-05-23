/**
For given input of size n find the maximum number of possible solutions with exact count - k
Link : https://www.spoj.com/problems/GNYR09F/
*/
import java.io.*;
public class AdjacentBitCount{

  static int getAdjacentBitCount(int n,int k,int value){
    if(n==0){
      return 0;
    }
    if(n==1){
      if(k==0){
        return 1;
      }
      return 0;
    }
    if(value==0){
      return getAdjacentBitCount(n-1,k,0)+getAdjacentBitCount(n-1,k,1);
    }
    return getAdjacentBitCount(n-1,k-1,1)+getAdjacentBitCount(n-1,k,0);

  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input");
    Integer n = Integer.valueOf(br.readLine());
    System.out.println("Enter the expected adjacent bit count");
    Integer k = Integer.valueOf(br.readLine());
    int result = getAdjacentBitCount(n,k,0);
    result+=getAdjacentBitCount(n,k,1);
    System.out.println("The answer is "+result);
  }
}

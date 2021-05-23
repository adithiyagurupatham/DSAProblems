/**
For given input of size n find the maximum number of possible solutions with exact count - k
Link : https://www.spoj.com/problems/GNYR09F/
*/
import java.util.*;
import java.io.*;
public class AdjacentBitCountOptimal{

  static int n,k;

  static int[][][] arr;

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
    if(arr[n][k][value]!=-1){
      return arr[n][k][value];
    }
    if(value==0){
      arr[n][k][value] = getAdjacentBitCount(n-1,k,0)+getAdjacentBitCount(n-1,k,1);
      return arr[n][k][value];
    }
     arr[n][k][value] = getAdjacentBitCount(n-1,k-1,1)+getAdjacentBitCount(n-1,k,0);
     return arr[n][k][value];
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input");
    n = Integer.valueOf(br.readLine());
    System.out.println("Enter the expected adjacent bit count");
    k = Integer.valueOf(br.readLine());
    arr = new int[n+1][k+1][2];
    for(int i=0;i<=n;i++){
      for(int j=0;j<=k;j++){
        Arrays.fill(arr[i][j],-1);
      }
    }
    int result = getAdjacentBitCount(n,k,0);
    result+=getAdjacentBitCount(n,k,1);
    System.out.println("The answer is "+result);
  }
}

/**
Program to find the maximum value of arr[j]-arr[i] such that j>i
Time Complexity : O(N^2)
Space Complexity : O(1)
*/
import java.io.*;
public class MaximumDifferenceNormal{
  static int getMaximumDifference(int[] array){
    int res=Integer.MIN_VALUE,n=array.length;
    for(int i=0;i<n-1;i++){
      for(int j=i+1;j<n;j++){
        res = Math.max(res,array[j]-array[i]);
      }
    }
    return res;
  }
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of elements");
    Integer number = Integer.valueOf(br.readLine());
    int[] array = new int[number];
    System.out.println("Enter the elements");
    String[] stringArray = br.readLine().split(" ");
    for(int i=0;i<stringArray.length;i++){
      array[i] = Integer.valueOf(stringArray[i]);
    }
    System.out.println("The maximum difference value is "+getMaximumDifference(array));
  }
}

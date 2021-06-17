/**
Program to find the maximum value of arr[j]-arr[i] such that j>i
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.*;
public class MaximumDifferenceOptimal{
  static int getMaximumDifference(int[] array){
    int res=Integer.MIN_VALUE,n=array.length,min=array[0];
    for(int i=1;i<n;i++){
      res = Math.max(res,array[i]-min);
      min = Math.min(min,array[i]);
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

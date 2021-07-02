/**
Program to find the maximum k consecutive sub array sum
Link : https://www.geeksforgeeks.org/find-maximum-minimum-sum-subarray-size-k/
Time Complexity : O(n-k)k
Space Complexity : O(1)
*/
import java.io.*;
public class MaximumKConsecutiveSumNormal{

  static int getMaximumKConsecutiveSubarray(int[] array,int k){
    int max=Integer.MIN_VALUE;
    for(int i=0;i<=array.length-k;i++){
      int sum=0;
      for(int j=0;j<k;j++){
        sum+=array[i+j];
      }
      max=Math.max(max,sum);
    }
    return max;
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input size");
    Integer size = Integer.valueOf(br.readLine());
    int[] array = new int[size];
    System.out.println("Enter the elements");
    String[] inputString = br.readLine().split(" ");
    for(int i=0;i<size;i++){
      array[i] = Integer.valueOf(inputString[i]);
    }
    System.out.println("Enter the value of k");
    Integer k = Integer.valueOf(br.readLine());
    System.out.println("The max k subarray sum is "+getMaximumKConsecutiveSubarray(array,k));
  }
}

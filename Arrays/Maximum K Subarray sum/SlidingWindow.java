/**
Program to find the maximum k consecutive sub array sum
Link : https://www.geeksforgeeks.org/find-maximum-minimum-sum-subarray-size-k/
Time Complexity : O(n)
Space Complexity : O(1)
*/
import java.io.*;
public class SlidingWindow{

  static int getMaximumKConsecutiveSubarray(int[] array,int k){
    int curr=0;
    for(int i=0;i<k;i++){
      curr+=array[i];
    }
    int max=curr;
    for(int i=k;i<array.length;i++){
      curr-=array[i-k];
      curr+=array[i];
      max=Math.max(max,curr);
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

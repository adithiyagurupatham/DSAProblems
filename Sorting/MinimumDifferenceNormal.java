/**
Program to find the minimum difference of the array (difference between two elements is minimum)
Time Complexity : O(N^2)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class MinimumDifferenceNormal{
  static int findMinimumDifference(int[] arr)
    {
      int min = Integer.MAX_VALUE;
      for(int i=0;i<arr.length-1;i++){
        for(int j=i+1;j<arr.length;j++){
          min = Math.min(min,Math.abs(arr[i]-arr[j]));
        }
      }
      return min;
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
    System.out.println("The minimum difference of the array is  "+findMinimumDifference(array));
  }
}

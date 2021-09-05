/**
Program to find the minimum difference of the array (difference between two elements is minimum)
Time Complexity : O(NlogN)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class MinimumDifferenceOptimal{
  static int findMinimumDifference(int[] arr)
    {
      int min = Integer.MAX_VALUE;
      Arrays.sort(arr);
      for(int i=1;i<arr.length;i++){
          min = Math.min(min,Math.abs(arr[i]-arr[i-1]));
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

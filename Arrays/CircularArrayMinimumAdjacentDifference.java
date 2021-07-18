/**
Program to find the minimum adjacent difference of the circular array
Link : https://practice.geeksforgeeks.org/problems/minimum-absloute-difference-between-adjacent-elements-in-a-circular-array-1587115620
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.*;
public class CircularArrayMinimumAdjacentDifference{
  static int minAdjDiff(int arr[], int n) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            min = Math.min(min,Math.abs(arr[i]-arr[i+1]));
        }
        min = Math.min(min,Math.abs(arr[0]-arr[n-1]));
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
    System.out.println("The minimum absolute difference is "+minAdjDiff(array,array.length));
  }
}

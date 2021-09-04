/**
Program to distribute m chocolates to m children such that the difference between the max and min of the chocolates is minimum
Time Complexity : O(NlogN)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.lang.Math;
public class ChocolateDistribution{
  static int getMinimumChocolate(int arr[], int n, int m)
    {
        if(m>n){
          return -1;
        }
        Arrays.sort(arr);
        int res = arr[m-1]-arr[0];
        for(int i=1;(i+m-1)<n;i++){
          res = Math.min(res,arr[i+m-1]-arr[i]);
        }
        return res;
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
    System.out.println("Enter the value of m");
    Integer k = Integer.valueOf(br.readLine());
    System.out.println("The chocolate distribution value is  "+getMinimumChocolate(array, size, k));
  }
}

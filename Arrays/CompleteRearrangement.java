/**
Program to complete rearrange the array
Link : https://practice.geeksforgeeks.org/problems/rearrange-an-array-with-o1-extra-space3142/1/
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class CompleteRearrangement{

  static void arrange(long arr[], int n)
    {
        for(int i=0;i<n;i++){
            long x = Long.valueOf(arr[i]);
            long temp = arr[Math.toIntExact(x)]%n;
            arr[i]=Long.valueOf((arr[i]+(temp)*n));
        }
        for(int i=0;i<n;i++){
            arr[i]/=n;
        }
    }
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input size");
    Integer size = Integer.valueOf(br.readLine());
    long[] array = new long[size];
    System.out.println("Enter the elements");
    String[] inputString = br.readLine().split(" ");
    for(int i=0;i<size;i++){
      array[i] = Long.valueOf(inputString[i]);
    }
    arrange(array,size);
    System.out.println("Post arrangement array is ");
    for(int i=0;i<size;i++){
      System.out.print(array[i]+" ");
    }
    System.out.println();
  }
}

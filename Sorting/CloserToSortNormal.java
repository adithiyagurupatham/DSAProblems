/**
Program to check if the given given element is present in the array or not
Link : https://practice.geeksforgeeks.org/problems/closer-to-sort-1587115620/1/
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class CloserToSortNormal{
  static int  closerToSort(int arr[], int n, int x)
    {
        for(int i=0;i<n;i++){
          if(arr[i]==x){
            return i;
          }
        }
        return -1;
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
    System.out.println("The index of the element is "+closerToSort(array, size, k));
  }
}

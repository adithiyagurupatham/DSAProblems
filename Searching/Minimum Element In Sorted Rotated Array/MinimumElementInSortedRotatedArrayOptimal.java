/**
Program to find the minimum element in the sorted rotated array
Link : https://practice.geeksforgeeks.org/problems/minimum-number-in-a-sorted-rotated-array-1587115620/1
Time Complexity : O(logN)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MinimumElementInSortedRotatedArrayOptimal
{

  static int minNumber(int arr[], int low, int high)
    {
        while(low<=high){
            int mid = low + ((high-low)/2);
            if((mid==0 || arr[mid]<arr[mid-1]) && (mid==arr.length-1 || arr[mid]<arr[mid+1])){
                return arr[mid];
            }
            if(arr[mid]>arr[high]){
                low=mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }

  public static void main(String[] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input size");
    Integer size = Integer.valueOf(br.readLine());
    int[] array = new int[size];
    System.out.println("Enter the elements");
    String[] inputString = br.readLine().split(" ");
    for(int i=0;i<size;i++){
      array[i] = Integer.valueOf(inputString[i]);
    }
    System.out.println("The minimum element is "+minNumber(array,0,size-1));
  }
}

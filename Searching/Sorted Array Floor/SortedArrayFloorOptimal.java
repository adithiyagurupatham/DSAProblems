/**
Program to find the floor of the sorted array
Link : https://practice.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1/?track=DSASP-Searching&batchId=154#
Time Complexity : O(logN)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class SortedArrayFloorOptimal{

  static int findFloor(int arr[], int n, int x)
    {
        int low=0,high=n-1,ans=-1;
        while(low<=high){
            int mid = low +((high-low)/2);
            if(arr[mid]>x){
                high = mid-1;
            }
            else{
                if(arr[mid]<=x){
                    ans=mid;
                }
                low=mid+1;
            }
        }
        return ans;
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
    System.out.println("Enter the value which need to be checked");
    Integer value = Integer.valueOf(br.readLine());
    System.out.println("The index of the floor sorted array is "+findFloor(array,size,value));
  }
}

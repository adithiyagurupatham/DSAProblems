/**
Program to find the smallest missing positive number
Link : https://practice.geeksforgeeks.org/problems/smallest-positive-missing-number-1587115621/1
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class SmallestMissingPositiveNumber{
  static void swap(int[] array,int i,int j){
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
  static void segregate(int[] array,int n){
    int left=0,right=n-1;
    while(true){
      while(left<n && array[left]>0){
        left++;
      }
      if(left >= right ||left>=n-1){
        break;
      }
      while(right>0 && array[right]<=0){
        right--;
      }
      if(left >= right || right<=0){
        break;
      }
      swap(array,left,right);
      left++;
      right--;
    }
  }
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        segregate(arr,size);
        int positiveCount=0;
        for(int i=0;i<size;i++){
            if(arr[i]>0){
                positiveCount++;
            }
        }
        for(int i=0;i<positiveCount;i++){
            int val = Math.abs(arr[i]);
            if(val>positiveCount){
                continue;
            }
            if(val==0)
                val =1;
            if(arr[val-1]>0){
                arr[val-1] = -arr[val-1];
            }
        }
        for(int i=0;i<positiveCount;i++){
            if(arr[i]>0){
                return i+1;
            }
        }
         return positiveCount+1;
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
    System.out.println("The missing smallest positive number is "+missingNumber(array,size));
  }
}

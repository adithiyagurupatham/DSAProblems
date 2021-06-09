/**
Program to find the bitonic point
Link : https://practice.geeksforgeeks.org/problems/maximum-value-in-a-bitonic-array3001/1#
Complexity : O (logN)
*/
import java.io.*;
public class BitonicPoint{
  static int getBitonicPoint(int[] arr, int n) {
        int low=0,high=n-1;
        while(low<=high){
            int mid = low+((high-low)/2);
            if(mid==0 || mid==n-1){
                return arr[mid];
            }
            if((arr[mid]>arr[mid+1]) && (arr[mid]>arr[mid-1])){
                return arr[mid];
            }
            if(arr[mid]>arr[mid+1]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of elements");
    Integer number = Integer.valueOf(br.readLine());
    int[] array = new int[number];
    System.out.println("Enter the elements");
    String[] stringArray = br.readLine().split(" ");
    for(int i=0;i<stringArray.length;i++){
      array[i] = Integer.valueOf(stringArray[i]);
    }
    System.out.println("The bitonic point is "+getBitonicPoint(array,number));
  }
}

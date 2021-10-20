/**
Program to find the next greater element
Link : https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1/
Time Complexity : O(N^2)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class NextGreaterElementNormal{

  static long[] nextLargerElement(long[] arr, int n)
   {
       long[] ans = new long[n];
       for(int i=0;i<n;i++){
           long val = -1;
           for(int j=i+1;j<n;j++){
               if(arr[j]>arr[i]){
                   val = arr[j];
                   break;
               }
           }
           ans[i] = val;
       }
       return ans;
   }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of elements");
    Integer number = Integer.valueOf(br.readLine());
    long[] array = new long[number];
    System.out.println("Enter the elements");
    String[] stringArray = br.readLine().split(" ");
    for(int i=0;i<stringArray.length;i++){
      array[i] = Long.valueOf(stringArray[i]);
    }
    System.out.println("The next greater element array is "+Arrays.toString(nextLargerElement(array,number)));
  }
}

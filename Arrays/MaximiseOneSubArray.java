/**
Program to find the maximum  consecutive 1 sub array
Link : https://practice.geeksforgeeks.org/problems/maximize-number-of-1s0905/1#
Time Complexity : O(n)
Space Complexity : O(1)
*/
import java.io.*;
public class MaximiseOneSubArray{

  static int findZeroes(int arr[], int n, int m) {
        int end=0,start=0;
        while(end<arr.length){
            if(arr[end]==0){
                m--;
            }
            if(m<0){
                if(arr[start]==0){
                    m++;
                }
                start++;
            }
            end++;
        }
        return end-start;
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
    System.out.println("The max 1 value subarray is "+findZeroes(array,array.length,k));
  }
}

/**
Program to find the kth element of the two sorted arrays
Link : https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1
Time Complexity : O(M + N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class KthElementOfTwoSortedArraysNormal{

  static long kthElement( int arr[], int brr[], int m, int n, int k) {
        int i=0,j=0,count=0;
        while(i<m && j<n){
            count++;
            int min = Math.min(arr[i],brr[j]);
            if(count==k){
                return min;
            }
            if(arr[i]<brr[j]){
                i++;
            }
            else{
                j++;
            }
        }
        while(i<m){
            count++;
            if(count==k){
                return arr[i];
            }
            i++;
        }
        while(j<n){
            count++;
            if(count==k){
                return brr[j];
            }
            j++;
        }
        return -1;
    }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the fir input size");
    Integer size = Integer.valueOf(br.readLine());
    int[] array = new int[size];
    System.out.println("Enter the elements");
    String[] inputString = br.readLine().split(" ");
    for(int i=0;i<size;i++){
      array[i] = Integer.valueOf(inputString[i]);
    }
    System.out.println("Enter the second array input size");
    Integer secondSize = Integer.valueOf(br.readLine());
    int[] array2 = new int[secondSize];
    System.out.println("Enter the elements");
    String[] inputString2 = br.readLine().split(" ");
    for(int i=0;i<secondSize;i++){
      array2[i] = Integer.valueOf(inputString2[i]);
    }
    System.out.println("Enter the value of K");
    Integer k = Integer.valueOf(br.readLine());
    System.out.println("The element at the kth position is "+
                    kthElement(array,array2,size,secondSize,k));
  }
}

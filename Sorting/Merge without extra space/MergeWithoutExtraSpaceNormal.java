/**
Program to merge two sorted arrays without any extra space
Link : https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1/
Time Complexity : O(l*m^2)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class MergeWithoutExtraSpaceNormal{

  static void swap(int[] arr,int i,int[] brr,int j){
        int temp = arr[i];
        arr[i] = brr[j];
        brr[j] = temp;
    }

    public static void merge(int arr[], int brr[], int n, int m)
      {
          // code here

          for(int i=0;i<n;i++){
              if(arr[i]>brr[0]){
                  swap(arr,i,brr,0);
                  int temp = brr[0];
                  for(int k=1;k<brr.length;k++){
                      while(brr[k]<brr[k-1]){
                         swap(brr,k,brr,k-1);
                      }
                  }
              }
          }

      }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input size");
    Integer l = Integer.valueOf(br.readLine());
    int[] A = new int[l];
    System.out.println("Enter the elements");
    String[] inputString = br.readLine().split(" ");
    for(int i=0;i<l;i++){
      A[i] = Integer.valueOf(inputString[i]);
    }
    System.out.println("Enter the second array input size");
    Integer m = Integer.valueOf(br.readLine());
    int[] B = new int[m];
    System.out.println("Enter the elements");
    inputString = br.readLine().split(" ");
    for(int i=0;i<m;i++){
      B[i] = Integer.valueOf(inputString[i]);
    }
    merge(A, B, l, m);
    System.out.println("After merging arrays");
    System.out.println("A => "+Arrays.toString(A));
    System.out.println("B => "+Arrays.toString(B));
  }
}

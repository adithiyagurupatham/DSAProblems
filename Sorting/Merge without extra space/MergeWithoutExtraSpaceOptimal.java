/**
Program to merge two sorted arrays without any extra space
Link : https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1/
Time Complexity : O((l+m)log(l+m))
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class MergeWithoutExtraSpaceOptimal{

  static void swap(int[] arr,int i,int[] brr,int j){
        int temp = arr[i];
        arr[i] = brr[j];
        brr[j] = temp;
    }

    public static void merge(int arr[], int brr[], int m, int n)
    {
        int i=0,j=0,k=m-1;
        while(i<=k && j<n){
            if(arr[i]<brr[j]){
                i++;
            }
            else{
                swap(arr,k,brr,j);
                k--;
                j++;
            }
        }
        Arrays.sort(arr);
        Arrays.sort(brr);
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

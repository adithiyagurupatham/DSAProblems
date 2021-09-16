/**
Program to find the kth element of the two sorted arrays
Link : https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1
Time Complexity : O(log(min(m,n)))
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class KthElementOfTwoSortedArraysOptimal{

  static long kthElement( int arr[], int brr[], int m, int n, int k) {
    if(m>n){
        return kthElement(brr,arr,n,m,k);
    }
    int low = Math.max(0,k-n);
    int high = Math.min(m,k);
    while(low<=high){
        int cut1 = low+((high-low)/2);
        int cut2 = k-cut1;
        int l1 = (cut1==0)?Integer.MIN_VALUE : arr[cut1-1];
        int r1 = (cut1==m)?Integer.MAX_VALUE : arr[cut1];
        int l2 = (cut2==0)?Integer.MIN_VALUE : brr[cut2-1];
        int r2 = (cut2==n)?Integer.MAX_VALUE : brr[cut2];
        if(l1<=r2 && l2<=r1){
            return Math.max(l1,l2);
        }
        else if(l1>r2){
            high = cut1-1;
        }
        else{
            low = cut1+1;
        }

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

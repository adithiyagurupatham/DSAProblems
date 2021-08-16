/**
Program to find the median of the two sorted arrays
Link : https://practice.geeksforgeeks.org/problems/median-of-two-sorted-arrays1618/1/
Time Complexity : O(log min(m,n))
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class MedianOfTwoSortedArraysOptimal{
  static int findMedian(int arr[], int n, int brr[], int m){
    int low=0,high=n;
        while(low<=high){
            int partitionX = low+((high-low)/2);
            int partitionY = ((m+n+1)/2)-partitionX;

            int maximumLeftX = (partitionX==0)?Integer.MIN_VALUE:arr[partitionX-1];
            int minimumRightX = (partitionX==n)?Integer.MAX_VALUE:arr[partitionX];

            int maximumLeftY = (partitionY==0)?Integer.MIN_VALUE:brr[partitionY-1];
            int minimumRightY = (partitionY==m)?Integer.MAX_VALUE:brr[partitionY];

            if(maximumLeftX<=minimumRightY && maximumLeftY <= minimumRightX){
                if(((m+n)%2)==0){
                    return (Math.max(maximumLeftX,maximumLeftY) + Math.min(minimumRightX,minimumRightY))/2;
                }
                else{
                    return Math.max(maximumLeftX,maximumLeftY);
                }
            }
            else if (maximumLeftX>minimumRightY){
                high = partitionX-1;
            }
            else{
                low = partitionX+1;
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
    System.out.println("The median of the two array is "+findMedian(array,size,array2,secondSize));
  }
}

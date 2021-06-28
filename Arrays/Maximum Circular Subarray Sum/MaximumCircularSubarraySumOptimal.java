/**
Proram to find the maximum circuar subarray sum
Link : https://practice.geeksforgeeks.org/problems/max-circular-subarray-sum-1587115620/1/?track=DSASP-Arrays&batchId=154
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.*;
public class MaximumCircularSubarraySumOptimal{

  static int kadane(int[] array){
        int max = array[0],currSum = array[0],tempMax = array[0];
        for(int i=1;i<array.length;i++){
            tempMax = Math.max(array[i],tempMax+array[i]);
            max = Math.max(max,tempMax);
        }
        return max;
    }

  static int circularSubarraySum(int a[], int n) {
        if(n==0){
            return -1;
        }
        int maxSubarray = kadane(a);
        if(maxSubarray<0){
          return maxSubarray;
        }
        int sum=0;
        for(int i=0;i<n;i++){
          sum+=a[i];
          a[i]=-a[i];
        }
        int negativeMaxSubarray = kadane(a);
        negativeMaxSubarray+=sum;
        return Math.max(negativeMaxSubarray,maxSubarray);
    }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of elements");
    Integer number = Integer.valueOf(br.readLine());
    int[] array = new int[number];
    System.out.println("Enter the elements");
    String[] stringArray = br.readLine().split(" ");
    for(int i=0;i<stringArray.length;i++){
      array[i] = Integer.valueOf(stringArray[i]);
    }
    System.out.println("The maximum circular subarray sum is "+circularSubarraySum(array,number));
  }
}

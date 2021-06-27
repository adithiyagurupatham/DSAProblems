/**
Proram to find the maximum circuar subarray sum
Link : https://practice.geeksforgeeks.org/problems/max-circular-subarray-sum-1587115620/1/?track=DSASP-Arrays&batchId=154
Time Complexity : O(N^2)
Space Complexity : O(1)
*/
import java.io.*;
public class MaximumCircularSubarraySumNormal{

  static int circularSubarraySum(int a[], int n) {
        if(n==0){
            return -1;
        }
        int max = a[0];
        for(int i=0;i<n;i++){
            int currSum=a[i],tempMax=a[i];
            for(int j=1;j<n;j++){
                int pos = (i+j)%n;
                currSum+=a[pos];
                tempMax=Math.max(currSum,tempMax);
            }
            max = Math.max(max,tempMax);
        }
        return max;
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

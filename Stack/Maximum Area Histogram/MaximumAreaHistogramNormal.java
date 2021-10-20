/**
Program to find the maximum area of the histogram
Link : https://practice.geeksforgeeks.org/problems/maximum-rectangular-area-in-a-histogram-1587115620/1/
Time Complexity : O(N^2)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class MaximumAreaHistogramNormal{

  static long getMaxArea(long arr[], int n)
    {
        long ans =0;
        for(int i=0;i<n;i++){
            long curr = arr[i];
            for(int j=i-1;j>=0;j--){
                if(arr[i] <=arr[j])
                    curr+=arr[i];
                else
                    break;
            }
            for(int j=i+1;j<n;j++){
                if(arr[i] <=arr[j])
                    curr+=arr[i];
                else
                    break;
            }
            ans = Math.max(ans,curr);
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
    System.out.println("The maximum area is "+getMaxArea(array,number));
  }
}

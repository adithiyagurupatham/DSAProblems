/**
program to find the triplet count whose sum is less than X
Link : https://practice.geeksforgeeks.org/problems/count-triplets-with-sum-smaller-than-x5549/1
Time Complexity : O(N^3)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class TripletCountLesserThanXNormal{

  static int countTriplets(int arr[], int n,int sum)
    {
      int ans=0;
     for(int i=0;i<n;i++)
     {
         for(int j=i+1;j<n;j++)
         {
             for(int k=j+1;k<n;k++)
             {
                 if(arr[i]+arr[j]+arr[k]<sum){
                     ans++;
                 }
             }
         }
     }
     return ans;
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
    System.out.println("Enter the sum");
    Integer sum = Integer.valueOf(br.readLine());
    System.out.println("The count is "+countTriplets(array,size,sum));
  }
}

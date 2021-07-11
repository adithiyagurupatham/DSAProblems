/**
Program to find the minimum number of platforms so that no train is delayed
Link : https://practice.geeksforgeeks.org/problems/minimum-platforms-1587115620/1#
Time Complexity : O(NlogN)
Space Complexity : O(1)
*/
import java.io.*;
import java.util.*;
public class MinimumPlatformsOptimal{
  static int findPlatform(int arr[], int dep[], int n){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int reqPlatforms=1,maxPlatforms=1;
        for(int i=1,j=0;(i<n&&j<n);){
            if(arr[i]<=dep[j]){
                reqPlatforms++;
                maxPlatforms = Math.max(reqPlatforms,maxPlatforms);
                i++;
            }
            else{
                reqPlatforms--;
                maxPlatforms = Math.max(reqPlatforms,maxPlatforms);
                j++;
            }
        }
        return maxPlatforms;
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input size");
    Integer size = Integer.valueOf(br.readLine());
    int[] arrival = new int[size];
    System.out.println("Enter the arrival timings");
    String[] inputString = br.readLine().split(" ");
    for(int i=0;i<size;i++){
      arrival[i] = Integer.valueOf(inputString[i]);
    }
    int[] departure = new int[size];
    System.out.println("Enter the departure timings");
    inputString = br.readLine().split(" ");
    for(int i=0;i<size;i++){
      departure[i] = Integer.valueOf(inputString[i]);
    }
    System.out.println("The required minimum number of platforms is "+findPlatform(arrival,departure,size));
  }
}

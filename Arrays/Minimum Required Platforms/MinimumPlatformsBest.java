/**
Program to find the minimum number of platforms so that no train is delayed
Link : https://practice.geeksforgeeks.org/problems/minimum-platforms-1587115620/1#
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.*;
public class MinimumPlatformsBest{
  static int findPlatform(int arr[], int dep[], int n){
    int[] platform = new int[2361];
    int requiredPlatform = 1;

    for(int i = 0; i < n; i++)
    {
      ++platform[arr[i]];
      --platform[dep[i] + 1];
    }

    for(int i = 1; i < 2361; i++)
    {
    platform[i] = platform[i] +
                  platform[i - 1];
    requiredPlatform = Math.max(requiredPlatform,
                                platform[i]);
    }
  return requiredPlatform;
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

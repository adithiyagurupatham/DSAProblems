/**
Program to find the minimum number of platforms so that no train is delayed
Link : https://practice.geeksforgeeks.org/problems/minimum-platforms-1587115620/1#
Time Complexity : O(N^2)
Space Complexity : O(1)
*/
import java.io.*;
public class MinimumPlatformsNormal{
  static int findPlatform(int arr[], int dep[], int n){
    int plat_needed = 1, result = 1;
        int i = 1, j = 0;
        for (i = 0; i < n; i++) {
            plat_needed = 1;
            for (j = i + 1; j < n; j++) {
                if ((arr[i] >= arr[j] && arr[i] <= dep[j])
                    || (arr[j] >= arr[i]
                        && arr[j] <= dep[i]))
                    plat_needed++;
            }
            result = Math.max(result, plat_needed);
        }
        return result;
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

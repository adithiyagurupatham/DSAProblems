/**
Program to find the amount of rain water which can be trapped
Link : https://leetcode.com/problems/trapping-rain-water/
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.*;
public class TrapRainWaterOptimal{
  static int trap(int[] height) {
        int res=0,n=height.length;
        if(n==0){
            return 0;
        }
        int[] lMax = new int[n];
        int[] rMax = new int[n];
        lMax[0] = height[0];
        for(int i=1;i<n;i++){
            lMax[i] = Math.max(height[i],lMax[i-1]);
        }
        rMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rMax[i] = Math.max(height[i],rMax[i+1]);
        }
        for(int i=1;i<height.length-1;i++){
            res+=Math.min(lMax[i],rMax[i])-height[i];
        }
        return res;
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
    System.out.println("The maximum amount of rain that can be trapped is "+trap(array));
  }
}

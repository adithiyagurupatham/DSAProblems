/**
Program to find the amount of rain water which can be trapped
Link : https://leetcode.com/problems/trapping-rain-water/
Time Complexity : O(N^2)
Space Complexity : O(1)
*/
import java.io.*;
public class TrapRainWaterNormal{
  static int trap(int[] height) {
        int res=0;
        for(int i=1;i<height.length-1;i++){
            int lMax=height[i];
            for(int j=0;j<i;j++){
                if(height[j]>lMax){
                    lMax=height[j];
                }
            }
            int rMax=height[i];
            for(int j=i+1;j<height.length;j++){
                if(height[j]>rMax){
                    rMax=height[j];
                }
            }
            res+=Math.min(lMax,rMax)-height[i];
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

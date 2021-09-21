/**
Program to find the maximum number of candies that can be stored between any two racks
Link : https://practice.geeksforgeeks.org/problems/10471201e923a0b88a0c1482e6c7e8cc6fdfe93a/1#
Time Complexity : O(N^2)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class DamOfCandiesNormal{
  static int maxCandy(int height[], int n)
	{
	    int ans=0;
	    for(int i=0;i<n;i++){
	        for(int j=i+1;j<n;j++){
	            ans=Math.max(ans,(j-i-1)*(Math.min(height[i],height[j])));
	        }
	    }
	    return ans;
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
    System.out.println("The maximum number of candied that can be stored is "+
                      maxCandy(array, number));
  }
}

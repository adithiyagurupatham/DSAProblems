/**
Program to find the valid sum pair count greater than 0
Link : https://practice.geeksforgeeks.org/problems/3b76f77c1b2107f809b1875aa9fe929ce320be97/1#
Time Complexity : O(N^2)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class ValidPairSumCountNormal{


    static long validPairCount(int a[], int n)
	{
	    // Your code goes here
      long ans=0;
	    for(int i=0;i<n;i++)
	    {
	        for(int j=i+1;j<n;j++)
	        {
	            if((a[i] + a[j])>0)
	                ans++;
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
    System.out.println("The total valid sum count pair is  "+
                      validPairCount(array, number));
  }
}

/**
Program to find all the pairs having both negative and positive values of a number in the array
Link : https://practice.geeksforgeeks.org/problems/positive-negative-pair5209/1/
Time Complexity : O(N^2)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.lang.Math;
public class NegativePositivePairNormal{

  static ArrayList<Integer> findPairs(int arr[], int n)
    {
    	ArrayList<Integer> ans = new ArrayList<>();
    	for(int i=0;i<n;i++){
    	    int ele = Math.abs(arr[i]);
    	    for(int j=0;j<i;j++){
    	        if(Math.abs(arr[j])==ele){
    	            ans.add(-ele);
    	            ans.add(ele);
    	        }
    	    }
    	}
    	return ans;
    }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of elements");
    Integer size = Integer.valueOf(br.readLine());
    int[] array = new int[size];
    System.out.println("Enter the elements");
    String[] stringArray = br.readLine().split(" ");
    for(int i=0;i<stringArray.length;i++){
      array[i] = Integer.valueOf(stringArray[i]);
    }
    System.out.println("The pairs are "
          + findPairs(array,size));

  }

}

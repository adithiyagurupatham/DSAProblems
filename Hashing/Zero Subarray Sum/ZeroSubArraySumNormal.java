/**
Program to check if subarray sum equals zero or not
Link : https://practice.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1/
Time Complexity : O(N^2)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
public class ZeroSubArraySumNormal{

  static boolean zeroSubArraySumExist(int arr[], int n) {
      for(int i=0;i<n;i++){
        int currSum=0;
        for(int j=i;j<n;j++){
            currSum+=arr[j];
            if(currSum==0){
              return true;
            }
        }
      }
      return false;
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
    System.out.println("The zero subarray sum existence status is "
          +zeroSubArraySumExist(array, size));

  }

}

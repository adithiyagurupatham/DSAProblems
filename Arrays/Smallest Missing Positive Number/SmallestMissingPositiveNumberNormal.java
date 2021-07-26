/**
Program to find the smallest missing positive number
Link : https://practice.geeksforgeeks.org/problems/smallest-positive-missing-number-1587115621/1
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
public class SmallestMissingPositiveNumberNormal{
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        Set<Integer> ans = new HashSet<>();
        for(int each : arr){
            ans.add(each);
        }
        for(int i=1;;i++){
            if(!ans.contains(i))
                return i;
        }
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
    System.out.println("The missing smallest positive number is "+missingNumber(array,size));
  }
}

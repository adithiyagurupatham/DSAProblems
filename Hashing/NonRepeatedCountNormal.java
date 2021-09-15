/**
Program to find the count of non - repeating elements in the given array
Link : https://practice.geeksforgeeks.org/problems/count-distinct-elements-1587115620/1/
Time Complexity : O(N^2)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;
public class NonRepeatedCountNormal{

  static long countNonRepeated(int arr[], int n)
    {
        long ans=0;
        for(int i=0;i<n;i++){
            boolean flag = false;
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                if(arr[i]==arr[j]){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                ans++;
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
    System.out.println("The distinct element count is "+countNonRepeated(array, size));

  }

}

/**
Program to check if the given subarray sum exists or not
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
public class SubArraySumExistenceNormal{

  static boolean isSubArraySumPresent(int arr[], int n,int sum) {
      for(int i=0;i<n;i++){
        int currSum=0;
        for(int j=i;j<n;j++){
            currSum+=arr[j];
            if(currSum==sum){
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
    System.out.println("Enter the sum which need to be checked");
    Integer sum = Integer.valueOf(br.readLine());
    System.out.println("The zero subarray sum existence status is "
          +isSubArraySumPresent(array, size,sum));

  }

}

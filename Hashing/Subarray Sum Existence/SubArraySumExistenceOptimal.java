/**
Program to check if the given subarray sum exists or not
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
public class SubArraySumExistenceOptimal{

  static boolean isSubArraySumPresent(int arr[], int n,int sum) {
    Set<Integer> set = new HashSet<>();
      int curr=0;
      set.add(curr);
      for(int each : arr){
          curr+=each;
          if(set.contains(curr-sum)){
              return true;
          }
          set.add(curr);
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

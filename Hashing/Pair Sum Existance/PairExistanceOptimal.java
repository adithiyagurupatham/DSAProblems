/**
Program to find if teh given sum pair exists in the given array
Link : https://practice.geeksforgeeks.org/problems/hashing-for-pair-1/1/
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
public class PairExistanceOptimal{

  static boolean sumExists(int arr[], int N, int sum) {

    Set<Integer> set = new HashSet<>();
    for(int each : arr){
        if(set.contains(sum-each)){
            return true;
        }
        set.add(each);
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
    System.out.println("Enter the sum value");
    Integer sum = Integer.valueOf(br.readLine());
    System.out.println("The pair existence status is "+sumExists(array, size,sum));

  }

}

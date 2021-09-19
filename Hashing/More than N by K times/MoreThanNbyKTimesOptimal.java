/**
Program to sort the elements based on the frequency
Link : https://practice.geeksforgeeks.org/problems/sorting-elements-of-an-array-by-frequency-1587115621/1/
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
public class MoreThanNbyKTimesOptimal{

  static ArrayList<Integer> findElements(int arr[], int n,int k)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer each : arr){
          map.merge(each,1,Integer :: sum);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
          if(entry.getValue()>(n/k)){
            ans.add(entry.getKey());
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
    System.out.println("Enter the value of k");
    Integer k = Integer.valueOf(br.readLine());
    System.out.println("The elements which satisfies the condition are "
          + findElements(array, size,k));

  }

}

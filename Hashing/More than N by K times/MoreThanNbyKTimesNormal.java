/**
Program to sort the elements based on the frequency
Link : https://practice.geeksforgeeks.org/problems/sorting-elements-of-an-array-by-frequency-1587115621/1/
Time Complexity : O(NlogN)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
public class MoreThanNbyKTimesNormal{

  static ArrayList<Integer> findElements(int arr[], int n,int k)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(arr);
        int count=1,i=1;
        while (i<n) {
          while(i<n && arr[i-1]==arr[i]){
            count++;
            i++;
          }
          if(count>(n/k)){
            ans.add(arr[i-1]);
          }
          count=1;
          i++;
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

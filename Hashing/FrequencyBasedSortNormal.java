/**
Program to sort the elements based on the frequency
Link : https://practice.geeksforgeeks.org/problems/sorting-elements-of-an-array-by-frequency-1587115621/1/
Time Complexity : O(NlogN)
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
public class FrequencyBasedSortNormal{

  static ArrayList<Integer> sortByFreq(int arr[], int n)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int each : arr){
            map.merge(each,1,Integer :: sum);
        }
        Integer[] brr = Arrays.stream(arr).boxed().toArray(Integer[] :: new);
        Arrays.sort(brr,(a,b)->{
           int f1 = map.get(a);
           int f2 = map.get(b);
           if(f1!=f2){
               return f2-f1;
           }
           return a-b;
        });
        for(Integer each : brr){
            ans.add(each);
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
    System.out.println("After sorting based on the frequency "
          + sortByFreq(array, size));

  }

}

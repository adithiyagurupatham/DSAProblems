/**
Program to find the count of distinct elements in window of size k
Link : https://practice.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class DistinctElementWindowOptimal{

  static ArrayList<Integer> countDistinct(int arr[], int n, int k)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<k;i++){
            map.merge(arr[i],1,Integer::sum);
        }
        ans.add(map.keySet().size());
        for(int i=k;i<n;i++){
            map.merge(arr[i],1,Integer::sum);
            if(map.containsKey(arr[i-k])){
                map.put(arr[i-k],map.get(arr[i-k])-1);
            }
            if(map.containsKey(arr[i-k]) && map.get(arr[i-k])==0){
                map.remove(arr[i-k]);
            }
            ans.add(map.keySet().size());
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
    System.out.println("The distinct elements count are "
          + countDistinct(array,size,k));

  }

}

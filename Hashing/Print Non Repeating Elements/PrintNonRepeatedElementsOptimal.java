/**
Program to print the non - repeating elements in the given array
Link : https://practice.geeksforgeeks.org/problems/print-distinct-elements-1587115620/1/
Time Complexity : O(N^2)
Space Complexity : O(N)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashMap;
public class PrintNonRepeatedElementsOptimal{

  static ArrayList<Integer> printNonRepeated(int arr[], int n)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int each : arr){
            map.merge(each,1,Integer::sum);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
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
    System.out.println("The distinct element count is "+printNonRepeated(array, size));

  }

}

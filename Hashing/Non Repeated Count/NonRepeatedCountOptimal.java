/**
Program to find the count of non - repeating elements in the given array
Link : https://practice.geeksforgeeks.org/problems/count-distinct-elements-1587115620/1/
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class NonRepeatedCountOptimal{

  static long countNonRepeated(int arr[], int n)
    {
        long ans=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer each : arr){
            map.merge(each,1,Integer :: sum);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
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

/**
Program to print the index of the first occuring min index element in the given array
Link : https://practice.geeksforgeeks.org/problems/first-repeating-element4018/1/
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class FirstRepeatingElementOptimal{

  public static int firstRepeated(int[] arr, int n) {
        Map<Integer,Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i]) && map.get(arr[i])<min){
                min = map.get(arr[i]);
            }
            map.put(arr[i],i);
        }

        return (min==Integer.MAX_VALUE)?-1:min+1;
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
    System.out.println("The distinct element count is "+firstRepeated(array, size));

  }

}

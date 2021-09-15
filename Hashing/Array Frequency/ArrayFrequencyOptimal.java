/**
Program to print the frequency of the all the  elements in the given array
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class ArrayFrequencyOptimal{

  public static void printArrayFrequency(int[] arr, int n) {
      Map<Integer,Integer> map = new HashMap<>();
      for(int each : arr){
        map.merge(each,1,Integer :: sum);
      }
      for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        System.out.println(entry.getKey()+" : "+entry.getValue());
      }
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
    printArrayFrequency(array,size);
  }

}

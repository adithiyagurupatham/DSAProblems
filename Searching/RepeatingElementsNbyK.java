/**
Program to find the element count  that occur more than N/k times
Link : https://practice.geeksforgeeks.org/problems/count-element-occurences/1/
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;
public class RepeatingElementsNbyK{
  static int countOccurence(int[] arr, int n, int k)
  {
      int count=0;
      Map<Integer,Integer> hashMap = new HashMap<>();
      for(int each : arr){
          hashMap.merge(each,1,Integer::sum);
      }
      int exp = n/k;
      for(Map.Entry<Integer,Integer> entry : hashMap.entrySet()){
          if(entry.getValue()>exp)
          {
              count++;
          }
      }
      return count;
  }
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the  input size");
    Integer size = Integer.valueOf(br.readLine());
    int[] array = new int[size];
    System.out.println("Enter the elements");
    String[] inputString = br.readLine().split(" ");
    for(int i=0;i<size;i++){
      array[i] = Integer.valueOf(inputString[i]);
    }
    System.out.println("Enter the  value of k");
    Integer k = Integer.valueOf(br.readLine());
    System.out.println("The repeating elements count is "+countOccurence(array,size,k));
  }
}

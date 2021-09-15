/**
Program to print the frequency of the all the  elements in the given array
Time Complexity : O(N^2)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class ArrayFrequencyNormal{

  public static void printArrayFrequency(int[] arr, int n) {
      for(int i=0;i<n;i++){
        boolean flag = false;
        for(int j=0;j<i;j++){
          if(arr[i]==arr[j]){
            flag = true;
            break;
          }
        }
        if(flag){
          continue;
        }
        int count=1;
        for(int j=i+1;j<n;j++){
          if(arr[i]==arr[j]){
            count++;
          }
        }
        System.out.println(arr[i]+" : "+count);
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

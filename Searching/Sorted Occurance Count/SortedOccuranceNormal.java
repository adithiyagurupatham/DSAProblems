/**
Program to find the total occurance of the given value in sorted array
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class SortedOccuranceNormal{

  static int findTotalOccurance(int[] array,int val){
    int count=0;
    for(int i=0;i<array.length;i++){
      if(array[i]==val){
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input size");
    Integer size = Integer.valueOf(br.readLine());
    int[] array = new int[size];
    System.out.println("Enter the elements");
    String[] inputString = br.readLine().split(" ");
    for(int i=0;i<size;i++){
      array[i] = Integer.valueOf(inputString[i]);
    }
    System.out.println("Enter the value to be searched");
    Integer value = Integer.valueOf(br.readLine());
    System.out.println("The total occurance of the value is "+findTotalOccurance(array,value));
  }
}

/**
Program to find the last index of the given value in sorted array
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class SortedLastOccuranceNormal{

  static int findValue(int[] array,int val){
    for(int i=array.length-1;i>=0;i--){
      if(array[i]==val){
        return i;
      }
    }
    return -1;
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
    System.out.println("The index of the last occured value is "+findValue(array,value));
  }
}

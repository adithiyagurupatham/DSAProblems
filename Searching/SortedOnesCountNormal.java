/**
Program to count the number of 1's in sorted binary array
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class SortedOnesCountNormal{

  static int getOnesCount(int[] array){
    int counter=0;
    for(int i=array.length-1;i>=0;i--){
      if(array[i]==0){
        break;
      }
      counter++;
    }
    return counter;
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
    System.out.println("The one's count is "+getOnesCount(array));
  }
}

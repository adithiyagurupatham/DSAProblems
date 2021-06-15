/**
Program to move zeroes to right end
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.*;
public class MoveZeroesToEndOptimal{

  static void swap(int[] array,int source,int destination){
    int temp = array[source];
    array[source]=array[destination];
    array[destination]=temp;
  }

  static void moveZeroes(int[] array){
    for(int i=0,ptr=0;i<array.length;i++){
      if(array[i]!=0){
        swap(array,i,ptr);
        ptr++;
      }
    }
  }
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of elements");
    Integer number = Integer.valueOf(br.readLine());
    int[] array = new int[number];
    System.out.println("Enter the elements");
    String[] stringArray = br.readLine().split(" ");
    for(int i=0;i<stringArray.length;i++){
      array[i] = Integer.valueOf(stringArray[i]);
    }
    moveZeroes(array);
    System.out.println("Post movement the updated values are");
    for(int i=0;i<number;i++){
      System.out.print(array[i]+" ");
    }
    System.out.println();
  }
}

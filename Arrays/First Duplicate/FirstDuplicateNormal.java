/**
Program to find the first repeating duplicate number of the given array
Complexity : O(N^2)
*/
import java.io.*;
public class FirstDuplicateNormal{

  static int getFirstDuplicateElement(int[] array){
    int min_index = array.length;
    for(int i=0;i<array.length;i++){
      for(int j=i+1;j<array.length;j++){
        if(array[i]==array[j] && j<min_index){
          min_index=j;
        }
      }
    }
    if(min_index==array.length){
      return -1;
    }
    return array[min_index];
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
    long startTime = System.nanoTime();
    System.out.println("start time is "+startTime);
    System.out.println("The first duplicate element occurance is "+getFirstDuplicateElement(array));
    long endTime = System.nanoTime();
    System.out.println("end time is "+endTime);
    System.out.println("The execution time is "+(endTime-startTime));
  }

}

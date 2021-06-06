/**
Program to find the first repeating duplicate number of the given array
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.*;
import java.util.*;
public class FirstDuplicateUsingSet{

  static int getFirstDuplicateElement(int[] array){
    Set<Integer> hashSet = new HashSet<>();
    for(int i=0;i<array.length;i++){
      if(hashSet.contains(array[i])){
        return array[i];
      }
      hashSet.add(array[i]);
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
    long startTime = System.nanoTime();
    System.out.println("The first duplicate element occurance is "+getFirstDuplicateElement(array));
    long endTime = System.nanoTime();
    System.out.println("The execution time is "+(endTime-startTime));
  }

}

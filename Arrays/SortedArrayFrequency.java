/**
Program to print the frequencies of the sorted array
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.*;
public class SortedArrayFrequency{
  static void printFrequency(int[] array){
    int count=1,n=array.length;
    for(int i=0;i<n;i++){
      while((i<n-1) && (array[i] == array[i+1])){
        count++;
        i++;
      }
      System.out.println(array[i]+" : "+count);
      count=1;
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
    System.out.println("The frequencies of sorted array are ");
    printFrequency(array);
  }
}

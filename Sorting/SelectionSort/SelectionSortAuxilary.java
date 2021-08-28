/**
To perform selection sort for the given array
Space Complexity : O(n)
Time Complexity : O(n*n)
*/
import java.io.*;
public class SelectionSortAuxilary{

  static int getMinimum(int[] array){
    int min=Integer.MAX_VALUE,index=0;
    for(int i=0;i<array.length;i++){
      if(array[i]<min){
        min=array[i];
        index=i;
      }
    }
    array[index]=Integer.MAX_VALUE;
    return min;
  }

  static void sort(int[] array){
    int[] auxilary = new int[array.length];
    for(int i=0;i<array.length;i++){
      auxilary[i]=getMinimum(array);
    }
    for(int i=0;i<auxilary.length;i++){
      array[i]=auxilary[i];
    }
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
    sort(array);
    System.out.println("After the sorting ");
    for(int i=0;i<array.length;i++){
      System.out.print(array[i]+" ");
    }
    System.out.println();

  }

}

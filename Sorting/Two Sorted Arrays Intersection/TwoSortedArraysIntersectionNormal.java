/**
Program to print the intersection of two sorted arrays
Time Complexity : (m*n)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class TwoSortedArraysIntersectionNormal{

  static void printIntersection(int[] array,int[] array1){
    for(int i=0;i<array.length;i++){
      if(i>0 && array[i]==array[i-1]){
        continue;
      }
      for(int j=0;j<array1.length;j++){
        if(array[i]==array1[j]){
          System.out.print(array[i]+" ");
          break;
        }
      }
    }
    System.out.println();
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the first array input size");
    Integer size = Integer.valueOf(br.readLine());
    int[] array = new int[size];
    System.out.println("Enter the elements");
    String[] inputString = br.readLine().split(" ");
    for(int i=0;i<size;i++){
      array[i] = Integer.valueOf(inputString[i]);
    }
    System.out.println("Enter the second array input size");
    Integer size1 = Integer.valueOf(br.readLine());
    int[] array1 = new int[size1];
    System.out.println("Enter the elements");
    inputString = br.readLine().split(" ");
    for(int i=0;i<size1;i++){
      array1[i] = Integer.valueOf(inputString[i]);
    }
    System.out.println("The intersection of two sorted arrays are ");
    printIntersection(array, array1);
  }
}

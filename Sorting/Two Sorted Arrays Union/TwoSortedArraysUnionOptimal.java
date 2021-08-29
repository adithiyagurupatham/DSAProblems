/**
Program to print the union of two sorted arrays
Time Complexity : (m+n)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class TwoSortedArraysUnionOptimal{

  static void printUnion(int[] arr1,int[] arr2){
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            if(i>0 && arr1[i]==arr1[i-1]){
                i++;
                continue;
            }
            if(j>0 && arr2[j]==arr2[j-1]){
                j++;
                continue;
            }
            if(arr1[i]<arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
            }
            else if (arr1[i]>arr2[j]){
                System.out.print(arr2[j]+" ");
                j++;
            }
            else{
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
        }
        while(i<arr1.length){
            if(i>0 && arr1[i]==arr1[i-1]){
                i++;
                continue;
            }
            else{
               System.out.print(arr1[i]+" ");
                i++;
            }
        }
        while(j<arr2.length){
            if(j>0 && arr2[j]==arr2[j-1]){
                j++;
                continue;
            }
            else{
               System.out.print(arr2[j]+" ");
                j++;
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
    System.out.println("The union of two sorted arrays are ");
    printUnion(array, array1);
  }
}

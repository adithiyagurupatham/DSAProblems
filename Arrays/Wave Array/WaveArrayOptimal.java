/**
Program to modify array in wave pattern
Link : https://practice.geeksforgeeks.org/problems/wave-array-1587115621/
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.util.*;
import java.io.*;
public class WaveArrayOptimal{
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void convertToWave(int arr[], int n){
        for(int i=0;i<n-1;i+=2){
            if(i>0 && arr[i]<arr[i-1])
                swap(arr,i,i-1);

            if(i<n-1 && arr[i]<arr[i+1])
                swap(arr,i,i+1);
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
    convertToWave(array,array.length);
    System.out.println("Post transformation array is ");
    for(int i=0;i<size;i++){
      System.out.print(array[i]+" ");
    }
    System.out.println();
  }
}

/**
Program to modify array in wave pattern
Link : https://practice.geeksforgeeks.org/problems/wave-array-1587115621/
Time Complexity : O(logN)
Space Complexity : O(1)
*/
import java.util.*;
import java.io.*;
public class WaveArrayNormal{
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void convertToWave(int arr[], int n){
        Arrays.sort(arr);
        for(int i=0,temp=0;i<n/2;i++,temp+=2){
            swap(arr,temp,temp+1);
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

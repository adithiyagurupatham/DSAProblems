/**
Link : https://practice.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620
Time Complexity : O(N^2)
Space Complexity : O(N)
*/
import java.io.*;
public class FrequencyCountNormal{

  static void frequencyCount(int arr[], int N, int P){
    int[] temp = new int[N];
    for(int i=1;i<=N;i++){
      int counter=0;
      for(int each : arr){
        if(each ==i){
          counter++;
        }
      }
      temp[i-1]=counter;
    }
    for(int i=0;i<N;i++){
      arr[i]=temp[i];
    }
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input size");
    Integer size = Integer.valueOf(br.readLine());
    int[] array = new int[size];
    System.out.println("Enter the value of P");
    Integer P = Integer.valueOf(br.readLine());
    System.out.println("Enter the elements");
    String[] inputString = br.readLine().split(" ");
    for(int i=0;i<size;i++){
      array[i] = Integer.valueOf(inputString[i]);
    }
    frequencyCount(array,size,P);
    System.out.println("Post transformation array is ");
    for(int i=0;i<size;i++){
      System.out.print(array[i]+" ");
    }
    System.out.println();
  }
}

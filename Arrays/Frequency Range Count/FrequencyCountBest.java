/**
Link : https://practice.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class FrequencyCountBest{

  static void frequencyCount(int arr[], int N, int P){
    int i=0;
       while(i<N){
           if(arr[i]<=0){
               i++;
               continue;
           }
           if(arr[i]>N){
               arr[i]=0;
               i++;
               continue;
           }
           int exp = arr[i]-1;
           if(arr[exp]<=0){
               arr[exp]--;
               arr[i]=0;
               i++;
           }
           else{
               arr[i]= arr[exp];
               arr[exp]=-1;
           }
       }
       for(int k=0;k<N;k++){
           arr[k]= Math.abs(arr[k]);
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

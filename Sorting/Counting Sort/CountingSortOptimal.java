/**
Program to perform counting sort
Time Complexity : O(k+N)
Space Complexity : O(k+N)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class CountingSortOptimal{


    static void sort(int arr[], int n,int k)
    {
      int[] count = new int[k];
      for(int i=0;i<n;i++){
        count[arr[i]]++;
      }
      for(int i=1;i<k;i++){
        count[i]+=count[i-1];
      }
      int[] output = new int[n];
      for(int i=n-1;i>=0;i--){
        output[count[arr[i]]-1] =arr[i];
        count[arr[i]]--;
      }
      for(int i=0;i<n;i++){
        arr[i] = output[i];
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
      System.out.println("Enter the k value");
      Integer k = Integer.valueOf(br.readLine());
      sort(array,size,k);
      System.out.println("After sorting");
      for(int i=0;i<size;i++){
        System.out.print(array[i]+" ");
      }
      System.out.println();
    }
}

/**
Program to perform counting sort
Time Complexity : O(k+N)
Space Complexity : O(k+N)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class CountingSortNormal{


    static void sort(int arr[], int n,int k)
    {
      int[] count = new int[k];
      for(int i=0;i<n;i++){
        count[arr[i]]++;
      }
      int idx=0;
      for(int i=0;i<k;i++){
        for(int j=0;j<count[i];j++){
          arr[idx++]=i;
        }
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

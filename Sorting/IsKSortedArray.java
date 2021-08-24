/**
Program to check if the given array is k - positions away from complete sorted
Time Complexity : O(NlogN)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class IsKSortedArray{
  static String isKSortedArray(int arr[], int n, int k)
    {
        int[] aux = new int[n];
        for(int i=0;i<n;i++){
            aux[i] = arr[i];
        }
        Arrays.sort(aux);
        for(int i=0;i<n;i++){
            int j = Arrays.binarySearch(aux,arr[i]);
            if(Math.abs(i-j)>k){
                return "No";
            }
        }
        return "Yes";
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
    System.out.println("Enter the value of k");
    Integer k = Integer.valueOf(br.readLine());
    System.out.println("is the array k sorted "+isKSortedArray(array, size, k));
  }
}

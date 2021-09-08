/**
Program to check if there is a triplet zero sum exist or not
Link : https://practice.geeksforgeeks.org/problems/find-triplets-with-zero-sum/1/
Time Complexity : O(N^3)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class TripletZeroSumOptimal{

  static boolean isExist(int[] arr,int start,int end,int x){
        while(start<end){
            int val = arr[start]+arr[end];
            if(val==x){
                return true;
            }
            else if(val>x){
                end--;
            }
            else{
                start++;
            }
        }
        return false;
    }

  public static boolean findTriplets(int array[], int n)
  {

    Arrays.sort(array);
      for(int i=0;i<n-2;i++){
          if(isExist(array,i+1,n-1,0-array[i])){
              return true;
          }
      }
      return false;
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
      System.out.println("The zero triplet sum status is "+findTriplets(array, size));
    }
}

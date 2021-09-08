/**
Program to check if there is a triplet zero sum exist or not
Link : https://practice.geeksforgeeks.org/problems/find-triplets-with-zero-sum/1/
Time Complexity : O(N^2)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TripletZeroSumNormal{

  public static boolean findTriplets(int array[], int n)
  {

      for(int i=0;i<n-2;i++){
        for(int j=i+1;j<n-1;j++){
          for(int k=j+1;k<n;k++){
            if((array[i]+array[j]+array[k])==0){
              return true;
            }
          }
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

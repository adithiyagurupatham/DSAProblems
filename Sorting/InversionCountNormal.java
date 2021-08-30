/**
Program to find the inversion count int the given array
A pair is considered as an inversion if i<j and arr[i]>arr[j]
Time Complexity : O(N^2)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class InversionCountNormal{

  static int getInversionCount(int[] array){
    int ans=0;
    for(int i=0;i<array.length-1;i++){
      for(int j=i+1;j<array.length;j++){
        if(array[i]>array[j]){
          ans++;
        }
      }
    }
    return ans;
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
    System.out.println("The total inversion count is "+getInversionCount(array));
  }
}

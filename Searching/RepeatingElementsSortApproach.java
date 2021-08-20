/**
Program to find the repeating element in the array
Time Complexity : O(NlogN)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class RepeatingElementsSortApproach{
  static int findRepeating(int[] array){
    int ans =-1;
    Arrays.sort(array);
    for(int i=0;i<array.length-1;i++){
      if(array[i]==array[i+1]){
        return array[i];
      }
    }
    return ans;
  }
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the  input size");
    Integer size = Integer.valueOf(br.readLine());
    int[] array = new int[size];
    System.out.println("Enter the elements");
    String[] inputString = br.readLine().split(" ");
    for(int i=0;i<size;i++){
      array[i] = Integer.valueOf(inputString[i]);
    }
    System.out.println("The repeating element is "+findRepeating(array));
  }
}

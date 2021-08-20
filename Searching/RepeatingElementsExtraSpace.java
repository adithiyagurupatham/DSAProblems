/**
Program to find the repeating element in the array
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class RepeatingElementsExtraSpace{
  static int findRepeating(int[] array){
    boolean[] answer = new boolean[array.length];
    for(int each : array){
      if(answer[each]){
        return each;
      }
      answer[each] = true;
    }
    return -1;
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

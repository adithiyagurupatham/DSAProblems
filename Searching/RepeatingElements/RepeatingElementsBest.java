/**
Program to find the repeating element in the array in range [1,N-1]
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class RepeatingElementsBest{
  static int findRepeating(int[] array){
    int slow=array[0]+1,fast = array[0]+1;
    do{
      slow = array[slow]+1;
      fast = array[array[fast]+1]+1;
    }while(slow!=fast);
    slow = array[0]+1;
    while(slow!=fast){
      slow = array[slow]+1;
      fast = array[fast]+1;
    }
    return slow-1;
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

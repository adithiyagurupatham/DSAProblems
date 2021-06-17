/**
Pogram to print the leaders of the array
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.*;
public class LeaderOptimized{

  static void printLeaders(int[] array){
    int n = array.length;
    int currentLeader = array[n-1];
    System.out.print(currentLeader+" ");
    for(int i=n-2;i>=0;i--){
      if(currentLeader<array[i]){
        System.out.print(array[i]+" ");
        currentLeader = array[i];
      }
    }
    System.out.println();
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of elements");
    Integer number = Integer.valueOf(br.readLine());
    int[] array = new int[number];
    System.out.println("Enter the elements");
    String[] stringArray = br.readLine().split(" ");
    for(int i=0;i<stringArray.length;i++){
      array[i] = Integer.valueOf(stringArray[i]);
    }
    System.out.println("The leaders of the array are ");
    printLeaders(array);
  }
}

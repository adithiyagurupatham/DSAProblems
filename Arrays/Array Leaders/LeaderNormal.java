/**
Pogram to print the leaders of the array
Time Complexity : O(N^2)
Space Complexity : O(1)
*/
import java.io.*;
public class LeaderNormal{

  static void printLeaders(int[] array){
    for(int i=0;i<array.length;i++){
      boolean flag = false;
      for(int j=i+1;j<array.length;j++){
        if(array[i]<=array[j]){
          flag = true;
          break;
        }
      }
      if(!flag){
        System.out.print(array[i]+" ");
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

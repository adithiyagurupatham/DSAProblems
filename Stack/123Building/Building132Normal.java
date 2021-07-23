/**
Program to find if there exists an 132 sequence
Time Complexity : O(N^3)
Space Complexity : O(1)
*/
import java.io.*;
import java.util.*;
public class Building132Normal{
  static boolean isBuilding(int[] array){
    for(int i=0;i<array.length;i++){
      for(int j=i+1;j<array.length;j++){
        for(int k=j+1;k<array.length;k++){
          if((array[i]<array[k]) && (array[k]>array[j]) && (array[i]<array[j])){
            // System.out.println("i is "+i+" j is "+j+" k is "+k);
            return true;
          }
        }
      }
    }
    return false;
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
    System.out.println("The status of the 132 building is "+isBuilding(array));
  }
}

/**
Program to find if there exists an 132 sequence
Time Complexity : O(N^2)
Space Complexity : O(1)
*/
import java.io.*;
import java.util.*;
public class Building132Optimal{
  static boolean isBuilding(int[] arr,int n){
    int left=arr[0];
        for(int j=1;j<n-1;j++){
            for(int k=j+1;k<n;k++){
                if(arr[k]>left && arr[k]<arr[j]){
                    return true;
                }
            }
            left = Math.min(left,arr[j]);
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
    System.out.println("The status of the 132 building is "+isBuilding(array,array.length));
  }
}

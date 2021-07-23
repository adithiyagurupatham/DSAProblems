/**
Program to find if there exists an 132 sequence
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.*;
import java.util.*;
public class Building132Best{
  static boolean isBuilding(int[] arr,int n){
    int[] minArray = new int[n];
        minArray[0]=arr[0];
        for(int i=1;i<n;i++){
            minArray[i] = Math.min(minArray[i-1],arr[i]);
        }
        Stack<Integer> stack = new Stack<>();
        for(int i=n-1;i>=0;i--){
            if(arr[i]>minArray[i]){
                while(!stack.isEmpty() && stack.peek() <= minArray[i])
                    stack.pop();
                if(!stack.isEmpty() && stack.peek() < arr[i]){
                    return true;
                }
                stack.push(arr[i]);
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
    System.out.println("The status of the 132 building is "+isBuilding(array,array.length));
  }
}

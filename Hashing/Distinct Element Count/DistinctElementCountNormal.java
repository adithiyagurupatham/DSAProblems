/**
Program to find the distince element count in the given array
Time Complexity : O(N^2)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
public class DistinctElementCountNormal{

  static int getDistinctCount(int[] array,int n){
    int ans=0;
    for(int i=0;i<n;i++){
      boolean flag = false;
      for(int j=0;j<i;j++){
        if(array[i]==array[j]){
          flag = true;
          break;
        }
      }
      if(!flag){
        ans++;
      }
    }
    return ans;
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of elements");
    Integer size = Integer.valueOf(br.readLine());
    int[] array = new int[size];
    System.out.println("Enter the elements");
    String[] stringArray = br.readLine().split(" ");
    for(int i=0;i<stringArray.length;i++){
      array[i] = Integer.valueOf(stringArray[i]);
    }
    System.out.println("The distinct element count is "+getDistinctCount(array, size));

  }

}
